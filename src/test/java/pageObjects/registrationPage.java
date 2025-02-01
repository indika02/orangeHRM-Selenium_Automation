package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utillities.ActionCommands;

public class registrationPage extends ActionCommands {

    WebDriver driver;
    private By firstNameTxtbox=By.id("firstName");
    private By lastNameTxtbox=By.id("lastName");
    private By emailTxtbox=By.id("userEmail");
    private By genderMale=By.id("gender-radio-1");
    private By mobileNoTxtbox=By.id("userNumber");
    private By dobTxtbox=By.id("dateOfBirthInput");
    private By subjectTxtbox=By.id("subjectsInput");
    private By hobbySports=By.id("hobbies-checkbox-1");
    private By fileUploader=By.id("uploadPicture");
    private By addressTxtbox=By.id("currentAddress");
    private By State=By.xpath("//*[@id=\"react-select-3-input\"]");
    private By City=By.xpath("//*[@id=\"react-select-4-input\"]");
    private By submitButton=By.id("submit");
    private By submissionMsg=By.id("example-modal-sizes-title-lg");

    public registrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) {
        openurl(driver, URL);
    }

    public void EnterFirstname(String fname){
        waitTime(driver,firstNameTxtbox);
        type(driver,firstNameTxtbox,fname);
    }

    public void EnterLastname(String lname){
        waitTime(driver,lastNameTxtbox);
        type(driver,lastNameTxtbox,lname);
    }

    public void EnterEmail(String email){
        waitTime(driver,emailTxtbox);
        type(driver,emailTxtbox,email);
    }

    public void selectGender(){
        WebElement gendermale = driver.findElement(genderMale);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].checked = true;", gendermale);
    }

    public void EnterMobileNumber(String mobileNo){
        waitTime(driver,mobileNoTxtbox);
        type(driver,mobileNoTxtbox,mobileNo);
    }

    public void selectDOB(String dob){
        waitTime(driver,dobTxtbox);
        WebElement dobbox=driver.findElement(dobTxtbox);
        dobbox.click();
        String currentText = dobbox.getAttribute("value");
        for (int i = 1; i < currentText.length(); i++) {
            dobbox.sendKeys(Keys.BACK_SPACE);
        }
        type(driver,dobTxtbox,dob);
        dobbox.sendKeys(Keys.ENTER);
    }

    public void EnterSubject(String subject){
        waitTime(driver,subjectTxtbox);
        WebElement subbox=driver.findElement(subjectTxtbox);
        type(driver,subjectTxtbox,subject);
        subbox.sendKeys(Keys.ENTER);
    }

    public void selectHobby(){
        WebElement hobby=driver.findElement(hobbySports);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].checked = true;", hobby);
    }

    public void uploadPicture(String pic){
        WebElement imageuploader=driver.findElement(fileUploader);
        imageuploader.sendKeys(pic);
    }

    public void enterAddress(String addr){
        waitTime(driver,addressTxtbox);
        type(driver,addressTxtbox,addr);
    }

    public void selectState(String stat){
        waitTime(driver,State);
        WebElement state=driver.findElement(State);
        type(driver,State,stat);
        state.sendKeys(Keys.ENTER);
    }

    public void selectCity(String cit){
        waitTime(driver,City);
        WebElement city=driver.findElement(City);
        type(driver,City,cit);
        city.sendKeys(Keys.ENTER);
    }

    public void clickSubmit(){
        waitTime(driver,submitButton);
        click(driver,submitButton);
    }

    public void verifySubmission(String msg){
        String actualMsg = verifyText(driver, submissionMsg, msg);
        if (!actualMsg.equals(msg)) {
            Assert.fail("Invalid email format entered");
        }
    }






}
