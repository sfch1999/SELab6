@tag
Feature: Calculator

  Scenario: Calculate
    Given Two input values, 10 and 5, and the operand /
    When after calculation
    Then I expect the new result to be 2

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>, and the operand <opt>
    When after calculation
    Then I expect the new result to be <result>

    Examples:
      | first | second | opt | result |
      | 10 | 5 | / | 2 |
      | 16 | 2 | / | 8 |
      | -12 | 6 | / | -2 |
      | 2 | 2 | ^ | 4 |
      | 3 | 3 | ^ | 27 |
      | -4 | 2 | ^ | 16 |