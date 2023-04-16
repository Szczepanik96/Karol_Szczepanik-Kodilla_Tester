package PreventUserWallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PreventUserWalletSteps {
    private final PreventUserWallet preventUserWallet = new PreventUserWallet();
    // 1
    @Given("there is 500 in my wallet")
    public void there_is_500_in_my_wallet() {
        preventUserWallet.deposit(500);
        Assertions.assertEquals(500, preventUserWallet.getBalance());
    }

    @When("I withdraw 500")
    public void i_withdraw_500() {
        preventUserWallet.withdraw(500);
        Assertions.assertEquals(0, preventUserWallet.getBalance());
    }

    @Then("should be dispensed 500")
    public void should_be_dispensed_0() {
        Assertions.assertEquals(0, preventUserWallet.getBalance());
    }

    @Then("I should be told that Your transaction is done - 500")
    public void i_should_be_told_an_Your_transaction_is_done_500() {
        String expectedOutput = "Your transaction is done";
        Assertions.assertEquals(expectedOutput, preventUserWallet.getAnswer(500, 500));
    }
    // 2
    @Given("there is 2147483647 in my wallet")
    public void there_is_2147483647_in_my_wallet() {
        preventUserWallet.deposit(2147483647);
        Assertions.assertEquals(2147483647, preventUserWallet.getBalance());
    }
    @When("I withdraw 7")
    public void i_withdraw_7() {
        preventUserWallet.withdraw(7);
        Assertions.assertEquals(2147483640, preventUserWallet.getBalance());
    }
    @Then("should be dispensed 7")
    public void should_be_dispensed_7() {
        Assertions.assertEquals(2147483640, preventUserWallet.getBalance());
    }
    @Then("I should be told that Your transaction is done - 7")
    public void i_should_be_told_that_Your_transaction_is_done_7() {
        String expectedOutput = "Your transaction is done";
        Assertions.assertEquals(expectedOutput, preventUserWallet.getAnswer(2147483647,7));
    }
    //3
    @Given("there is 0 in my wallet")
    public void there_is_0_in_my_wallet() {
        preventUserWallet.deposit(0);
        Assertions.assertEquals(0, preventUserWallet.getBalance());
    }
    @When("I withdraw 100")
    public void i_withdraw_100() {
        preventUserWallet.withdraw(100);
        Assertions.assertEquals(0, preventUserWallet.getBalance());
    }
    @Then("should be dispensed 0")
    public void should_be_dispensed_0_1() {
        Assertions.assertEquals(0, preventUserWallet.getBalance());
    }
    @Then("I should be told that The lowest deposit value is 1")
    public void i_should_be_told_that_The_lowest_deposit_value_is_1() {
        String expectedOutput = "The lowest deposit value is 1";
        Assertions.assertEquals(expectedOutput, preventUserWallet.getAnswer(0,100));
    }
    //4
    @Given("there is 1000 in my wallet")
    public void there_is_1000_in_my_wallet() {
        preventUserWallet.deposit(1000);
        Assertions.assertEquals(1000, preventUserWallet.getBalance());
    }
    @When("I withdraw 1100")
    public void i_withdraw_1100() {
        preventUserWallet.withdraw(1100);
        Assertions.assertEquals(1000, preventUserWallet.getBalance());
    }
    @Then("should be dispensed 0_2")
    public void should_be_dispensed_0_2() {
        Assertions.assertEquals(1000, preventUserWallet.getBalance());
    }
    @Then("I should be told that You don't have enough money in your wallet!")
    public void i_should_be_told_that_You_dont_have_enough_money_in_your_wallet() {
        String expectedOutput = "You don't have enough money in your wallet!";
        Assertions.assertEquals(expectedOutput, preventUserWallet.getAnswer(1000,1100));
    }
    //5
    @Given("there is 300 in my wallet")
    public void there_is_300_in_my_wallet() {
        preventUserWallet.deposit(300);
        Assertions.assertEquals(300, preventUserWallet.getBalance());
    }
    @When("I withdraw 0")
    public void i_withdraw_0() {
        preventUserWallet.withdraw(0);
        Assertions.assertEquals(300, preventUserWallet.getBalance());
    }
    @Then("should be dispensed 0_3")
    public void should_be_dispensed_0_3() {
        Assertions.assertEquals(300, preventUserWallet.getBalance());
    }
    @Then("I should be told that The withdrawal must be higher then 0")
    public void i_should_be_told_that_The_withdrawal_must_be_higher_then_0() {
        String expectedOutput = "The withdrawal must be higher then 0";
        Assertions.assertEquals(expectedOutput, preventUserWallet.getAnswer(300,0));
    }
}