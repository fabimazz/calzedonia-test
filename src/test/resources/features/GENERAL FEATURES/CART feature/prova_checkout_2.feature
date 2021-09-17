Feature:

  Scenario Outline:prova checkout2
    Given I go on website on country <Country>
    And elimina popup cookie
    And  I logIn using my Credentials
    And  I can access my account area
    When click su cart
    And click procedi checkout
    Then vedo pagina checkout
    When select shipment2
    And inserisci tutti i dati
    And inserci altri dati
    And inserisci dati carta
    Then submit payment


    Examples:
      |  Country |
      |   it     |