package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class adminPage extends ActionCommands {

    WebDriver driver;
    private By adminTab= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
    private By addBtn= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    private By addusrSaveBtn= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    private By usrRoleMsg=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/span");
    private By empNameMsg=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/span");
    private By usernameMsg=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/span");
    private By statusMsg=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/span");
    private By passwordMsg=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/span");
    private By userTableColumn1=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(2)");
    private By userTableColumn2=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(3)");
    private By userTableColumn3=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(4)");
    private By userTableColumn4=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(5)");
    private By userTableColumn5=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(6)");


    public adminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminTab(){
        waitTime(driver,adminTab);
        click(driver,adminTab);
    }

    public void clickAddButtonInUserManagement(){
        waitTime(driver,addBtn);
        click(driver,addBtn);
    }

    public void clickSaveButtonWithoutEnteringAnyDetails(){
        waitTime(driver,addusrSaveBtn);
        click(driver,addusrSaveBtn);
    }

    public void verifyValidationMessagesForRequiredFields(String message){
        waitTime(driver,usrRoleMsg);
        verifyText(driver,usrRoleMsg,message);
        waitTime(driver,empNameMsg);
        verifyText(driver,empNameMsg,message);
        waitTime(driver,usernameMsg);
        verifyText(driver,usernameMsg,message);
        waitTime(driver,statusMsg);
        verifyText(driver,statusMsg,message);
        waitTime(driver,passwordMsg);
        verifyText(driver,passwordMsg,message);
    }

    public void verifyColumnHeadersInUserManagementTable(String col1, String col2, String col3, String col4, String col5){
        waitTime(driver,userTableColumn1);
        verifyText(driver,userTableColumn1,col1);
        waitTime(driver,userTableColumn2);
        verifyText(driver,userTableColumn2,col2);
        waitTime(driver,userTableColumn3);
        verifyText(driver,userTableColumn3,col3);
        waitTime(driver,userTableColumn4);
        verifyText(driver,userTableColumn4,col4);
        waitTime(driver,userTableColumn5);
        verifyText(driver,userTableColumn5,col5);
    }


}
