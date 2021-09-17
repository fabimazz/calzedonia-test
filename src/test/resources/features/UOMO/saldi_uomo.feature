Feature:

  Scenario Outline:prova saldi UOMO
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When I click UOMO
    And I click saldi UOMO
    And I click calzini corti
    And I click primo articolo
    And aggiungi al carrello
    Then i see if element add to cart popup

    Examples:
      |  Country |
      |   it     |

