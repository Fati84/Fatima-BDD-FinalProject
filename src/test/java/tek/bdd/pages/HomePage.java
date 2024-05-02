package tek.bdd.pages;

import org.openqa.selenium.By;

public class HomePage {


    public static final By CreatePrimaryAccountButton  = By.linkText("Create Primary Account");
    public static final By LoginButtonInHomePage = By.linkText("Login");
    public static final By LetsGetYouStartedText = By.xpath("//h2[contains (text(), 'Lets get you started')]");
    public static final By TitleOfHomePage = By.xpath("//h2[text()='TEK Insurance App']");







}
