package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.AccountsPage;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class LoginSteps extends SeleniumUtility {

    @When("Click on Login button")
    public void ClickOnLoginButton() throws InterruptedException {
        clickElement(HomePage.LoginButtonInHomePage);
        Thread.sleep(2000);
    }
    @When("Enter Username Value {string} and Password Value {string}")
    public void loginInformation(String userName , String password){
        sentTextToElement(LoginPage.UserInput , userName);
        sentTextToElement(LoginPage.PasswordInput , password);
    }

    @And("Click on Sign In Button")
    public void clickOnSignInButton() throws InterruptedException {
        clickElement(LoginPage.SignInButton);
        Thread.sleep(3000);

    }

    @Then("Validate login error message {string}")
    public void displayErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        String actualErrorMessage1 = actualErrorMessage.substring(0,5);
        String actualErrorMessage2= actualErrorMessage.substring(6);
        String actualErrorMessage3 = actualErrorMessage1 + " " + actualErrorMessage2;
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage3);

    }

}


