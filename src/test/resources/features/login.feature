Feature: Validaciones de la pagina Login

  Scenario: Cargar pagina PHP Travels
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Cars' link on 'Left Panel' Page
    And Click 'Hotels' link on 'Left Panel' Page
    And  I press 'AddExtras' Page
    And  I press 'PrintExtras ' Page
    And I press 'ExportExtras' Page

