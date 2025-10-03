package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.dashboardPage;
import utillities.BaseClass;

public class dashboardPageSteps {

    dashboardPage dashboardPage=new dashboardPage(BaseClass.setupBrowser());


    @Then("Logout from the system")
    public void logout() {
        dashboardPage.logout();
    }

    @When("^Enter the search Text as (.*)$")
    public void enterSearchText(String text){
        dashboardPage.enterSearchTxt(text);
    }

    @Then("^Verify the ([^ ]+) tab is available$")
    public void verifyTabIsAvailable(String tabname){
        dashboardPage.verifySeachedTab(tabname);
    }

    @Then("Verify the upgrade option in navbar")
    public void verifyUpgradeOptionInNavbar(){
        dashboardPage.verifyUpgradeOption();
    }

    @When("Click the Minimize arrow in side navigation bar")
    public void minimizeSidenav(){
        dashboardPage.minimizeSidenav();
    }

    @When("Click the help button in dashboard")
    public void clickHelpBtn(){
        dashboardPage.clickHelpBtn();
    }
}
