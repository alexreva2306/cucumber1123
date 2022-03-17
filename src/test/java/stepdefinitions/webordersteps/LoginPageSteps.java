package stepdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.LoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginPageSteps {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user navigates to the WebOrder website")
    public void the_user_navigates_to_the_web_order_website() {
        driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    }

    @When("th e user provides credentials")
    public void th_e_user_provides_credentials() {
    loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));
    }

    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Assert.assertEquals(driver.getTitle(),"ORDER DETAILS - Weborder");
    }

    @When("th e user provides correct username and wrong password")
    public void th_e_user_provides_correct_username_and_wrong_password() {
       loginPage.login(ConfigReader.readProperty("weborderusername"),"wrongpassword");
    }

    @Then("the user validates the {string} error message")
    public void the_user_validates_the_error_message(String expectedMessage) {
        Assert.assertTrue(loginPage.getErrorMessage(expectedMessage));
    }

//    @When("th e user provides wrong username and password")//hard coding and people do not like it
//    public void th_e_user_provides_wrong_username_and_password() {
//    loginPage.login("ahmet","baldir");
//    }

    @When("th e user provides wrong {string} and {string}")//this is professional
    public void th_e_user_provides_wrong_and(String username, String password) {
       loginPage.login(username,password);
    }

    @When("th e user provides empty username and password")
    public void th_e_user_provides_empty_username_and_password() {
        loginPage.login("","");
    }

}