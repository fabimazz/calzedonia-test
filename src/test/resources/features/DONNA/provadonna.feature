Feature:
  Scenario Outline:prove varie
    Given I go on website on country <Country>
    And elimina popup cookie
    When  I logIn using my Credentials
    Then  I can access my account area
    When I click DONNA
    And pass leggings DONNA
    And click jeansMENU
#    And screenshot
#    And get title





    Examples:
      |  Country |
      |   it     |