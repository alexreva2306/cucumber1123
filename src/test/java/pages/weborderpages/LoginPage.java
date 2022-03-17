package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    private WebElement userName;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(xpath = "//button[.='Sign In']")
    private WebElement signInBut;

    @FindBy(xpath = "//div[contains(text(),'Sign in Failed')]")
    private WebElement errorMessage;

    public void login(String userName, String password){
        this.userName.clear();
        this.password.clear();
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.signInBut.submit();
    }
    public boolean getErrorMessage(String errorMessage){
        return this.errorMessage.getText().trim().equals(errorMessage);
    }



}
