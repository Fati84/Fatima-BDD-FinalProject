package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait;
    }
    public WebElement waitForElementClickable(By locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }
    public WebElement waitForElementVisible(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void clickElement(By locator){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }
    public String getElementText(By locator) {
        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
        return text;
    }
    public List<WebElement> getElements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    public boolean isElementEnabled(By locator) {
        boolean isEnabled = getWait().until(ExpectedConditions.presenceOfElementLocated(locator))
                .isEnabled();
        return isEnabled;
    }

    public void sentTextToElement(By locator, String text) {
        getWait().until(
                ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void selectFromDropDownByValue(By locator, String value){
        WebElement element = getDriver().findElement(locator);
        Select select= new Select(element);
        select.selectByValue(value);
    }
    public void selectFromDropDownByText(By locator, String text) {
            WebElement element = getDriver().findElement(locator);
            Select select = new Select(element);
            select.selectByValue(text);
    }
    public void selectFromDropDownByIndex(By locator, int index) {
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public boolean isElementDisplayed(By locator) {
        return getWait().until(ExpectedConditions
                        .visibilityOfElementLocated(locator))
                .isDisplayed();
    }
    public void printRows(By locator){
        List<WebElement> availableRows = getDriver().findElements(locator);
        System.out.println("Available rows are: "+ availableRows.size());

    }
    public void clearText(By locator) {
        WebElement element = waitForElementVisible(locator);
        element.clear();
    }
    public static class DateTimeUtility {

        public static String getCurrentDate(){
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York"))
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }
        public static String getExpiredDate(){
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York")).plusDays(1)
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }
    }

}


