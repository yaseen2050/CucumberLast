package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    private static final Logger logger=Logger.getLogger(OrangeHRMHome.class);



    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement dashBoard;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(id= "menu_pim_viewPimModule")
    private WebElement Pimbutton;

    public void setPim(){
        Pimbutton.click();
    }

    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement personalDetailsHeader;
    public void setDashboard(){
        String expected="Dashboard";
        Assert.assertEquals(dashBoard.getText(),expected);
        logger.info("Dashboard is verified ");
    }
    public void setDashboard(String str){

        Assert.assertEquals(dashBoard.getText(),str);
    }

    public void setAddEmployee() {
        clickWithWait(addEmployee);
    }

    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
        logger.info("firstname succesfully added");
    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
        logger.info(lastname+" is corretly entered");
    }

    public void setSaveButton() {
        clickWithWait(saveButton);
    }

    public void setPersonalDetailsHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader,personalDetailsHeader.getText());
    }

}
