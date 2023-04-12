Feature: Is it Fizz or Buzz?

  Scenario Outline: Number is fizz or buzz or both
    Given number to check <number>
    When I ask for divisibility
    Then it should told <answer>
    Examples:
      | number | answer     |
      | 9      | "Fizz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 20     | "Buzz"     |
      | 1      | "None"     |
      | 4      | "None"     |
      | 150    | "FizzBuzz" |