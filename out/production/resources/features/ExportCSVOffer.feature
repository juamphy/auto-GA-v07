Feature: Export to CSV document

  Scenario: Exportar la lista de hoteles a un CSV
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Offers' link on 'Left Panel' page
    And click 'ManageOfferLi' link on 'Left Panel' page
    And click 'ExportOffers' button on 'Main Panel' page