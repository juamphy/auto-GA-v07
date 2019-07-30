package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    /*@And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }*/

//    @And("^click 'Cars' link on 'Left Panel' page$")
//    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
//        dashboard.clickCarsExpand();
//    }
//
//    @And("^click 'Hotels' link on 'Left Panel' page$")
//    public void clickHotelsLinkOnLeftPanelPage() throws Throwable {
//        dashboard.clickHotelsExpand();
//    }
//
//    @And("^click 'HotelsLi' link on 'Left Panel' page$")
//    public void clickHotelsLiLinkOnLeftPanelPage() throws Throwable {
//        dashboard.clickHotelsLi();
//    }
//
//    @And("^click 'AddHotel' link on 'Main Panel' page$")
//    public void clickAddHotelLinkOnMainPanelPage() throws Throwable {
//        dashboard.clickAddHotel();
//    }

//    @And("^click 'SelectAll' link on 'Main Panel' page$")
//    public void clickSelectAllLinkOnMainPanelPage() throws Throwable {
//        dashboard.clickSelectAll();
//    }
    // quiz//click 'NASA API Listing' on Left Panel page Ft
    @And("^click 'NASA' on 'Left Panel' page$")
    public void clickNasaOnLeftPanelPage() throws Throwable {
        dashboard.clickNasaApiListing();
    }

}
