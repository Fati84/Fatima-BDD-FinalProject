package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.AccountProfilePage;
import tek.bdd.pages.LoginPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.pages.UserProfilePage;
import tek.bdd.utility.DataProvider;
import tek.bdd.utility.DataProvider;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;
import java.util.Map;

public class CreateAccountSteps extends SeleniumUtility {
  public static String mainEmail;
  DataProvider dataProvider = new DataProvider();


    @Given("Click on Create Primary Account button")
    public void clickOnPrimaryAccountButton(){
        clickElement(AccountProfilePage.CreatePrimaryAccountButton);
    }

    @When("User validates page Title as Expected “Create Primary Account Holder”")
    public void PrimaryAccountTitle() {
     getElementText(AccountProfilePage.ProfileTextName);
     String actualTitle = getElementText(AccountProfilePage.ProfileTextName);
        System.out.println(actualTitle);
        Assert.assertEquals("Create Primary Account Holder",actualTitle);
    }
    @When("User fill out Create Account Form")
    public void FillCreateAccountForm(DataTable dataTable)  {
        List<Map<String ,String>> data = dataTable.asMaps();
        mainEmail = dataProvider.getRandomEmail();
        Map<String, String> dataMap = data.get(0);

        String email = dataMap.get("email");
        String title = dataMap.get("title");
        String firstName = dataMap.get("firstName");
        String lastname = dataMap.get("lastName");
        String gender = dataMap.get("gender");
        String maritalStatus = dataMap.get("maritalStatus");
        String employmentStatus = dataMap.get("employmentStatus");
        String dateOfBirth = dataMap.get("dateOfBirth");

        sentTextToElement(AccountProfilePage.EMAIL_INPUT, mainEmail);
        selectFromDropDownByText(AccountProfilePage.TITLE_INPUT, title);
        sentTextToElement(AccountProfilePage.FIRST_NAME_INPUT,firstName);
        sentTextToElement(AccountProfilePage.LAST_NAME_INPUT,lastname);
        selectFromDropDownByIndex(AccountProfilePage.GENDER_INPUT, 1);
        selectFromDropDownByIndex(AccountProfilePage.MARITAL_STATUS_INPUT,2);
        sentTextToElement(AccountProfilePage.EMPLOYMENT_STATUS_INPUT,employmentStatus);
        sentTextToElement(AccountProfilePage.DATE_OF_BIRTH_INPUT,dateOfBirth);

    }
    @When("User click on Create Account Button")
    public void clickOnCreateAccountButton() {
        clickElement(AccountProfilePage.CreateAccountBUTTON);
    }

    @And("Validate user is on {string}")
    public void validateUserIsOn(String title) {
        Assert.assertEquals(title,getElementText(AccountProfilePage.SignUpYourAccount));
    }

    @Then("Email displayed as entered")
    public void validateEmailAsExpected(){
        boolean isDisplayed = isElementDisplayed(SignUpPage.EmailConfirmation);
        Assert.assertTrue(isDisplayed);

    }

    @When("User creates account with existing email address")
    public void fillFormWithExistingEmail(DataTable dataTable) {
        List<Map<String ,String>> data = dataTable.asMaps();
        Map<String, String> dataMap = data.get(0);
        mainEmail = dataProvider.getRandomEmail();

        String email = dataMap.get("email");
        String title = dataMap.get("title");
        String firstName = dataMap.get("firstName");
        String lastname = dataMap.get("lastName");
        String gender = dataMap.get("gender");
        String maritalStatus = dataMap.get("maritalStatus");
        String employmentStatus = dataMap.get("employmentStatus");
        String dateOfBirth = dataMap.get("dateOfBirth");

        sentTextToElement(AccountProfilePage.EMAIL_INPUT, email);
        selectFromDropDownByText(AccountProfilePage.TITLE_INPUT, title);
        sentTextToElement(AccountProfilePage.FIRST_NAME_INPUT,firstName);
        sentTextToElement(AccountProfilePage.LAST_NAME_INPUT,lastname);
        selectFromDropDownByIndex(AccountProfilePage.GENDER_INPUT, 1);
        selectFromDropDownByIndex(AccountProfilePage.MARITAL_STATUS_INPUT,2);
        sentTextToElement(AccountProfilePage.EMPLOYMENT_STATUS_INPUT,employmentStatus);
        sentTextToElement(AccountProfilePage.DATE_OF_BIRTH_INPUT,dateOfBirth);
    }
   @Then("Click on Create Account Button")
    public void clickCreateAccountBtn() throws InterruptedException {
       clickElement(AccountProfilePage.CreateAccountBUTTON);
       Thread.sleep(3000);
   }

    @Then("Error message {string}")
    public void errorMessageDisplayed(String expectedErrorMessage) {
        String errorMessage = getElementText(AccountProfilePage.ERROR_MESSAGE);
        Assert.assertEquals( "errorMessage", "errorMessage");
        //System.out.println("actualErrorMessage");
    }
}
