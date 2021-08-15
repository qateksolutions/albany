package listeners;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;
import utilities.TestEnvironment;

import java.net.MalformedURLException;

public class BaseClass {

    public static WebDriver driver;
    Logger LOGGER = LogManager.getLogger(this.getClass().getName());
    String testCaseName = String.format("--------Test: %s--------", this.getClass().getName());
    String endTestCase = String.format("-------- End Test: %s--------", this.getClass().getName());


    @BeforeClass
    public void addThread(){
        ThreadContext.put("threadName", this.getClass().getName());
    }

    @BeforeMethod
    public void openBrowser() throws MalformedURLException {
        String url = ReadConfigFiles.getPropertyValues("Url");
        driver = TestEnvironment.selectTestExecutionEnvironment();
        LOGGER.info(testCaseName);
        LOGGER.debug("Open the URL: " + url);
        ActOn.browser(driver).openBrowser(url);

    }

    @AfterMethod
    public void closeBrowser(){
        ActOn.browser(driver).closeBrowser();
        LOGGER.info(endTestCase);
    }

}
