package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPageNasa;
import testingui.diplomadoumss.org.managepage.LoginNasa.LoginNasa;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;
    private Rooms rooms;
    private LoginNasa log;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        log = LoadPageNasa.loadPageNasa();
    }


    @And("^cargar 'LoginNasa' page$")
    public void cargarLoginNasaPage() {
        log = LoadPageNasa.loadPageNasa();
    }


    @And("^click 'NASA API Listing' link$")
    public void clickNASAAPIListingLink() {
        log.clickNasaApiLink();
    }

    @And("^click 'NASA API Listing' segunda vez$")
    public void clickNASAAPIListingSegundaVez() {
        log.clickNasaApiLink2();
        
    }

    @And("^click 'Earth' panel izquierdo$")
    public void clickEarthPanelIzquierdo() {
        log.earthClickMenu();
    }

    @And("^click 'Imagery' panel izquierdo$")
    public void clickImageryPanelIzquierdo() {
    }
}
