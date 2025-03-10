Feature: Login page test cases

  @login @test
  Scenario: Login as a Admin
    Given Load UI
    Then Enter the Username Admin
    Then Enter the password as admin123
    Then Click the login button
    Then Logout from the system


  @login @test
  Scenario: Verify the Footer text is correct
    Given Load UI
    Then Verify the Footer text is OrangeHRM OS 5.7
    And Close the window
