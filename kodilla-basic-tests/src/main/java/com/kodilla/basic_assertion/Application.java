package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 56;
        int b = 35;
        int sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(91, sumResult);
        if (correct) {
            System.out.println("System działa prawidłowo dla liczb " + a + " i " + b);
        } else {
            System.out.println("System nie działa prawidłowo dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(a, b);
        boolean correct1 = ResultChecker.assertEquals(21, subResult);
        if (correct1) {
            System.out.println("System działa prawidłowo dla liczb " + a + " i " + b);
        } else {
            System.out.println("System nie działa prawidłowo dla liczb " + a + " i " + b);
        }

        double sqrResult = calculator.sqr(a);
        boolean correct2 = ResultChecker.assertEquals(3136, sqrResult);
        if (correct2) {
            System.out.println("System działa prawidłowo dla liczby " + a);
        } else {
            System.out.println("Sysytem nie działa prawidłowo dla liczby " + a);
        }
    }
}