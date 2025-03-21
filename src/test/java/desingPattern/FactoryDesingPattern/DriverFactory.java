package desingPattern.FactoryDesingPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getDriver(BrowserType browserType){
        WebDriver driver;
        switch(browserType) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case EDGE:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser type not supported" + browserType);
        }
        return driver;
    }
}
