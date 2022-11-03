package code.stepsDefinitions;

import code.pages.contactuspage;
import code.utils.BrowserUtils;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUs extends BrowserUtils {

    contactuspage ct=new contactuspage();

    @Given("user navigates to contact us website")
    public void user_navigates_to_contact_us_website() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("User fills the form given sheetName {string} and rowNumber {int}")
    public void user_fills_the_form_given_sheet_name_and_row_number(String string, Integer int1) {

    }
    @Then("user clicks Send Button")
    public void user_clicks_send_button() {

    }
    @Then("User verifies success full message {string}")
    public void user_verifies_success_full_message(String strings) {

    }
    @When("User fills the form given sheetName {string} and rowNumber {string}")
    public void user_fills_the_form_given_sheet_name_and_row_number(String string, String string2) {

    }

}
