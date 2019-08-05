Feature: Export to CSV document

  Scenario: Exportar la lista de hoteles a un CSV
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Hotels' link on 'Left Panel' page
    And click 'HotelsLi' link on 'Left Panel' page
    And click 'Export' button on 'Main Panel' page