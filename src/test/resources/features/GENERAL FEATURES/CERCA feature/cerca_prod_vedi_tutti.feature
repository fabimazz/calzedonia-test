Feature:

  Scenario Outline:cerca prodotto (click su vetti tutti gli elementi)
    Given I go on website on country <Country>
    And elimina popup cookie
    When I logIn using my Credentials
    Then I can access my account area
    When click cerca and insert key
    Then i see page search





    Examples:
      |  Country |
      |   it     |