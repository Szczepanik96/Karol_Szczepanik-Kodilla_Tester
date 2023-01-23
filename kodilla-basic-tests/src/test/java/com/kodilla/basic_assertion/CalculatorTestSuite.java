package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 56;
        int b = 35;
        double sumResult = calculator.add(a, b);
        assertEquals(91, sumResult);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int a = 56;
        int b = 35;
        double subResult = calculator.sub(a,b);
        assertEquals(21, subResult);
    }

    @Test
    public void testSqr(){
        Calculator calculator = new Calculator();
        double a = -2.5;
        double b = 0;
        double c = 5;

        double sqrResult = calculator.sqr(a);
        double sqrResult1 = calculator.sqr(b);
        double sqrResult2 = calculator.sqr(c);
        assertEquals(6.25, sqrResult);
        assertEquals(0,sqrResult1);
        assertEquals(25,sqrResult2);
    }
}