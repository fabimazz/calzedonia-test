@txn
Feature:

  Scenario Outline: prova nuovi arrivi BAMBINI
    Given I go on website on country <Country>
    And I logIn using my Credentials
    And I can access my account area
    When click BAMBINI
    And click nuovi arrivi BAMBINI
    And click prodotto nuovi arrivi BAMBINI
    And seleziono tipo
    And seleziono eta
    And aggiungi al carrello
    And i see if element add to cart popup
    Then click su cart


    Examples:
      |  Country |
      |   it     |