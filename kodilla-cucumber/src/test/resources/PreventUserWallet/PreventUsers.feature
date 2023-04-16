Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance or provide wrong number to the system.
    Given there is <deposit> in my wallet
    When I withdraw <amount>
    Then should be dispensed <paid>
    And I should be told that <answer>
    Examples:
      | deposit    | amount | paid | answer                                      |
      | 500        | 500    | 500  | Your transaction is done - 500              |
      | 2147483647 | 7      | 7    | Your transaction is done - 7                |
      | 0          | 100    | 0    | The lowest deposit value is 1               |
      | 1000       | 1100   | 0_2  | You don't have enough money in your wallet! |
      | 300        | 0      | 0_3  | The withdrawal must be higher then 0        |