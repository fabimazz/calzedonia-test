Feature:

  Scenario Outline: prova saldi BAMBINI
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When click BAMBINI
    And click saldi BAMBINI
    And click Calzini BAMBINI
    And click prodotto BAMBIBNI
    And aggiungi al carrello
    Then i see if element add to cart popup


    Examples:
      |  Country |
      |   it     |