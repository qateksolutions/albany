package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.ReadConfigFiles;

public class CalculateRates {
    WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(CalculateRates.class);

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("------------Start Test (CalculateRates) -------------------");
        String url = ReadConfigFiles.getPropertyValues("MortgageCalculatorUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with the URL: " + url);
    }

    @Test
    public void calculateRealApr() {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomeValue("200000")
                .clickDownPaymentInDollar()
                .typeDownPayment("15000")
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");
    }

    @AfterMethod
    public void testCleanUp() {
        ActOn.browser(driver).closeBrowser();
        LOGGER.info("Browser is closed");
        LOGGER.info("==End Test (CalculateRates)==");
    }

}
