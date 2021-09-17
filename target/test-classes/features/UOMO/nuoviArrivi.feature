Feature:

  Scenario Outline:prova nuovi arrivi BUY
    Given I go on website on country <Country>
    And  I logIn using my Credentials
    And  I can access my account area
    When I click UOMO
    And click nuovi arrivi UOMO
    And click prodotto nuovi arrivi UOMO
    And multiswipe calzini
    And add quantity
    And remove quantity
    And aggiungi al carrello
    Then i see if element add to cart popup

    Examples:
      |  Country |
      |   it     |

