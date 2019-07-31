Feature: Validaciones de la pagina Login

#  Scenario: Cargar pagina PHP Travels
#    Given I load PHP Travels
#    And set my credentials  on 'Login' page
#    And Click 'Hotels' link on 'Left Panel' Page
#
#  Scenario: Imprimir pagina de Reviews Management
#    Given I load PHP Travels
#    And set my credentials  on 'Login' page
#    And Click 'Hotels' link on 'Left Panel' Page
#    And Click 'Print' button on Reviews Management Page

  Scenario: Exportar CSV document
    Given I load PHP Travels
    And set my credentials  on 'Login' page
    And Click 'Hotels' link on 'Left Panel' Page
    And Click 'Export into CSV' button on Review Managements Page