Feature: Print the hotel List

  Scenario: Imprimir la lista de Hoteles
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Offers' link on 'Left Panel' page
    And click 'ManageOfferLi' link on 'Left Panel' page
    And click 'DeleteOffers' button on 'Main Panel' page