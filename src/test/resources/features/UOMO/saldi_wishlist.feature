Feature:

  Scenario Outline:aggiungi alla wishlist
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When I click UOMO
    And I click saldi UOMO
    And I click calzini corti
    And I click primo articolo
    Then aggiungi alla wishlist
#    Then I see wishlist

    Examples:
      |  Country |
      |   it     |
