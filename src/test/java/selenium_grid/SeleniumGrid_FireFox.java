package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_FireFox {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        try{
            gridUrl = new URL("http://18.225.36.10:4444/wd/hub");
        } catch ( Exception e){
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
