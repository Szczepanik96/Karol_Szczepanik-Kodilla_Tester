package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private int amount;
    private int answer;
    private int withdraw;


    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited 200 in my wallet")
    public void i_have_deposited_200_in_my_wallet() {
        this.amount = 200;
        wallet.deposit(amount);
        Assertions.assertEquals(200, wallet.getBalance());
    }

    @Given("I have deposited 500 in my wallet")
    public void i_have_deposited_500_in_my_wallet() {
        this.amount = 500;
        wallet.deposit(amount);
        Assertions.assertEquals(500, wallet.getBalance());
    }
    @Given("I have deposited 0 in my wallet")
    public void i_have_deposited_0_in_my_wallet() {
        this.amount = 0;
        wallet.deposit(amount);
        Assertions.assertEquals(0, wallet.getBalance());
    }
    @Given("I have deposited 1500 in my wallet")
    public void i_have_deposited_1500_in_my_wallet() {
        this.amount = 1500;
        wallet.deposit(amount);
        Assertions.assertEquals(1500, wallet.getBalance());
    }

    @When("I request 100")
    public void i_request_100() {
        this.withdraw = 100;
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }

    @When("I request 500")
    public void i_request_500() {
        this.withdraw = 500;
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @When("I request 0")
    public void i_request_0() {
        this.withdraw = 0;
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }
    @When("I request 1499")
    public void i_request_1499() {
        this.withdraw = 1499;
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, this.withdraw);
    }

    @Then("should be dispensed")
    public void $_should_be_dispensed() {
        Assertions.assertEquals(this.withdraw, cashSlot.getContents());
    }
}