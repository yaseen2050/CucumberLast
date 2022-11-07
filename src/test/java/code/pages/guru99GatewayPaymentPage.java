package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99GatewayPaymentPage extends BrowserUtils {

   public guru99GatewayPaymentPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;

    @FindBy(id ="month")
    private WebElement month;

    @FindBy(id ="year")
    private WebElement year;

    @FindBy(id ="cvv_code")
    private WebElement cvv_code;

    @FindBy(xpath ="//input[@type='submit']")
    private WebElement payButton;

    public void setCardNumber(String cardnumber) {
        staticWait(5);
       cardNumber.sendKeys(cardnumber);
    }


    public void setMonth(String Month) {
        staticWait(2);
        selectFromDropDown(month, Month);
    }

    public void setYear(String Year) {
        staticWait(1);
        selectFromDropDown(year, Year);
    }

    public void setCvv_code(String Cvv_code) {
        staticWait(1);
        cvv_code.sendKeys(Cvv_code);
    }

    public void setPayButton() {
        payButton.click();
    }



}
