package code.stepsDefinitions;


import code.pages.guru99GatewayHome;
import code.pages.guru99GatewayOrderSuccess;
import code.pages.guru99GatewayPaymentPage;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class guru99Steps extends BrowserUtils {
        guru99GatewayHome guru99GatewayHome=new guru99GatewayHome();
        guru99GatewayPaymentPage guru99GatewayPaymentPage=new guru99GatewayPaymentPage();
        guru99GatewayOrderSuccess guru99GatewayOrderSuccess=new guru99GatewayOrderSuccess();
    @Given("The user wants to go to Payment Gateway Website")
    public void  the_user_wants_to_go_to_payment_Gateway_Website(){
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoUrl"));
        System.out.println("Payment page is loaded");


    }
    @When("The user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy(){
        guru99GatewayHome.getQuantityDropDown("3");
        guru99GatewayHome.getBuyNow();
        System.out.println("Payment page is loaded");
    }

    @Then("The user wants to provide payment information")
    public void the_user_wants_to_provide_payment_information() {
        guru99GatewayPaymentPage.setCardNumber("2131122331314432");
        guru99GatewayPaymentPage.setMonth("10");
        guru99GatewayPaymentPage.setYear("2022");
        guru99GatewayPaymentPage.setCvv_code("369");
    }
    @Then("The user wants to click on pay now button")
    public void the_user_wants_to_click_on_pay_now() {
        guru99GatewayPaymentPage.setPayButton();
    }
    @Then("The user wants to verify message is successfull")
    public void the_user_wants_to_verify_message_is_successful() {
        staticWait(2);
        guru99GatewayOrderSuccess.setVerificationText("Payment not successfull!");
    }

    @When("The user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
        staticWait(5);
        guru99GatewayHome.getQuantityDropDown(string);
        guru99GatewayHome.getBuyNow();
    }
    @Then("user wants to enter Credit Card Number as {string}")
    public void user_wants_to_enter_credit_card_number_as(String string) {
        guru99GatewayPaymentPage.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
       guru99GatewayPaymentPage.setMonth(string);
    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expirtation_year_as(String string) {
       guru99GatewayPaymentPage.setYear(string);
    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99GatewayPaymentPage.setCvv_code(string);
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        staticWait(5);
       guru99GatewayOrderSuccess.setVerificationText(string);
    }
    @Then("user wants to enter Credit Card Number as followings")
    public void user_wants_to_enter_credit_card_number_as_followings(Map<String,String> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get("CreditNumber"));
    }
    @Then("user wants to enter Card Informations as")
    public void user_wants_to_enter_Card_information_as(List<List> datatable){
        guru99GatewayPaymentPage.setCardNumber(datatable.get(0).get(1).toString());
        guru99GatewayPaymentPage.setMonth(datatable.get(0).get(2).toString());
        guru99GatewayPaymentPage.setYear(datatable.get(0).get(3).toString());
        guru99GatewayPaymentPage.setCvv_code(datatable.get(0).get(4).toString());


    }
    @Then("user wants to enter Card Informations as is")
    public void user_wants_to_enter_Card_information_as_is(List<List<String>> datatable){
        guru99GatewayPaymentPage.setCardNumber(datatable.get(1).get(1));
        guru99GatewayPaymentPage.setMonth(datatable.get(1).get(2));
        guru99GatewayPaymentPage.setYear(datatable.get(1).get(3));
        guru99GatewayPaymentPage.setCvv_code(datatable.get(1).get(4));


    }

    @Then("The user wants enter Card information {string} {string} {string} {string}")
    public void the_user_wants_enter_card_information(String string, String string2, String string3, String string4) {
        guru99GatewayPaymentPage.setCardNumber(string);
        guru99GatewayPaymentPage.setYear(string3);
        guru99GatewayPaymentPage.setMonth(string2);
        guru99GatewayPaymentPage.setCvv_code(string4);

    }

}
