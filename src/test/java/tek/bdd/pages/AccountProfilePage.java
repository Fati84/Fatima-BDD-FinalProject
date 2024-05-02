package tek.bdd.pages;

import org.openqa.selenium.By;

public class AccountProfilePage {

    public static final By CreatePrimaryAccountButton= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a");

    public static final By ProfileTextName= By.xpath("//h2[contains( text(),'Create Primary Account Holder')]");

    public static final By EMAIL_INPUT = By.xpath("//input[@id='email']");
    public static final By TITLE_INPUT = By.xpath("//select[@id='title']");
    public static final By FIRST_NAME_INPUT = By.xpath("//input[@id='firstName']");
    public static final By LAST_NAME_INPUT = By.xpath("//input[@id='lastName']");
    public static final By GENDER_INPUT = By.xpath("//select[@id='gender']");
    public static final By MARITAL_STATUS_INPUT = By.xpath("//select[@id='maritalStatus']");
    public static final By EMPLOYMENT_STATUS_INPUT = By.xpath("//input[@id='employmentStatus']");
    public static final By DATE_OF_BIRTH_INPUT = By.xpath("//input[@id='dateOfBirth']");

    public static final By CreateAccountBUTTON = By.xpath("//button[contains(text(),'Create Account')]");

    public static final By SignUpYourAccount = By.xpath("//h2[contains(text(),'Sign up your account')]");

    public static final By ERROR_MESSAGE= By.xpath("//div[contains(text(),'Account with email johnsmith@gmail.com is exist')]");

}
