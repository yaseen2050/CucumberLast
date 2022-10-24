package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrangeHRMAdmin extends BrowserUtils {

    public OrangeHRMAdmin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    private static final Logger logger=Logger.getLogger(OrangeHRMAdmin.class);

    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminButton;
    @FindBy(id = "menu_admin_nationality")
    private WebElement nationalititesSection;

    @FindBy(id = "btnAdd")
    private WebElement addButton;

    @FindBy(id = "nationality_name")
    private WebElement NameofNationalityBox;
    @FindBy(id = "btnSave")
    private WebElement saveButon;

    @FindBy(xpath ="//table//tr//td[2]//a" )    // those for table multi element
    private List<WebElement> nationalitiesList;

    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployeeButton;

    @FindBy(id = "firstName")
    private WebElement firstname;
    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "chkLogin")
    private WebElement chklogin;

    @FindBy(id = "user_name")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;
    @FindBy(id = "re_password")
    private WebElement repassword;
    @FindBy(id = "//select[@id='status']")
    private WebElement status;

    public void setRepassword(String repassworD){
        repassword.sendKeys(repassworD);
    }

    public void setStatus(String VisibleText){
       BrowserUtils.selectFromDropDown(status,VisibleText);
    }

    public void setUsername(String USERNAME){
        username.sendKeys(USERNAME);
    }
    public void setPassword(String Password){
        password.sendKeys(Password);
    }

    public void setCheckLogin(){

        chklogin.click();
    }

    public void setFirstname(String a){
        firstname.sendKeys(a);
    }
    public void setLastname(String lastnamE){
        lastname.sendKeys(lastnamE);
    }

    public void addEmployebut(){
        addEmployeeButton.click();
    }
    public void setAdminButton() {
        clickWithWait(adminButton);
    }

    public void setNationalititesSection() {
        clickWithWait(nationalititesSection);
    }

    public void setAddButton() {
        clickWithWait(addButton);
    }

    public void setNameofNationalityBox(String nameofNationalityBoxs) {
        NameofNationalityBox.sendKeys(nameofNationalityBoxs);
    }

    public void setSaveButon() {
        clickWithWait(saveButon);
    }

    public void checkNationalitiesList(String nationality) {
        for (WebElement each : nationalitiesList){
           if( each.getText().equals(nationality)){
            Assert.assertEquals(each.getText(),nationality);
           } else if (!each.getText().equals(nationality)) {
               logger.error("Nationality provided is not found in the records");

           } else if (nationality.isEmpty()) {
               logger.error("No nationality is provided");
           }

        }
    }




}
