Feature:

  Scenario Outline:

    Given I go on website on country <Country>
    And elimina popup cookie
    And  I logIn using my Credentials
    And  I can access my account area
    Then I logOut
    When click calzedonia
    And click omino guest
    And login
    Then verifica pagina






    Examples:
      |  Country |
      |   it     |