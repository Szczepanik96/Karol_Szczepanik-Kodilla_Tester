package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringSources {
    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    static Stream<Arguments> provideStringsForTestingBMI(){
        return Stream.of(
                Arguments.of(80,1.80,"Normal (healthy weight)"),
                Arguments.of(120,1.95,"Obese Class I (Moderately obese)"),
                Arguments.of(60,1.5,"Overweight"),
                Arguments.of(40,1.8,"Very severely underweight"),
                Arguments.of(85,1.75,"Overweight"),
                Arguments.of(145,1.7,"Obese Class V (Super Obese)"),
                Arguments.of(130,1.45,"Obese Class VI (Hyper Obese)"),
                Arguments.of(50,1.65,"Underweight")
        );
    }
}