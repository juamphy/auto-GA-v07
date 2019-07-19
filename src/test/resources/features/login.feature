Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Rooms' link on 'Left Panel' page
    And click 'Add' link on 'Rooms' page
    And set fields on 'Add Rooms Modal ' on 'Rooms page'