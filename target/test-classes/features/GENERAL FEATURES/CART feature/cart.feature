Feature:


  Scenario Outline: "sito" | Customer Log In & Log Out
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When click su cart
#    Then click inizia lo shopping cart
    Then click vai a wishlist

    Examples:
      |  Country |
      |   it     |