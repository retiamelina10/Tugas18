Feature: Invitation
  As a USer
  I want to invite or be invited
  So I can interact with other people

  Scenario: follow recommendation people
    Given I have to logged
    And I go to my network menu
    When I clicking follow in the people recommendations that appear
    Then I can send her message

  Scenario: Connect with people
      Given I have to logged
      And I go to my network menu
      And I go to connection field
      When I clicking connection in the people recommendations that appear
      Then I interaction with the person receiving the connection

    Scenario: Join a group
      Given I have to logged
      And I go to my network menu
      And I go to connection field
      And I click group on the connection field
      When I clicking connection in the group recommendations that appear
      Then I following that group


