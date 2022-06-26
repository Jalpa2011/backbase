Feature: Test the functionality of backbasecloud

  Scenario: Test homepage functionality
    Given browse is open
    And user is on homepage
    When user click on globle feed tab
    And varify globle feed tab working correctly

  Scenario: Test the login functionality
    Given user is on homepage
    When user click on login button
    Then user give email and password details for login account
    And click on submit button
    And varify user sucssefully login

  Scenario: Test the setting page functionality
    Given user is on setting page
    When user type on short bio field
    Then user click on update setting button
    And varify user sucssefully update account

  Scenario: Test the article page functionality
    Given user is on home page
    When user click on New Article button
    Then provide all details in article field
    And click on publish article button
    Then varify sucssefully add article
    And click on delete article button

  Scenario: Test user profile functionality
    Given user on homepage
    When user click on profile name button
    Then system showing all articles and user info
    And browser close
