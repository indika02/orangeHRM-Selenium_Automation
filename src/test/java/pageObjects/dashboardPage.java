package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class dashboardPage extends ActionCommands {

    WebDriver driver;

    private By usernameIcon=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/p[1]");
    private By logoutBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]");
    private By searchBox=By.xpath("//input[@placeholder='Search']");
    private By tab=By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span");
    private By upgradeBtn=By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div[2]/a/button");
    private By minimizeArrow=By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button");
    private By helpBtn=By.xpath("//button[@title='Help']");

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout(){
        waitTime(driver,usernameIcon);
        click(driver,usernameIcon);
        waitTime(driver,logoutBtn);
        click(driver,logoutBtn);
    }

    public void enterSearchTxt(String text) {
        waitTime(driver,searchBox);
        type(driver,searchBox,text);
    }

    public void verifySeachedTab(String tabName) {
        waitTime(driver,tab);
        verifyText(driver,tab,tabName);
    }

    public void verifyUpgradeOption(){
        waitTime(driver,upgradeBtn);
        verifyText(driver,upgradeBtn,"Upgrade");
    }

    public void minimizeSidenav(){
        waitTime(driver,minimizeArrow);
        click(driver,minimizeArrow);
    }

    public void clickHelpBtn(){
        waitTime(driver,helpBtn);
        click(driver,helpBtn);
    }
}
