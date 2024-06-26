package tek.bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {

    public static final By STATUS = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");
    public static final By USER_TYPE = By.xpath("//p[contains(text(), 'CSR')]");
    public static final By FULL_NAME = By.xpath("//p[contains(text(), 'Supervisor')]");
    public static final By USER_NAME = By.xpath("//p[contains(text(), 'supervisor')]");
    public static final By AUTHORITIES = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");
    public static final By LOGOUT_BUTTON = By.xpath("//button[contains(text(),'Logout')]");

}