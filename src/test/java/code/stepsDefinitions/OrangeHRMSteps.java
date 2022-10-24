package code.stepsDefinitions;

import code.pages.OrangeHRMAdmin;
import code.pages.OrangeHRMHome;
import code.pages.OrangeHRMLogin;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {

    OrangeHRMLogin orangeHRMLogins=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();
    OrangeHRMAdmin orangeHRMAdmin=new OrangeHRMAdmin();

    @Given("The user wants to go to OrangeHRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website(){

        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        orangeHRMLogins.setUserName(ConfigurationsReader.getProperties("userName"));
        orangeHRMLogins.setPassword(ConfigurationsReader.getProperties("password"));
    }

    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button(){
        orangeHRMLogins.setLoginButton();
    }
    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard(){
        orangeHRMHome.setDashboard();
    }
    @Then("the user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
        orangeHRMHome.setDashboard(string);
    }

    @Then("The user wants to go to Admin Module")
    public void the_user_wants_to_go_to_admin_module() {
        orangeHRMAdmin.setAdminButton();
    }
    @Then("The user wants to go to Natonalities Section")
    public void the_user_wants_to_go_to_natonalities_section() {
       orangeHRMAdmin.setNationalititesSection();
    }
    @Then("The user wants to click on add new nationality")
    public void the_user_wants_to_click_on_add_new_nationality() {
       orangeHRMAdmin.setAddButton();
    }
    @Then("The user wants to add new nationalities as {string}")
    public void the_user_wants_to_add_new_nationalities_as(String Nationality) {

        orangeHRMAdmin.setNameofNationalityBox(Nationality);
        orangeHRMAdmin.setSaveButon();
        orangeHRMAdmin.checkNationalitiesList(Nationality);
    }
    @Then("The user wants to click on PIM Module")
    public void The_user_wants_click_on_PIM_Module(){
        orangeHRMHome.setPim();
    }
    @Then("The user wants to go to Add Employee Page")
    public void the_user_wants_to_go_to_add_employee_page() {
        orangeHRMAdmin.addEmployebut();
    }
    @Then("The user wants to add employee's first and last name as following")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following(List<List<String>> table) {
        orangeHRMAdmin.setFirstname(table.get(0).get(1));
        orangeHRMAdmin.setLastname(table.get(1).get(1));
        orangeHRMAdmin.setCheckLogin();

    }
    @Then("The user wants to add login details as following")
    public void the_user_wants_to_add_login_details_as_following(Map<String,String> table) {
    orangeHRMAdmin.setUsername(table.get("UserName"));
    orangeHRMAdmin.setPassword(table.get("Password"));
    orangeHRMAdmin.setRepassword(table.get("Password"));
    orangeHRMAdmin.setStatus(table.get("status"));

    }
    @Given("The user wants to login OrangeHrm using Excel File")
    public void The_user_wants_to_login_OrangeHrm_using_Excel_File()throws IOException {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
            String filepath="/Users/gokhankara/IdeaProjects/CucumberLast/src/test/resources/excelsheet.xlsx";
        FileInputStream   fileInputStream=new FileInputStream(filepath);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("Sheet 1");
        sheet.getRow(0).getCell(0).toString();
        System.out.println(sheet.getRow(0).getCell(0).toString());
        sheet.getRow(1).getCell(0).toString();

        // how many row
        int rows=sheet.getLastRowNum();
        int colomuns=sheet.getRow(0).getLastCellNum(); // how many cell number
        String username=sheet.getRow(0).getCell(1).toString();
        String password=sheet.getRow(1).getCell(1).toString();

        orangeHRMLogins.setDatafromExcel(username,password);


    }



}
