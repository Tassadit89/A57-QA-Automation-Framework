Feature: Login feature

  Scenario:
    Given I open browser
    And I open login page
    When I enter email "tassadit.talbi@testpro.io"
    And I enter password "Password2026@"
    And I submit
    Then I am logged in
