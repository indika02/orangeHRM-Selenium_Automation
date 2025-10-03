package utillities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void verifyElementPresent(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed: " + locator.toString());
    }

    protected void loginthroughCSV(WebDriver driver,By usernameLocator,By passwordLocator) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader("testdata/data.csv"));
        String[] csvCell;
        reader.readNext();

        while ((csvCell = reader.readNext()) != null) {
            String username = csvCell[0];
            String password = csvCell[1];

            WebElement usernameElement = driver.findElement(usernameLocator);
            usernameElement.sendKeys(username);

            WebElement passwordElement = driver.findElement(passwordLocator);
            passwordElement.sendKeys(password);
        }

        reader.close();
    }

}