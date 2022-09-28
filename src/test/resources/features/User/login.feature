Feature: Login
  As a User
  I want to log in
  So I can accsess all of feature

  Scenario: Login with null email and null password
    Given Given I opened the LinkedIn site
    When I didn't enter my email and password
    And I clicked the login button
    Then I can't log in
    And an error message appears

  Scenario: Login with valid email and valid password
      Given I opened the LinkedIn site
      When I input valid email and valid password
      Then I can log in

  Scenario: Login with valid email and null password
    Given I opened the LinkedIn site
    When I input valid email and did not input my password
    Then I can't log in
    And an error message appears


  Scenario: Login with null email and valid password
    Given I opened the LinkedIn site
    When I input valid password
    Then I can't log in
    And an error message appears

  Scenario: Login with invalid email and invalid password
          Given I opened the LinkedIn site
          When I input invalid email and invalid password
          Then I can't log in
          And an error message appears

  Scenario: Login with invalid email and valid password
    Given I opened the LinkedIn site
    When I input invalid email and invalid password
    Then I can't log in
    And an error message appears

  Scenario: Login with valid email and invalid password
    Given I opened the LinkedIn site
    When I input valid email and invalid password
    Then I can't log in
    And an error message appears

  Scenario: Login with google acount
    Given I opened the LinkedIn site
    When I click the field login with google
    And I choose the google acount
    Then  I can log in

  Scenario: Login with apple
    Given I opened the LinkedIn site
    When I click the field login with apple
    And I input my apple ID
    And I input my password
    Then I can log in
