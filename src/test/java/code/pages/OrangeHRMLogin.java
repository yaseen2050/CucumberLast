package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin extends BrowserUtils {

    private static final Logger logger=Logger.getLogger(OrangeHRMLogin.class);
    @FindBy(id = "txtUsername")
    private WebElement userName;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement LoginButton;
    public OrangeHRMLogin(){
        PageFactory.initElements(Driver.getDriver(),this);}

    public void setUserName(String username) {
        staticWait(1);
        userName.sendKeys(username);
        logger.info("username is entered");
        if (username==null){
            logger.error("the username is empty ");
        }
    }
    public void setDatafromExcel(String username, String passWord){
        userName.sendKeys(username);
         password.sendKeys(passWord);

    }

    public void setPassword(String passWord) {
       password.sendKeys(passWord);
    }

    public void setLoginButton() {
        LoginButton.click();
    }


}
