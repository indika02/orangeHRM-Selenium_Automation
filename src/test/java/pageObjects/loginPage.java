package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class loginPage extends ActionCommands {


    WebDriver driver;
    private By Usernamebox=By.xpath("//input[@name='username']");
    private By passwordbox=By.xpath("//input[@name='password']");
    private By loginbutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    private By footerTxt=By.xpath("//p[contains(@class,'orangehrm-copyright')]");


    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) {
        openurl(driver, URL);
    }

    public void enterUsername(String uname){
        waitTime(driver,Usernamebox);
        type(driver,Usernamebox,uname);
    }

    public void enterPassword(String pwd){
        waitTime(driver,passwordbox);
        type(driver,passwordbox,pwd);
    }

    public void clickLogin(){
        waitTime(driver,loginbutton);
        click(driver,loginbutton);
    }

    public void verifyFooterText(String text){
        waitTime(driver,footerTxt);
        verifyText(driver,footerTxt,text);
    }
}

