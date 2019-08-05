Feature: Add new hotel

  Scenario: Agregar un nuevo hotel
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Offers' link on 'Left Panel' page
    And click 'ManageOfferLi' link on 'Left Panel' page
    And click 'AddOffers' link on 'Main Panel' page