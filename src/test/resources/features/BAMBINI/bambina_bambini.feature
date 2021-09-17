Feature:

  Scenario Outline: prova pagina bambina
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When click BAMBINI
    And click bambina
    And click calze corte bambina
    And click su prodotto calze corte bambina
    And select type calza corta bambina
    And select age calza corta bambina
    And aggiungi al carrello
    Then i see if element add to cart popup

    Examples:
      |  Country |
      |   it     |