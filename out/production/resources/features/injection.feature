Feature: Validaciones de la pagina de Login con injection

  Scenario: Cargar Pagina PHP Travels con injection
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Logout' button on 'Header' page