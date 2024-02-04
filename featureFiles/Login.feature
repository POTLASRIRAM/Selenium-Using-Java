Feature: User Login

  Scenario: Successful Login
    Given the user opened the app
    And the user navigated to login page
    When user entered valid username and valid password(username : "test@gmail.com", password : "test@123")
    And user clicked on submit button
    Then user should see login successful
