Feature: Frevvo Login

  Scenario: Test Login with valid credentail
    Given Open chrome and start appliction
    When Enter valid "kamal@qafrevvo" and "qafrevvo"
    And Click on login button
    Then user should able to login successfully
    #Then Close the browser
    Then Click on plus icon
    Then Click on upload project
    Then Click on Choose project