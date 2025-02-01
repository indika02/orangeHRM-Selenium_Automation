package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.registrationPage;
import utillities.BaseClass;
import utillities.OperatorConfigDataProvider;

public class RegistrationPageSteps {
    pageObjects.registrationPage registrationPage=new registrationPage(BaseClass.setupBrowser());

    OperatorConfigDataProvider operatorConfigDataProvider = new OperatorConfigDataProvider();

    @Given("^Load UI$")
    public void loadUI(){
        registrationPage.openPage(operatorConfigDataProvider.getURL());
    }

    @Then("^Enter the First name as (.*)$")
    public void enter_first_name(String fname){
        registrationPage.EnterFirstname(fname);
    }

    @Then("^Enter the Last name as (.*)$")
    public void enter_last_name(String lname){
        registrationPage.EnterLastname(lname);
    }

    @Then("^Enter the Email as (.*)$")
    public void enter_email(String email){
        registrationPage.EnterEmail(email);
    }

    @Then("Select Gender as Male")
    public void select_as_Male(){
        registrationPage.selectGender();
    }

    @Then("^Enter Mobile number as (.*)$")
    public void enter_Mobilenumber(String mobileno){
        registrationPage.EnterMobileNumber(mobileno);
    }

    @Then("^Select Date of Birth as (.*)$")
    public void select_DOB(String dob){
        registrationPage.selectDOB(dob);
    }

    @Then("^Select Subject as (.*)$")
    public void select_Subject(String subject){
        registrationPage.EnterSubject(subject);
    }

    @Then("Select Hobby as Sports")
    public void select_hobby(){
        registrationPage.selectHobby();
    }

    @Then("^Upload a Picture as (.*)$")
    public void upload_picture(String pic){
        registrationPage.uploadPicture(pic);
    }

    @Then("^Enter the Current Address as (.*)$")
    public void enter_address(String addr){
        registrationPage.enterAddress(addr);
    }

    @Then("^Select State as (.*)")
    public void select_state(String state){
        registrationPage.selectState(state);
    }

    @Then("^Select City as (.*)$")
    public void select_City(String city){
        registrationPage.selectCity(city);
    }

    @Then("Click the submit button")
    public void click_submit(){
        registrationPage.clickSubmit();
    }

    @Then("^Verify the success message as (.*)$")
    public void verify_submission(String msg){
        registrationPage.verifySubmission(msg);
    }

}
