package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Given("Validate Home page title Tek insurance UI is exist")
    public void validateHomePageTitle() {
        String actualTitle = getElementText(HomePage.TitleOfHomePage);
        Assert.assertEquals("TEK Insurance App", actualTitle);
    }

    @Then("Validate create Primary Account Button is exist")
    public void validateHomeCreatePrimaryAccount() {
        String actualTitle = getElementText(HomePage.CreatePrimaryAccountButton);
        Assert.assertEquals("Create Primary Account", actualTitle);
    }

    @Given("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccount() throws InterruptedException {
        clickElement(HomePage.CreatePrimaryAccountButton);
        Thread.sleep(3000);
    }

    @Given("Click on Login Button")
    public void clickOnLogin() throws InterruptedException {
        clickElement(HomePage.LoginButtonInHomePage);
        Thread.sleep(2000);
    }

    @Then("Validate Lets get you started text on Home Page")
    public void validateLetsGetYouStartedText() {
        boolean isLetsGetYouStartedTextDisplayed = isElementDisplayed(HomePage.LetsGetYouStartedText);
        Assert.assertTrue("Lets get you started text should be displayed ",
                isLetsGetYouStartedTextDisplayed);
    }

}


