package pages.amazonpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AmazonSignUpPage {

    public AmazonSignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement helloButton;
    @FindBy(id = "createAccountSubmit")
    private WebElement createAccountSubmitButton;
    @FindBy(id = "ap_customer_name")
    private WebElement name;
    @FindBy(id = "ap_email")
    private WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@name='passwordCheck']")
    private WebElement passwordCheck;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    @FindBy(tagName = "h1")
    private WebElement headerText;

    public void setCreateAccount(){
        helloButton.click();
        createAccountSubmitButton.click();
    }
    public String getHeaderText(){
    return BrowserUtils.getTextMethod(headerText);
    }

    public void allInformation(String username,String email, String password, String passwordCheck){
        name.sendKeys(username);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordCheck.sendKeys(passwordCheck);
    }

}
