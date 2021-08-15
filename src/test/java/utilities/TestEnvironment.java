package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestEnvironment {
   public static final Logger LOGGER = LogManager.getLogger(TestEnvironment.class);

    /**
     * This method will select the execution environment based on the user input
     * @retrun
     * @throws java.net.MalformedURLException
     */

    public static WebDriver selectTestExecutionEnvironment() throws MalformedURLException {
        String environment = System.getProperty("environment") == null ? "local" : System.getProperty("environment");
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");

        //
        URL gridURL = new URL(ReadConfigFiles.getPropertyValues("GridURL"));
        WebDriver driver;

        if (environment.equals("remote") && browser.equals("chrome")){
            LOGGER.info("Executing test in remote with Chrome");
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new RemoteWebDriver(gridURL, chromeOptions);
        } else if (environment.equals("remote")&& browser.equals("firefox")){
            LOGGER.info("Executing test in remote with FireFox");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            driver = new RemoteWebDriver(gridURL, firefoxOptions);
        }else if(environment.equals("remote")&& browser.equals("edge")){
            LOGGER.info("Executing test in remote with Edge");
            EdgeOptions edgeOptions = new EdgeOptions();
            driver = new RemoteWebDriver(gridURL, edgeOptions);
        } else {
            LOGGER.info("Executing test in local chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

}
