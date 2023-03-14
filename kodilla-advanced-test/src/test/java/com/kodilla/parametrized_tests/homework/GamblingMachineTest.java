//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//class GamblingMachineTest {
//    private GamblingMachine gamblingMachine = new GamblingMachine();
//    private Set<Integer> userNumbers;
//    private Set<Integer> invalidNumbers;
//
//    @BeforeEach
//    public void setUp(){
//        userNumbers = new HashSet<>();
//        invalidNumbers = new HashSet<>();
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/howManyWins.csv", numLinesToSkip = 1, delimiter = ':')
//    public void shouldCountEveryTimeIfUserNumberAndComputerNumberWillBeTheSame(String inputNumber, int expectedOutput) throws InvalidNumbersException {
//        String[] numbersArray = inputNumber.split(",");
//        for (String number : numbersArray) {
//            userNumbers.add(Integer.parseInt(number));
//        }
//        int result = gamblingMachine.howManyWins(userNumbers);
//        assertEquals(expectedOutput,result);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1, delimiter = ':')
//    public void invalidNumbersProvidedShouldThrowInvalidNumbersException(String invalidInput) throws InvalidNumbersException{
//        String[] numbersArray = invalidInput.split(",");
//        for (String number:numbersArray){
//            invalidNumbers.add(Integer.parseInt(number));
//        }
//        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(invalidNumbers));
//    }
//}