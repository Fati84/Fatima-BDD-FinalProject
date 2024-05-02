package tek.bdd.pages;

import org.openqa.selenium.By;

public class SignUpPage {

    public static final By SIGN_UP_YOUR_ACCOUNT_PAGE_TITLE = By.xpath("//*[@id='root']/div/div[2]/div/div/div/h2[1]");
    public static final By EmailConfirmation= By.xpath("//h2[contains(text(),'@gmail.com')]");
    public static final By UsernameInputField = By.xpath("//*[@id='username']");
    public static final By PasswordInputField = By.xpath("//*[@id='password']");
    public static final By ConfirmPasswordInput= By.xpath("//*[@id='confirm']");
    public static final By SubmitButton = By.xpath("//button[contains(text(),'Submit')]");


}
