package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class contactuspage extends BrowserUtils {

    public contactuspage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "id_contact")
    private WebElement subjectheading;

    @FindBy(id ="email" )
    private WebElement email;

    @FindBy(id = "message")
    private WebElement message;


    @FindBy(id = "id_order")
    private WebElement ref;
    @FindBy(id = "submitMessage")
    private WebElement sendButton;
    @FindBy(css = "div#center_colun p")
    private WebElement successMessage;

    public String getUrlTitle(){
        return Driver.getDriver().getTitle();
    }


    public void fillContactUsform(String heading,String emaiL,String reF,String Message){
        Select select=new Select(subjectheading);
        select.selectByVisibleText(heading);
        email.sendKeys(emaiL);
        ref.sendKeys(reF);
        message.sendKeys(Message);


    }

    public void clickSend(){
        sendButton.click();
    }
    public String succesMessagee(){
        return successMessage.getText();

    }
}
