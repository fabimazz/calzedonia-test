Feature:

  Scenario Outline:

    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    And I click UOMO
    When click promozioni
    And click promozione 1
    Then vedo pagina promozione



    Examples:
      |  Country |
      |   it     |