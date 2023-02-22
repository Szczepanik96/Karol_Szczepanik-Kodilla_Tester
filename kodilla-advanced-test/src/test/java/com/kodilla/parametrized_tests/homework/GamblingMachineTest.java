package com.kodilla.parametrized_tests.homework;

//class GamblingMachineTest {
//    private final GamblingMachine gamblingMachine = new GamblingMachine();

//    @ParameterizedTest
//    @CsvFileSource(resources = "/howManyWins.csv", numLinesToSkip = 1, delimiter = ':')
//    public void shouldCountEveryTimeIfUserNumberAndComputerNumberWillBeTheSame(String inputNumber, int expectedOutput) throws InvalidNumbersException {
//        String[] numbersArray = inputNumber.split(",");
//        Set<Integer> userNumbers = new HashSet<>();
//        for (String number : numbersArray) {
//            userNumbers.add(Integer.parseInt(number));
//        }
//        int result = gamblingMachine.howManyWins(userNumbers);
//        assertEquals(expectedOutput,result);
//    }
//    @ParameterizedTest
//    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1, delimiter = ':')
//    public void invalidNumbersProvidedShouldThrowInvalidNumbersException(String invalidInput) throws InvalidNumbersException{
//        String[] numbersArray = invalidInput.split(",");
//        Set<Integer> invalidNumbers = new HashSet<>();
//        for (String number:numbersArray){
//            invalidNumbers.add(Integer.parseInt(number));
//        }
//        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(invalidNumbers));
//    }
//}