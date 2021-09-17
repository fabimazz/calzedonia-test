Feature:
  Scenario Outline:prova categia jeans
    Given I go on website on country <Country>
    And elimina popup cookie
    When  I logIn using my Credentials
    Then  I can access my account area
    When I click DONNA
    And click leggings DONNA
    And click jeans DONNA
    Then vedo la pagina jeans DONNA
    And click prodotto jeans DONNA
#    And stampa




    Examples:
      |  Country |
      |   it     |