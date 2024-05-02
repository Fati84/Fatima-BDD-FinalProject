package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.DashboardPage;
import tek.bdd.pages.PlanPage;
import tek.bdd.pages.UserProfilePage;
import tek.bdd.utility.SeleniumUtility;

import static org.junit.Assert.assertTrue;
import static tek.bdd.pages.DashboardPage.CustomerServicePortal;

public class DashboardSteps extends SeleniumUtility {

    @Then("User navigated to Customer Service Portal")
    public void CustomerServicePortalIsDisplayed()  {
        String actualTitle = getElementText(DashboardPage.CustomerServicePortal);
        Assert.assertEquals(actualTitle,"Customer Service Portal","Customer Service Portal");

    }
    @And("Click on Plans Button")
    public void clickOnPlansButton() throws InterruptedException {
        clickElement(DashboardPage.Plans);
        Thread.sleep(3000);
    }
    @And("Click on Accounts Button")
    public void clickOnAccountsButton() throws InterruptedException {
        clickElement(DashboardPage.AccountsButton);
        Thread.sleep(3000);
    }
    @And("Click on profile button on top right corner")
    public void clickOnProfileButton() throws InterruptedException {
        clickElement(DashboardPage.PROFILE_BUTTON);
        Thread.sleep(3000);
    }

}
