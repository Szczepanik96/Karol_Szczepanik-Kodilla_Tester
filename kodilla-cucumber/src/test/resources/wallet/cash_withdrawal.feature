Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <number> in my wallet
    When I request <withdraw>
    Then should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | number | withdraw | balance |
      | 200    | 100      | 100     |
      | 500    | 500      | 0       |
      | 100    | 50       | 50      |
      | 1500   | 1499     | 1       |