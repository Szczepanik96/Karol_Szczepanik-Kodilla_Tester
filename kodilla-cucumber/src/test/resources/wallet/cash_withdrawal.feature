Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <number> in my wallet
    When I request <withdraw>
    Then should be dispensed
    Examples:
      | number | withdraw |
      | 200    | 100      |
      | 500    | 500      |
      | 0      | 0        |
      | 1500   | 1499     |