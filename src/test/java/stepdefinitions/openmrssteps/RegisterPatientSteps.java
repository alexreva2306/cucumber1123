package stepdefinitions.openmrssteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.openmrspages.OpenMRSLoginPage;
import pages.openmrspages.OpenMRSMainPage;
import pages.openmrspages.OpenMRSREgisterPage;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
    WebDriver driver = DriverHelper.getDriver();
    OpenMRSLoginPage openMRSLoginPage = new OpenMRSLoginPage(driver);
    OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
    OpenMRSREgisterPage openMRSREgisterPage = new OpenMRSREgisterPage(driver);
    @Given("the user logs in to OpenMRS with following credentials")
    public void the_user_logs_in_to_open_mrs_with_following_credentials(DataTable dataTable) {
     //you should know that:dataTable will come as a parameter when you provide data table in
        //the feature file. And delete the first part of the Datatable and import it
        Map<String,String> usernamePasswordMap = dataTable.asMap();
        //username=admin
        //password=Admin123
//       String name = usernamePasswordMap.get("username");
//       String password = usernamePasswordMap.get("password");
//        System.out.println(name);
//        System.out.println(password);
        openMRSLoginPage.login(usernamePasswordMap.get("username"),usernamePasswordMap.get("password"));
    }
    @When("the user register a new patient with following information:")
    public void the_user_register_a_new_patient_with_following_information(DataTable dataTable) throws InterruptedException {

        Map<String,String> patientInfoMap = dataTable.asMap();
        openMRSMainPage.clickRegisterPatientButton();
        openMRSREgisterPage.sendName(patientInfoMap.get("GivenName"),patientInfoMap.get("FamilyName"));
        openMRSREgisterPage.sendGender(patientInfoMap.get("Gender"));
        openMRSREgisterPage.sendBirthDate(patientInfoMap.get("Day"),patientInfoMap.get("Month"),patientInfoMap.get("Year"));
        openMRSREgisterPage.sendAddress(patientInfoMap.get("Address"));
        openMRSREgisterPage.sendPhoneNumber(patientInfoMap.get("PhoneNumber"));
        openMRSREgisterPage.sendRelativeInfo(patientInfoMap.get("relationType"), patientInfoMap.get("RelativeName"));
        openMRSREgisterPage.clickConfirmButton();
    }
    @Then("the user validates the patient name and familyName")
    public void the_user_validates_the_patient_name_and_family_name(DataTable dataTable) {
    Map <String,String> validateNames = dataTable.asMap();
        Assert.assertEquals(validateNames.get("GivenName"),openMRSREgisterPage.getGivenName());
        Assert.assertEquals(validateNames.get("FamilyName"),openMRSREgisterPage.getFamilyName());
    }

}
