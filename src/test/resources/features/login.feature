Feature: Validaciones de la pagina Login

  Scenario: Cargar pagina PHP Travels
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page

  Scenario: Imprimir pagina de Reviews Management
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Print' button on Reviews Management Page

  Scenario: Exportar CSV document
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Export into CSV' button on Review Managements Page

  Scenario: Editar registro de los reviews
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Edit button' icon on first row
    And Fill fields on Edit form

  Scenario: Editar registro de los reviews sin guardar
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Edit button' icon on first row
    And Click 'Return' button on Edit form
    And Fill fields on Edit form
    And Click 'Return' button on Edit form

  Scenario: Editar registro de los reviews con save
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Edit button' icon on first row
    And Click 'Return' button on Edit form
    And Fill fields on Edit form
    And Click 'Save & Return' Button on Edit form