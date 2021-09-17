Feature:

  Scenario Outline: prova
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When click BAMBINI
    And click bambino
    And click calze lunghe BAMBINO
    And click prodotto calze lunghe BAMBINO
    And select color calze lunghe BAMBINO
    And select size calze lunghe BAMBINO
    And aggiungi al carrello
    Then i see if element add to cart popup


    Examples:
      |  Country |
      |   it     |
#      |   us     |