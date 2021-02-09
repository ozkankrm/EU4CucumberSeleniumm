Feature: Login as different users

  @smoke
  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs is using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"



