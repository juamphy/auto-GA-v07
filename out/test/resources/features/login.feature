#Feature: Validaciones de la pagina Login
##first scenario
#  Background:Cargar pagina PHP Travels
#    Given I load PHP Travels
#    And set my credentials  on 'Login' page
#
#
###Second scenario
#  Scenario:  Presionar el menú "Cars"
#    And Click 'Cars' link on 'Left Panel' Page

  ##Thirds Scenario:
# Scenario:  Presionar el menú "Tours" extras
#    And Click 'Hotels' link on 'Left Panel' Page

##Fours scenario
#    Scenario:  Presionar el menú "Tours" extras magements
#      Given And click 'Tours' link on 'Left Panel' Page

  ##Four ,Six  scenario

  #  Scenario: Press button add of "Tours" and Validacion of Fields
  #    Given And click 'Tours' link on 'Left Panel' Page
  #    And I press 'ButtonAdd' page
  #    And I validation of fields 'Add Extras' Page
  #    And I press 'SaveReturn' page


  ##Seven scenario
#  Scenario: Press button Edit of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'EditButtonExtras' page
#    And I press 'EditSave' page

##Eight scenario
#  Scenario: Press button Show of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'ShowExtras' page
##Nine scenario
#  Scenario: Press button Assign of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'Assign' page
#    And I press save 'UpdateAssign' page

##ten scenario
#  Scenario: Press button Translate of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'Translate' page

##Eleven scenario
#  Scenario: Press button Delete of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'Delete' Page

##12,13,14 Scenario:
#  Scenario: Press button Filtersearch of "Tours" by name and Price and Thumb
#    Given And click 'Tours' link on 'Left Panel' Page
    #And I press 'FilterByName' Page

##15 scenario:
#  Scenario: Press button Print of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And  I press 'PrintExtras ' Page
## 16 Scenario:
#  Scenario: Press button ExportCSV of "Tours" Extras Management
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press 'ExportExtras' Page
  #
  ##17,18,19,20 filter the colummna Assign Status Translate
#
#  Scenario: Press Button Filter by columna Price
#    Given And click 'Tours' link on 'Left Panel' Page
#    And I press filter columnas 'Price' pages

#////////////////////////////////////////////////////////////////

#second option

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
    And I press 'Translate' page
    And I press 'Delete' Page
    And I press 'FilterByName' Page
    And I press filter columnas 'Price' pages
    And  I press 'PrintExtras ' Page
    And I press 'ExportExtras' Page

