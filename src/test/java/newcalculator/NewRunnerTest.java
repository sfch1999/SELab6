package newcalculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/newfeatures")
@RunWith(Cucumber.class)
public class NewRunnerTest {

}