package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",//This is to connect feature files with runner class
        //We need to copy path from content root
        glue = "code/stepsDefinitions",//This is to connect steps with runner class
        //We need to copy path from source root or content root sometimes reference root
       // tags= "", // when we tag our scenario and just run it
        dryRun = false, //This is to get undefined steps without opening up browser  when u use TRUE it will
        // gie us steps to generate and always important
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",

                //rerun logic in failed runner will help us to rerun scenarios after running failed scenarios from testrunner class

                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json", // this is for reporting of test results
        }

)



public class Failedrunner {
}
