Feature: Search Job
  As a User
  I want to find available jobs
  So I can find a job that suits me

  Scenario: find a job in the job menu
    Given I have to logged
    And I go to j0b menu
    When I clicked show all in the recommendations section for you
    Then I can saw jobs that match what I put in my profile

    Given I have to logged
    And Igo to job menu
    When I go to remote job opportunity
    And I clicked show all
    Then I can saw jobs that are far away

    Given I have to logged
    And I go to job menu
    When I go to another jobs
    Then I can saw another recomandation jobs

  Scenario: find jobs in search bar
    Given I have to logged
    And I go to job menu
    When I go to seach bar
    And I input keywords about the job what to search for
    Then I can see various jobs related to the keywords entered

  Scenario: find jobs in search bar
    Given I have to logged
    When I go to seach bar on dashboard
    And I input keywords about the job what to search for
    Then I can see various jobs related to the keywords entered