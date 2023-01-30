package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cashMachine;

    Bank bank;

    @BeforeEach
    public void setUp() {
        this.cashMachine = new CashMachine();
        this.bank = new Bank(10);
    }

    @Test

    public void totalBalanceTest() {
        for (int i = 0; i < bank.allCashMachines.length; i++) {
            int transactions = 4;
            for (int j = 0; j < transactions; j++) {
                bank.allCashMachines[i].newTransaction(200);
            }
        }

        assertEquals(8000, bank.getBalanceFromAll());
    }

    @Test

    public void shouldReturnNumberOfAllTransactions() {

        bank.allCashMachines[0].newTransaction(0);
        bank.allCashMachines[2].newTransaction(-1);
        bank.allCashMachines[3].newTransaction(2);
        bank.allCashMachines[9].newTransaction(1234);
        bank.allCashMachines[2].newTransaction(1234);

        assertEquals(4, bank.getNumberOfAllTransactions());
    }

    @Test

    public void shouldReturnNumbersOfPayoutsFromAllCashMachines() {

        bank.allCashMachines[0].newTransaction(0);
        bank.allCashMachines[2].newTransaction(-1);
        bank.allCashMachines[3].newTransaction(2);
        bank.allCashMachines[9].newTransaction(1234);
        bank.allCashMachines[2].newTransaction(-14);
        bank.allCashMachines[0].newTransaction(-124);
        bank.allCashMachines[1].newTransaction(636);
        bank.allCashMachines[4].newTransaction(-12);
        bank.allCashMachines[5].newTransaction(123);
        bank.allCashMachines[6].newTransaction(-123);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(12);

        assertEquals(8, bank.getNumberOfAllPayouts());
    }

    @Test

    public void shouldReturnNumbersOfPaychecksFromAllCashMachines() {

        bank.allCashMachines[0].newTransaction(0);
        bank.allCashMachines[2].newTransaction(-1);
        bank.allCashMachines[3].newTransaction(2);
        bank.allCashMachines[9].newTransaction(1234);
        bank.allCashMachines[2].newTransaction(-14);
        bank.allCashMachines[0].newTransaction(-124);
        bank.allCashMachines[1].newTransaction(636);
        bank.allCashMachines[4].newTransaction(-12);
        bank.allCashMachines[5].newTransaction(123);
        bank.allCashMachines[6].newTransaction(-123);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(-12);
        bank.allCashMachines[6].newTransaction(12);

        assertEquals(5, bank.getNumberOfAllPaychecks());
    }

    @Test

    public void shouldReturnAverageOfPayoutsFromAllCashMachines() {

        bank.allCashMachines[0].newTransaction(0);
        bank.allCashMachines[2].newTransaction(-101);
        bank.allCashMachines[3].newTransaction(2);
        bank.allCashMachines[9].newTransaction(1234);
        bank.allCashMachines[2].newTransaction(-200);
        bank.allCashMachines[0].newTransaction(-300);
        bank.allCashMachines[1].newTransaction(636);
        bank.allCashMachines[4].newTransaction(-400);
        bank.allCashMachines[5].newTransaction(123);
        bank.allCashMachines[6].newTransaction(-500);
        bank.allCashMachines[6].newTransaction(-600);
        bank.allCashMachines[6].newTransaction(-700);
        bank.allCashMachines[6].newTransaction(-800);
        bank.allCashMachines[6].newTransaction(12);

        assertEquals(-450.1, bank.getAveragePayouts(), 0.1);
    }

    @Test

    public void shouldReturnAverageOfPaychecksFromAllCashMachines() {

        bank.allCashMachines[0].newTransaction(0);
        bank.allCashMachines[2].newTransaction(-101);
        bank.allCashMachines[3].newTransaction(257);
        bank.allCashMachines[9].newTransaction(1240);
        bank.allCashMachines[2].newTransaction(-200);
        bank.allCashMachines[0].newTransaction(-300);
        bank.allCashMachines[1].newTransaction(630);
        bank.allCashMachines[4].newTransaction(-400);
        bank.allCashMachines[5].newTransaction(2200);
        bank.allCashMachines[6].newTransaction(-500);
        bank.allCashMachines[6].newTransaction(-600);
        bank.allCashMachines[6].newTransaction(-700);
        bank.allCashMachines[6].newTransaction(-800);
        bank.allCashMachines[6].newTransaction(1200);

        assertEquals(1105.4, bank.getAveragePaychecks(), 0.1);
    }
}