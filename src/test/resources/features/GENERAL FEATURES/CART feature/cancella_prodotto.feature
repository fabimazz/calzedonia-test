Feature:

 Scenario Outline:cancella prodotti nel carrello
   Given I go on website on country <Country>
   And elimina popup cookie
   And  I logIn using my Credentials
   And  I can access my account area
   When click su cart
   And cancella prodotto
   Then I logOut





   Examples:
     |  Country |
     |   it     |