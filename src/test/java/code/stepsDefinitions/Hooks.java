package code.stepsDefinitions;

import code.utils.BrowserUtils;
import code.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils {

    private static final Logger logger=Logger.getLogger(Hooks.class);

    @Before
    public void setup(){
        Driver.getDriver();
        logger.info("Driver succesfully started  ");
        Driver.getDriver().manage().window().maximize();



    }



    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte [] data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
       Driver.closeDriver();
    }

}
