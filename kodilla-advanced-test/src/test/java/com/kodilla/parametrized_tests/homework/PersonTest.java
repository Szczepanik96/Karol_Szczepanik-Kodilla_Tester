package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

      @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingBMI")
    public void testGetBMI(Person person,String expectedBMI){

        String actualBMI = person.getBMI();
        assertEquals(expectedBMI,actualBMI);
    }
}