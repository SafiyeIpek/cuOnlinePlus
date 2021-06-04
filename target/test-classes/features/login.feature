@login
Feature: Users should be able to login

  Scenario:
    Given the user is on the login page
    When the user enters username, password and access key
    Then the user should be able to login
