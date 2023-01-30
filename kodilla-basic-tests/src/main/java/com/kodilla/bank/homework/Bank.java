package com.kodilla.bank.homework;

import java.util.Random;

public class Bank {

    public CashMachine[] allCashMachines;

    public Bank(int cashMachineCnt) {
        allCashMachines = new CashMachine[cashMachineCnt];
        for (int i = 0; i < cashMachineCnt; i++) {
            allCashMachines[i] = new CashMachine();
        }
    }

    public int getBalanceFromAll(CashMachine[] cashMachines) {
        int sum = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            sum += cashMachine.getBalance();
        }
        return sum;
    }

    public int getBalanceFromAll() {
        return this.getBalanceFromAll(this.allCashMachines);
    }

    public int numberOfAllTransactions(CashMachine[] cashMachines) {

        int sum = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            sum += cashMachine.numberOfTransactions;
        }
        return sum;
    }

    public int getNumberOfAllTransactions() {

        return this.numberOfAllTransactions(this.allCashMachines);
    }

    public int getNumberOfAllPayouts(CashMachine[] cashMachines) {

        int numberOfAllPayouts = 0;


        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            numberOfAllPayouts += cashMachine.getNumberOfPayouts();
        }
        return numberOfAllPayouts;
    }

    public int getNumberOfAllPayouts() {
        return this.getNumberOfAllPayouts(this.allCashMachines);
    }

    public int getNumberOfAllPaychecks(CashMachine[] cashMachines) {

        int numberOfAllPaychecks = 0;

        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            numberOfAllPaychecks += cashMachine.getNumberOfPaychecks();
        }
        return numberOfAllPaychecks;
    }

    public int getNumberOfAllPaychecks() {
        return this.getNumberOfAllPaychecks(this.allCashMachines);
    }

    double getAveragePayouts() {

        int payouts = 0;
        int countNumberOfPayouts = 0;

        for (int i = 0; i < allCashMachines.length; i++) {
            CashMachine onlyPayoutsFromAllCashMachines = allCashMachines[i].getCashMachineWithPayoutsOnly();
            for (int j = 0; j < onlyPayoutsFromAllCashMachines.getTransactions().length; j++) {
                int payout = onlyPayoutsFromAllCashMachines.getTransactions()[j];
                payouts += payout;
                countNumberOfPayouts++;
            }
        }
        return (double) payouts / countNumberOfPayouts;
    }

    double getAveragePaychecks() {

        int paychecks = 0;
        int countNumberOfPaychecks = 0;

        for (int i = 0; i < allCashMachines.length; i++) {

            CashMachine onlyPaychecksFromAllCashMachines = allCashMachines[i].getCashMachineWithPaychecksOnly();
            for (int j = 0; j < onlyPaychecksFromAllCashMachines.getTransactions().length; j++) {
                int paycheck = onlyPaychecksFromAllCashMachines.getTransactions()[j];
                paychecks += paycheck;
                countNumberOfPaychecks++;
            }
        }
        return (double) paychecks / countNumberOfPaychecks;
    }
}