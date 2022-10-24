package code.stepsDefinitions;

import code.pages.guru99TelecomHome;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class guru99TelecomSteps extends BrowserUtils {

    guru99TelecomHome guru99Teleccom=new guru99TelecomHome();
    private static  final Logger logger =Logger.getLogger(guru99TelecomSteps.class);

    @Given("The user wants to see guru demo site")
    public void The_user_wants_to_see_guru_demo_site(){
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99Telecomurl"));
        Driver.getDriver().manage().window().maximize();
    }
    @When("the user wants to add customer")
    public void the_user_wants_to_add_customer() {
    guru99Teleccom.setAddCustomer();
        Actions action=new Actions(Driver.getDriver());
        action.moveByOffset(0,0).click().build().perform();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String header) {
        staticWait(2);
        guru99Teleccom.setAddCustomerHeader(header);
        logger.info("Header is succesfully verified"+ header);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String backgroundcheck) {
        staticWait(2);
       guru99Teleccom.setBackgroundCheck(backgroundcheck);
       logger.info(backgroundcheck+" option is selected");
    }
    @Then("The user wants to enter billing address as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstname, String lastname, String email, String adress, String telephone) {
        guru99Teleccom.setFirstName(firstname);
        logger.info("First name is succesfully provided");
        guru99Teleccom.setLastName(lastname);
        logger.info("Last name is succesfully provided");
        guru99Teleccom.setId(email);
        logger.info("email is succesfully provided");
        guru99Teleccom.setAdress(adress);
        logger.info("Message is succesfully provided");
        guru99Teleccom.setTelephone(telephone);
        logger.info("Telephone number is succesfully provided");
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        guru99Teleccom.setSubmitButton();
        Assert.assertEquals(guru99Teleccom.getVerificationHeader().getText(),string);
        logger.info("header is verified");
    }



}
