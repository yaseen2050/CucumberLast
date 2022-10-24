package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // We are connecting JUnit here
@CucumberOptions(
        features = "src/test/resources/ContactUs.feature", //This is to connect feature files with runner class
        //We need to copy path from content root
        glue = "code/stepsDefinitions",//This is to connect steps with runner class
        //We need to copy path from source root or content root sometimes reference root
        tags= "@TCcontactus", // when we tag our scenario and just run it
        dryRun = false, //This is to get undefined steps without opening up browser  when u use TRUE it will gie us steps to generate and always important
        plugin = {
        "pretty", // this is to have more understandable console logs.
        "rerun:target/rerun.txt",// this will help us to store failed scenarios in rerun.t
        "html:target/default-cucumber-reports.html",
         "json:target/cucumber.json"}
)

public class TestRunner {

}
