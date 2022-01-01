Feature: User Login

  Scenario Outline: Login with valid data

    Given User is at login page.

    Examples:
      |U_Name|Password|
      |abc|x          |