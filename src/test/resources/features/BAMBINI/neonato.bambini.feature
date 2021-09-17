Feature:

  Scenario Outline: prova pagina neonato_bambini
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When click BAMBINI
    And click neonato BAMBINI
    And click calze neonato BAMBINI
    And click prodotto calze neonato BAMBINI
    And select type calze neonato BAMBINI
    And select size calze neonato BAMBINI
    And aggiungi al carrello
    Then i see if element add to cart popup


    Examples:
      |  Country |
      |   it     |
#      |   us     |