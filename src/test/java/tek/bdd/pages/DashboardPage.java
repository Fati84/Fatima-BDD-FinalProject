package tek.bdd.pages;

import org.openqa.selenium.By;

public class DashboardPage {


    public static final By CustomerServicePortal = By.xpath("//*[@id='root']/div/div[1]/div/h2");
    public static final By PROFILE_BUTTON = By.xpath("//button[@aria-label = 'profile']");
    public static final By AccountsButton = By.linkText("Accounts");
    public static final By Plans = By.linkText("Plans");
   // public static final By ProfileSideDrawer = By.xpath("//*[@id='root']/div/div[1]/div/button");
}