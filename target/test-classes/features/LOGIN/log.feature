Feature:

  Scenario Outline: "sito" | Customer Log In & Log Out
    Given I go on website on country <Country>
    When  I logIn using my Credentials
    Then  I can access my account area
    And   I logOut
    Examples:
      |  Country |
      |   it     |