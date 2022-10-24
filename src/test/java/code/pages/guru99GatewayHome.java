package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99GatewayHome extends BrowserUtils {

    public guru99GatewayHome(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//input[@type='submit']")
    private WebElement buyNow;


    @FindBy(xpath ="//select[@name='quantity']")
    private WebElement quantityDropDown;

    public void getQuantityDropDown(String str) {
        Select select=new Select(quantityDropDown);
        select.selectByVisibleText(str);

    }
        public void getBuyNow(){
            buyNow.click();
        }




}
