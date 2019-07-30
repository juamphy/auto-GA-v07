Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page
    And click 'Rooms' link on 'Left Panel' page
    And click 'Add' link on 'Rooms' page
    And set fields on 'Add Rooms Modal ' on 'Rooms page'


    Scenario: Select Tours Left Panel
      Given I load PHP travels Case Tour-Tours
      And set my credencials  on 'Login' page Case Tour-Tours
      And click 'Tours' link on 'Left Panel' page
      And Click 'Tours' in a Select Options Tours


      Scenario: Click Add Button And fill Fields
        Given I load PHP travels Case Add Button
        And set my credencials  on 'Login' case Add Button
        And click 'Tours' link on 'Left Panel' page case Add Button
        And Click 'Tours' in a Select Options Tours case Add Button
        And click in 'Add Tours' on 'Tours page' and Fill Fields