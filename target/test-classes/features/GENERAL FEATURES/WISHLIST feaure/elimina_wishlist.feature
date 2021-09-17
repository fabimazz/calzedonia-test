Feature:


  Scenario Outline: "sito" | Customer Log In & Log Out
    Given I go on website on country <Country>
    And elimina popup cookie
    And  I logIn using my Credentials
    And  I can access my account area
    When click wisklist button
    Then cancella prodotti wish


    Examples:
      |  Country |
      |   it     |