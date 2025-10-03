package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver,String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectLocation+"/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");
            options.setHeadless(false);
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.gecko.driver", projectLocation+"/drivers/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");
            options.setHeadless(true);
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.edge.driver", projectLocation+"/drivers/msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");
            options.setHeadless(true);
            driver = new EdgeDriver();
        }else {
            System.out.println("Not support for " + browserName);
        }
        return driver;

    }
}
