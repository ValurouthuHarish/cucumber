package cucumberTest;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:/Users/harish/eclipse-workspace/CucumberDemo/Feature/tagging.feature",
 glue={"C:/Users/harish/eclipse-workspace/CucumberDemo/stepDefinition/Tagging.java"},
 //dryRun=true,// mapping is proper between feature file and step definition file
 //strict=true,// It will check for the steps in step defintion file 
 monochrome=true//displayes the console output in a proper readable format
 //plugin= {"pretty","html:test-outout"}
// tags= {"@SmokeTest"}
 //tags= {"@SmokeTest , @RegressionTest"} Either executed smoke Test or @Regression Test
 // And tags={"@SmokeTest","@RegressionTest"} Execute all test cases with Smoke and Regression tags.
 //tags={"~@SmokeTest","@RegressionTest"} Ignore smoke test case tilled special character needs to be used.
 
 )
 
public class TestRunner {
 
}        