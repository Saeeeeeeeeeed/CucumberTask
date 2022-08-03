package TestRunner;

import Test.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= "src/test/java/features"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report"})
public class Runner extends TestBase {

}
