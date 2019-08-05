Feature: Print the hotel List

  Scenario: Imprimir la lista de Hoteles
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Hotels' link on 'Left Panel' page
    And click 'HotelsLi' link on 'Left Panel' page
    And click 'Print' button on 'Main Panel' page