Feature:Login tests

  Scenario: Valid user login test
    Given user is on the exelenter webpage
    When user logs in with valid admin credentials
    Then welcome message is displayed in dashboard page

  Scenario: Valid username invalid password test
    Given user is on the exelenter webpage
    When user pass the valid username and invalid password
    Then login error message for invalid password is displayed

  Scenario: Valid username empty password test
    Given user is on the exelenter webpage
    When user pass the valid username and empty password
    Then login error message for empty password is displayed


    #  TestNG  order ===> Actual, Expected, Optional Message.
    #  JUnit   order ===> Optional Message, Expected, Actual