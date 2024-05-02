package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import tek.bdd.utility.SeleniumUtility;


public class HookSteps extends SeleniumUtility {
    //Hook that Run Before Each Scenario
    @Before
    public void initiateTest() {
        openBrowser();
    }
    //Hook Will Execute After Each Scenario
    //no matter what happened to Scenarios
    @After
    public void closingTest(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) getDriver();
            byte[] capture = screenshot.getScreenshotAs(OutputType.BYTES);

            scenario.attach(capture, "image/png", "screenshot");
        }

        getDriver().quit();
    }
}





