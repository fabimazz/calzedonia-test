Feature:

  Scenario Outline:prova calze UOMO
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When I click UOMO
    And click calze
    And click pedulini
    And click prodotto calze UOMO
    And select color
    And select size
    And aggiungi al carrello
    Then i see if element add to cart popup





    Examples:
      |  Country |
      |   it     |
