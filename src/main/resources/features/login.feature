Feature: Login to my website

  Scenario: Successful login to a website
    Given I am on the login page
    When I enter valid username and password
    And I click on Login button
    Then I should be logged in

  Scenario: Log in as blocked user
    Given I am on the login page
    When I enter username and password for blocked user
    And I click on Login button
    Then I should not be logged in
    And Error message should be displayed

