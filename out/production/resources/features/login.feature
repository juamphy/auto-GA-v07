Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Hotels' link on 'Left Panel' page
    And click 'HotelsLi' link on 'Left Panel' page
    And click 'AddHotel' link on 'Main Panel' page
#    And click 'SelectAll' link on 'Main Panel' page