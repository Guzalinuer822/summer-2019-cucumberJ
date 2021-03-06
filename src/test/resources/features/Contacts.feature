Feature: Contacts Page

  Scenario: Default page number
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Customers" to "Contacts"
    Then default page number should be 1


  Scenario: verify default events
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Fleet" to "Vehicles"


  Scenario: Menu option
    Given the user logged in as a "driver"
    Then the user should see following menu options
      | Fleet      | Customers  | Activities | System     |


  Scenario: Menu option
    Given the user is on the login page
    Then the user logs in using following credentials
      | username  | user1       |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |
    Then the user should be able to login

