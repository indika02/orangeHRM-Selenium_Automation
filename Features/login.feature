Feature: Login page test cases

  @login @test @severity:Critical
  Scenario: Login as a Admin
    Given Load UI
    When Enter the Username and password
    And Click the login button
    Then Logout from the system

  @login @test @severity:Minor
  Scenario: Verify the Footer text is correct
    Given Load UI
    Then Verify the Footer text is OrangeHRM OS 5.7

  @login @test @severity:Critical
    Scenario: Verify the forgot password link is working
      Given Load UI
      When Click the forgot password link
      Then Verify the Reset Password page heading is displayed as Reset Password

  @login @test @severity:Critical
  Scenario: Login with invalid credentials
    Given Load UI
    When Enter the Username as Admin1
    When Enter the password as admin1234ffs
    And Click the login button
    Then Verify the invalid login error message as Invalid credentials

  @login @test @severity:Critical
  Scenario: Login with empty credentials with validation messages check
    Given Load UI
    When Click the login button
    Then Verify the username validation message as Required
    And Verify the password validation message as Required

  @login @test  @severity:Minor
  Scenario: Verify the login page logo is displayed
    Given Load UI
    Then Verify the login page logo is displayed
    And Close the window


