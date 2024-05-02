package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {


    public static final By UserInput = By.xpath("//input[@id='username']");

    public static final By PasswordInput = By.xpath("//input[@id='password']");

    public static final By SignInButton = By.xpath("//button[contains(text(),'Sign In')]");


    public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");




}
