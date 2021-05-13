package newcalculator;

import calculator.NewCalculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepdefs2 {
    NewCalculator calculator;
    int value1;
    int value2;
    char op;
    int result;

    @Before
    public void before() {
        calculator = new NewCalculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), and the operand (.)$")
    public void twoInputValuesAndAndTheOperand(int arg0, int arg1, char arg3) {
        value1 = arg0;
        value2 = arg1;
        op=arg3;
    }

    @When("^after calculation$")
    public void afterCalculation() {
        result = calculator.calculate(value1,value2,op);
        System.out.print(result);
    }

    @Then("^I expect the new result to be (-?\\d+)$")
    public void iExpectTheNewResultToBe(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
