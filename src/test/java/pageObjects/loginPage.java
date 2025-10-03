package pageObjects;

import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

import java.io.IOException;

public class loginPage extends ActionCommands {


    WebDriver driver;
    private By Usernamebox=By.xpath("//input[@name='username']");
    private By passwordbox=By.xpath("//input[@name='password']");
    private By loginbutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    private By footerTxt=By.xpath("//p[contains(@class,'orangehrm-copyright')]");
    private By loginErrorMsg=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    private By forgotPwdLink=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
    private By resetPwdHeading=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6");
    private By usernameFieldValidationMsg=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
    private By passwordFieldValidationMsg=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
    private By loginPageLogo=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) {
        openurl(driver, URL);
    }

    public void login() throws CsvValidationException, IOException {
        waitTime(driver,Usernamebox);
        loginthroughCSV(driver,Usernamebox,passwordbox);
    }

    public void enterUsername(String username){
        waitTime(driver,Usernamebox);
        type(driver,Usernamebox,username);
    }
    public void enterPassword(String password){
        waitTime(driver,passwordbox);
        type(driver,passwordbox,password);
    }

    public void clickLogin(){
        waitTime(driver,loginbutton);
        click(driver,loginbutton);
    }

    public void verifyLoginErrorMessage(String msg) {
        waitTime(driver,loginErrorMsg);
        verifyText(driver,loginErrorMsg,msg);
    }


    public void verifyFooterText(String text){
        waitTime(driver,footerTxt);
        verifyText(driver,footerTxt,text);
    }

    public void clickForgotPasswordLink(){
        waitTime(driver,forgotPwdLink);
        click(driver,forgotPwdLink);
    }

    public void verifyResetPasswordPageHeading(String heading){
        waitTime(driver,resetPwdHeading);
        verifyText(driver,resetPwdHeading,heading);
    }

    public void verifyUsernameValidationMessage(String msg){
        waitTime(driver,usernameFieldValidationMsg);
        verifyText(driver,usernameFieldValidationMsg,msg);
    }

    public void verifyPasswordValidationMessage(String msg){
        waitTime(driver,passwordFieldValidationMsg);
        verifyText(driver,passwordFieldValidationMsg,msg);
    }

    public void verifyLoginPageLogo(){
        waitTime(driver,loginPageLogo);
        verifyElementPresent(driver,loginPageLogo);
    }
    public void closeWindow(){
        driver.close();
    }
}

