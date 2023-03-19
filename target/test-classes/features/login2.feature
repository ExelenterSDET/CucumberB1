@login @regression
Feature: Permissions Login Test
  This is my description and it is totally optional - where you describe your feature, in more details.

#  This is declarative style
  @smoke
  Scenario: valid admin login
    When admin user logs in with valid credentials
    Then admin user logs in successfully

  @smoke
  Scenario: valid ess login
    When ess user logs in with valid credentials
    Then ess user logs in successfully

  Scenario Outline:
    When user enters a valid "<username>" and a valid "<password>"
    And user clicks on the login button
    Then user logs in successfully and a "<message>" is displayed
    Examples:
      | username | password         | message       |
      | Admin    | Exelent2022Sdet! | Welcome Admin |
      | EssUser  | Ess@2023         | Welcome John  |


#  Similar to DataProvider in TestNG
