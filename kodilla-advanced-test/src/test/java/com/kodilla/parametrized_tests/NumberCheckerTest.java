package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTest {

    private NumberChecker numberChecker = new NumberChecker();
    private StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"","    "})
    public void shouldReturnTrueIfStringIsEmpty (String text){
        assertTrue(stringValidator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNull (String text){
        System.out.println("|" + text + "|");
        assertTrue(stringValidator.isBlank(text));
    }
}