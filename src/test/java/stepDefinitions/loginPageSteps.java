package stepDefinitions;

import com.opencsv.exceptions.CsvValidationException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.loginPage;
import utillities.BaseClass;
import utillities.ConfigDataProvider;

import java.io.IOException;

public class loginPageSteps {

    pageObjects.loginPage loginPage=new loginPage(BaseClass.setupBrowser());
    ConfigDataProvider configDataProvider = new ConfigDataProvider();


    @Given("^Load UI$")
    public void loadUI(){
        loginPage.openPage(configDataProvider.getURL());
    }

    @When("Enter the Username and password")
    public void enterUsername() throws CsvValidationException, IOException {
        loginPage.login();
    }

    @When("^Enter the Username as (.*)$")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @When("^Enter the password as (.*)$")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("Click the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("^Verify the invalid login error message as (.*)$")
    public void verifyLoginErrorMessage(String msg) {
        loginPage.verifyLoginErrorMessage(msg);
    }

    @Then("^Verify the Footer text is (.*)$")
    public void verifyFooterText(String text) {
        loginPage.verifyFooterText(text);
    }

    @When("Click the forgot password link")
    public void clickTheForgotPasswordLink() {
        loginPage.clickForgotPasswordLink();
    }

    @Then("^Verify the Reset Password page heading is displayed as (.*)$")
    public void verifyTheResetPasswordPageHeadingIsDisplayedAs(String heading) {
        loginPage.verifyResetPasswordPageHeading(heading);
    }

    @Then("^Verify the username validation message as (.*)$")
    public void verifyTheUsernameValidationMessageAs(String msg) {
        loginPage.verifyUsernameValidationMessage(msg);
    }

    @And("^Verify the password validation message as (.*)$")
    public void verifyThePasswordValidationMessageAs(String msg) {
        loginPage.verifyPasswordValidationMessage(msg);
    }

    @Then("Verify the login page logo is displayed")
    public void verifyTheLoginPageLogoIsDisplayed() {
        loginPage.verifyLoginPageLogo();
    }

    @And("Close the window")
    public void closeWindow() {
        loginPage.closeWindow();
    }
}
