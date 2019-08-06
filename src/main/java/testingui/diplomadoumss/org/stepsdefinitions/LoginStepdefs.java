package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.core.InjectionContext;
//import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotel.Hotel;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.offer.ManageOffer;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    /*private Login login;
    private Dashboard dashboard;
    private Hotel hotelin;
    private ManageOffer offerton;*/
    InjectionContext testContext;
    Login login;

    public LoginStepdefs(InjectionContext context) {
        testContext = context;
        login = testContext.getPageObjectManager().getHomePage();
    }

        @Given("^I load PHP travels$")
        public void iLoadPHPTravels() throws Throwable {
            login.loadPPHPTravels();
        }

        @And("^set my credencials  on 'Login' page$")
        public void setMyCredencialsOnLoginPage() throws Throwable {
            login.setCredentials();
        }

/*
    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }
    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }
    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickCarsExpand();
    }

    //Hotel Options

    @And("^click 'Hotels' link on 'Left Panel' page$")
    public void clickHotelsLinkOnLeftPanelPage() throws Throwable {
        hotelin = dashboard.clickHotelsExpand();
    }

    @And("^click 'HotelsLi' link on 'Left Panel' page$")
    public void clickHotelsLiLinkOnLeftPanelPage() throws Throwable {
        hotelin.clickHotelsLi();
    }

    @And("^click 'AddHotel' link on 'Main Panel' page$")
    public void clickAddHotelLinkOnMainPanelPage() throws Throwable {
        hotelin.clickAddHotel();
    }

    @And("^click 'Print' button on 'Main Panel' page$")
    public void clickPrintButtonOnMainPanelPage() throws Throwable {
        hotelin.clickPrintButton();
    }

    @And("^click 'Export' button on 'Main Panel' page$")
    public void clickExportButtonOnMainPanelPage() throws Throwable {
        hotelin.clickExportButton();
    }

// Offers Options

    @And("^click 'Offers' link on 'Left Panel' page$")
    public void clickOffersLinkOnLeftPanelPage() throws Throwable {
        offerton = dashboard.clickOffersExpand();
    }

    @And("^click 'ManageOfferLi' link on 'Left Panel' page$")
    public void clickManageOfferLiLinkOnLeftPanelPage() throws Throwable {
        offerton.clickOffersLi();
    }

    @And("^click 'AddOffers' link on 'Main Panel' page$")
    public void clickAddOffersLinkOnMainPanelPage() throws Throwable {
        offerton.clickAddOffer();
    }

    @And("^click 'PrintOffers' button on 'Main Panel' page$")
    public void clickPrintOffersButtonOnMainPanelPage() throws Throwable {
        offerton.clickPrintButton();
    }

    @And("^click 'ExportOffers' button on 'Main Panel' page$")
    public void clickExportOffersButtonOnMainPanelPage() throws Throwable {
        offerton.clickExportButton();
    }

    @And("^click 'EditOffers' button on 'Main Panel' page$")
    public void clickEditOffersButtonOnMainPanelPage() throws Throwable {
        offerton.clickEditButton();
    }

    @And("^click 'DeleteOffers' button on 'Main Panel' page$")
    public void clickDeleteOffersButtonOnMainPanelPage() throws Throwable {
        offerton.clickDeleteButton();
    }

 */
}
