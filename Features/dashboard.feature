Feature: Dashboard Test Cases

  @dashboard @test
  Scenario: Verify the functionality of search option in dashboard
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    When Enter the search Text as Admin
    Then Verify the Admin tab is available
    Then Logout from the system

  @dashboard @test
  Scenario: Verify the Upgrade option in navigation bar
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    Then Verify the upgrade option in navbar
    Then Logout from the system

  @dashboard @test
  Scenario: Verify the Side navigation minimize arrow
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    When Click the Minimize arrow in side navigation bar
    Then Logout from the system

  @dashboard @test
  Scenario: Verify the Help button is available in dashboard
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    When Click the help button in dashboard
    And Close the window
