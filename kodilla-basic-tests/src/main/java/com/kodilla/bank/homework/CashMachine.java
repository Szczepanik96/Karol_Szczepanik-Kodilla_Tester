package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;

    int numberOfTransactions;

    public CashMachine() {

        this.transactions = new int[0];
        this.numberOfTransactions = 0;
    }

    public int newTransaction(int transaction) {
        if (transaction == 0) {
            System.out.println("Wrong amount provided");
            return 0;
        } else {
            this.numberOfTransactions++;
            int[] newTab = new int[this.numberOfTransactions];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.numberOfTransactions - 1] = transaction;
            this.transactions = newTab;
            return transaction;
        }
    }

    public int[] getTransactions() {
        return this.transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        System.out.println("The balance of account is: ");
        return sum;
    }

    public int getNumberOfPayouts() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sum++;
            }
        }
        System.out.println("Number of payouts is: " + sum);
        return sum;
    }

    public int getNumberOfPaychecks() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                sum++;
            }
        }
        System.out.println("Number of paychecks is: " + sum);
        return sum;
    }

    public CashMachine getCashMachineWithPayoutsOnly() {

        CashMachine cashMachine = new CashMachine();
        for (int i = 0; i < transactions.length; i++) {
            int transaction = transactions[i];
            if (transaction < 0) {
                cashMachine.newTransaction(transaction);
            }
        }
        return cashMachine;
    }

    public CashMachine getCashMachineWithPaychecksOnly() {

        CashMachine cashMachine = new CashMachine();
        for (int i = 0; i < transactions.length; i++) {
            int transaction = transactions[i];
            if (transaction > 0) {
                cashMachine.newTransaction(transaction);
            }
        }
        return cashMachine;
    }
}