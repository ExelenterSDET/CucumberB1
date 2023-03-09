@login2
Feature: Login Test
  This is my description and it is totally optional - where you describe your feature, in more details.

#  This is declarative style
  Scenario: valid admin login
    When admin user logs in with valid credentials
    Then admin user logs in successfully

  Scenario: valid ess login
    When ess user logs in with valid credentials
    Then ess user logs in successfully

