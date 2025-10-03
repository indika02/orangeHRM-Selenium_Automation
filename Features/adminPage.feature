Feature: AdminPage Test cases

  @adminPage @test
  Scenario: Verify the validation messages of Add User form in Admin Page
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    When Click the Admin tab in dashboard
    When Click the Add button in User Management section
    When Click the save button without entering any details
    Then Verify the validation messages for required fields as Required
    Then Logout from the system

  @adminPage @test
  Scenario: Verify the Column headers in User Management table in Admin Page
    Given Load UI
    When Enter the Username Admin
    When Enter the password as admin123
    And Click the login button
    When Click the Admin tab in dashboard
    Then Verify the column headers in user management table as Username, User Role, Employee Name, Status, Actions
    Then Logout from the system
    And Close the window

