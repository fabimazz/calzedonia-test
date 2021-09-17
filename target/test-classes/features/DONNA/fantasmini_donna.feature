Feature:
 Scenario Outline:
   Given I go on website on country <Country>
   And  I logIn using my Credentials
   And  I can access my account area
   And I click DONNA
   When click calze DONNA
   And click fantasmini DONNA
   Then click prodotto fantasmini DONNA
   And select color fantasmini DONNA
   And select size fantasmini DONNA
   When aggiungi al carrello
   Then i see if element add to cart popup
   When click su cart





   Examples:
     |  Country |
     |   it     |