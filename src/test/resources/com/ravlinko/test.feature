Feature: The best issue resolving feature

  Scenario: Google it
    Given open 'https://www.google.com'
    And type '42' into search input
    Then you are there
