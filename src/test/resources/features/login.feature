Feature: Validaciones de la pagina Login

  Scenario: Cargar pagina PHP Travels
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Cars' link on 'Left Panel' Page
    And Click 'Hotels' link on 'Left Panel' Page
    And I press 'ButtonAdd' page
    And I validation of fields 'Add Extras' Page
    And I press 'SaveReturn' page
    And I press 'EditButtonExtras' page
    And I press 'EditSave' page
    And I press 'ShowExtras' page
    And I press 'Assign' page
    And I press save 'UpdateAssign' page
    And  I press 'PrintExtras ' Page
    And I press 'ExportExtras' Page

