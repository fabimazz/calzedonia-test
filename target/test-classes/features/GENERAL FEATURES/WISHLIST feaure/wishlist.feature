Feature:


  Scenario Outline: "sito" | Customer Log In & Log Out
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When click wisklist button
    And click inizia lo shopping
    Then vedo la pagina


    Examples:
      |  Country |
      |   it     |