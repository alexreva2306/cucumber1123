package stepdefinitions.webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.CreateGroupOrderPage;
import pages.weborderpages.LoginPage;
import pages.weborderpages.OrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    OrderPage orderPage = new OrderPage(driver);
    CreateGroupOrderPage createGroupOrderPage = new CreateGroupOrderPage(driver);
    @Given("the user is on weborder Home page")
    public void the_user_is_on_weborder_home_page() {
    driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));

    }

    @When("the user select {string} options")
    public void the_user_select_options(String deliveryOption) {
    orderPage.getDeliveryOption(deliveryOption);

    }

    @When("the user is on the groupOrderPage")
    public void the_user_is_on_the_group_order_page() {
        orderPage.clickGroupOrder();
        orderPage.clickNextButton();
        Assert.assertEquals(driver.getTitle(), "Create Group Order - Weborder");
    }

    @When("the user sends invitees note {string}")
    public void the_user_sends_invitees_note(String inviteNote) {
    createGroupOrderPage.sendInviteNote(inviteNote);
    }

    @When("the user sends invite list {string} and {string}")
    public void the_user_sends_invite_list_and(String email1, String email2) {
    createGroupOrderPage.sendInviteList(email1+","+email2);
    }

    @Then("the user validates the {string}")
    public void the_user_validates_the(String expectedAdress) {
    Assert.assertTrue(createGroupOrderPage.getOfficeAdress().contains(expectedAdress));
    }

    @Then("the user validates {string} text")
    public void the_user_validates_text(String expectedText) throws InterruptedException {
    createGroupOrderPage.clickcreateGroupButton();
    Assert.assertEquals(createGroupOrderPage.getHeaderText(),expectedText);
    }

    @Then("the user validates total participants is {int}")
    public void the_user_validates_total_participants_is(int expectedParticipant) throws InterruptedException {
    Assert.assertEquals(createGroupOrderPage.getParticipant(),expectedParticipant);
    }

}
