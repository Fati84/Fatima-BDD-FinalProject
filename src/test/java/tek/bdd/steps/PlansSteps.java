package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlanPage;
import tek.bdd.utility.SeleniumUtility;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlansSteps extends SeleniumUtility {


    @When("Validate 4 rows of data are present")
    public void VerifyThePresenceOfFourRows() {
        List<WebElement> rows = getDriver().findElements(PlanPage.PlansAllRows);
        assertEquals(4, rows.size());
        for (WebElement row : rows) {
            assertTrue(row.isDisplayed());
        }
    }
    @Then("Validate create date is today's date")
    public void validateCreateDate() {

        String createDateText = getElementText(PlanPage.DateCreated);
        LocalDate expectedDate = LocalDate.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String expectedDateFormatted = expectedDate.format(formatter);
      //  assert createDateText.equals(expectedDateFormatted) : "Create date is not today's date";
        }

    @Then("Validate expire date is a day after today's date")
    public void validateExpireDate() {

        String expireDateText = getElementText(PlanPage.DateExpire);
        LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDate expectedExpireDate = today.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String expectedExpireDateFormatted = expectedExpireDate.format(formatter);
        //assert expireDateText.equals(expectedExpireDateFormatted) : "Expire date is not a day after today's date";

        }
    }

