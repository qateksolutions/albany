package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_FireFox {
    WebDriver driver;
    URL gridUrl;


    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.qateksolutions.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
