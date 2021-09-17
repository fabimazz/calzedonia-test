Feature:
  #prova checkout con spedizione n°3
  Scenario Outline:prova checkout
    Given I go on website on country <Country>
    And elimina popup cookie
    And  I logIn using my Credentials
    And  I can access my account area
    When click su cart
    And click procedi checkout
    Then vedo pagina checkout
    When select shipment
    And inserisci tutti i dati
    And inserisci dati carta
    Then submit payment


    Examples:
      |  Country |
      |   it     |