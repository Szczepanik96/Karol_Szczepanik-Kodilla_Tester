package PreventUserWallet;

public class PreventUserWallet {

    private int balance;

    public void PreventUserWallet() {
    }

    public void deposit(int money) {
        if (money <= 0) {
            return;
        } else if (money > 2147483647) {
            return;
        } else {
            this.balance += money;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if (money <= 0) {
            return;
        } else if (money > balance) {
            return;
        } else if (money > 2147483647) {
            return;
        } else {
            this.balance -= money;
        }
    }

    public String getAnswer(int depositSize, int withdrawSize) {

        PreventUserWallet preventUserWallet = new PreventUserWallet();

        if (depositSize >= withdrawSize && withdrawSize > 0) {
            return "Your transaction is done";
        } else if (depositSize < withdrawSize && depositSize > 0) {
            return "You don't have enough money in your wallet!";
        } else if (depositSize <= 0) {
            return "The lowest deposit value is 1";
        } else if (depositSize > 2147483647) {
            return "The deposit amount is too high, please reduce the payment";
        } else if (withdrawSize <= 0) {
            return "The withdrawal must be higher then 0";
        } else if (withdrawSize > 2147483647) {
            return "The withdraw is too high, please reduce the amount";
        }
        return "Something goes WRONG";
    }
}