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


        Scenario: Click in Print Button
          Given I load PHP travels Case Print Tours
          And set my credencials  on 'Login' case Print Tours
          And click 'Tours' link on 'Left Panel' page case Print Tours
          And Click 'Tours' in a Select Options Tours case Print Tours
          And Click 'PRINT' button tours


          Scenario: Click in EXPORT INTO CSV button
            Given I load PHP travels Case EXPORT INTO CSV button
            And set my credencials  on 'Login' case EXPORT INTO CSV button
            And click 'Tours' link on 'Left Panel' page case EXPORT INTO CSV button
            And Click 'Tours' in a Select Options Tours case EXPORT INTO CSV button
            And Click in 'EXPORT INTO CSV'


            Scenario: Click in edit icon
              Given I load PHP travels Case edit icon
              And set my credencials  on 'Login' case edit icon
              And click 'Tours' link on 'Left P anel' page case edit icon
              And Click 'Tours' in a Select Options Tours case edit icon
              And Click 'Edit' Tours


              Scenario: Click in delete icon
                Given I load PHP travels Case delete icon
                And set my credencials  on 'Login' case delete icon
                And click 'Tours' link on 'Left Panel' page case delete icon
                And Click 'Tours' in a Select Options Tours case delete icon
                And Click 'Delete' case Delete icon Tours


                Scenario: Click in Pagination Options
                  Given I load PHP travels Case Pagination Options
                  And set my credencials  on 'Login' Pagination Options
                  And click 'Tours' link on 'Left Panel' pPagination Options
                  And Click 'Tours' in a Select Options Tours Pagination Options
                  And Click 'Pagination' pagination options


                  Scenario: Click in Search button
                    Given I load PHP travels Case Search button
                    And set my credencials  on 'Login' Search button
                    And click 'Tours' link on 'Left Panel' Search button
                    And Click 'Tours' in a Select Options Tours Search button
                    And Click 'Search' button in pagination


                    Scenario: Click Logout Account
                      Given I load PHP travels Case Logout Account
                      And set my credencials  on 'Login' Logout Account
                      And click in 'Logout' Account
