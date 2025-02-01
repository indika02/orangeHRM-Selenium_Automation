package utillities;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionCommands {


    protected void openurl(WebDriver driver, String URL) {
        driver.get(URL);
    }

    protected void click(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    protected void type(WebDriver driver, By locator, String input) {
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        } catch (NoSuchElementException e) {
            System.out.println("No such a element " + e.getMessage());
            throw e;
        }
    }

    protected String verifyText(WebDriver driver, By locator, String expectedResults) {
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText(), expectedResults);
        return expectedResults;
    }

    protected void waitTime(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 100000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}