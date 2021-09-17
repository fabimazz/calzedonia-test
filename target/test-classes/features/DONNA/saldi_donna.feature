Feature:

  Scenario Outline: prova donna menu
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When I click DONNA
    And I click saldi DONNA
    And click beachwear
    And click ABITO
    And aggiungi al carrello
#    Then i see carrello

    Examples:
      |  Country |
      |   it     |