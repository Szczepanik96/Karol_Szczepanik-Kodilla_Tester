package homework_buzz_fizz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework_buzz_fizz.FizzOrBuzzChecker.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzOrBuzzSteps {

    private int number;
    private String answer;

    @Given("number to check 9")
    public void number_to_check_is_9() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 9;
    }

    @Given("number to check 10")
    public void number_to_check_is_10() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 10;
    }

    @Given("number to check 15")
    public void number_to_check_is_15() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 15;
    }

    @Given("number to check 20")
    public void number_to_check_is_20() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 20;
    }

    @Given("number to check 1")
    public void number_to_check_is_1() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 1;
    }

    @Given("number to check 4")
    public void number_to_check_is_4() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 4;
    }

    @Given("number to check 150")
    public void number_to_check_is_150() {
        // Write code here that turns the phrase above into concrete actions
        this.number = 150;
    }

    @When("I ask for divisibility")
    public void i_ask_for_divisibility() {
        // Write code here that turns the phrase above into concrete actions
        this.answer = numberChecker(this.number);
    }

    @Then("it should told {string}")
    public void it_should_told(String string) {
        assertEquals(string, this.answer);
    }
}