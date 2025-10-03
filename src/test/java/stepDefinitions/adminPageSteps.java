package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;
import utillities.BaseClass;
import pageObjects.adminPage;

public class adminPageSteps {

    adminPage adminPage=new adminPage(BaseClass.setupBrowser());

    @When("Click the Admin tab in dashboard")
    public void clickAdminTab(){
        adminPage.clickAdminTab();
    }

    @When("Click the Add button in User Management section")
    public void clickAddButtonInUserManagement(){
        adminPage.clickAddButtonInUserManagement();
    }

    @When("Click the save button without entering any details")
    public void clickSaveButtonWithoutEnteringAnyDetails(){
        adminPage.clickSaveButtonWithoutEnteringAnyDetails();
    }

    @Then("^Verify the validation messages for required fields as (.*)$")
    public void verifyValidationMessagesForRequiredFields(String message){
        adminPage.verifyValidationMessagesForRequiredFields(message);
    }

    @Then("^Verify the column headers in user management table as (.*), (.*), (.*), (.*), (.*)$")
    public void verifyColumnHeadersInUserManagementTable(String col1, String col2, String col3, String col4, String col5){
        adminPage.verifyColumnHeadersInUserManagementTable(col1, col2, col3, col4, col5);
    }
}
