Feature: Adding multiple employees
  To perform Data Driven Testing in Cucumber we use Scenario Online

  Scenario Outline: Adding multiple employees
    Given user logs in with valid admin credentials
    And user navigates to the add employee page
    When user enters new employee's "<First Name>", "<Middle Name>", and "<Last Name>"
    And user clicks on the save button
    Then new employee "<Full Name>" is added successfully
    Examples:
      | First Name | Middle Name | Last Name | Full Name             |
      | Lily       | M.          | Graham    | Lily M. Graham        |
      | Benjamin   | J.          | Parker    | Benjamin J. Parker    |
      | Sophia     | L.          | Kim       | Sophia L. Kim         |
      | David      | A.          | Evans     | David A. Evans        |
      | Gabrielle  | R.          | Thompson  | Gabrielle R. Thompson |

#    Alternatively, you can do this
#    Then new employee "<First Name> <Middle Name> <Last Name>" is added successfully
#    Examples:
#      | First Name | Middle Name | Last Name |
#      | Lily       | M.          | Graham    |
#      | Benjamin   | J.          | Parker    |
#      | Sophia     | L.          | Kim       |
#      | David      | A.          | Evans     |
#      | Gabrielle  | R.          | Thompson  |


    """
    Expected is local = Full name column, ex:  "Lily M. Graham"
    Actual full name is coming from Personal Details Page header.
    """