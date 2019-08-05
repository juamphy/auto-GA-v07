package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Reviews;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.pagecomponents.ExportCSV;
import testingui.diplomadoumss.org.managepage.pagecomponents.Printing;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;
    private Hotels hotels;
    private Printing printing;
    private ExportCSV exportCSV;
    private Reviews reviews;

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() {
        login = LoadPage.loadPHPTravels();
    }

    @And("^set my credentials  on 'Login' page$")
    public void setMyCredentialsOnLoginPage() {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Hotels' link on 'Left Panel' Page$")
    public void clickHotelsLinkOnLeftPanelPage() {
        hotels = dashboard.setLeftPanel();
    }

    @And("^Click 'Print' button on Reviews Management Page$")
    public void clickPrintButton() {
        printing = dashboard.clickPrinting();
    }

    @And("^Click 'Export into CSV' button on Review Managements Page$")
    public void clickExporCSVButton() {
        exportCSV = dashboard.clickExportCSV();
    }

    @And("^Click 'Edit button' icon on first row$")
    public void clickEditButton() {
        dashboard.clickEditButton();
    }

    @And("^Fill fields on Edit form$")
    public void fillFieldsOnEditForm() {
        dashboard.fillFieldsOnEdit();
    }

    @And("^Click 'Return' button on Edit form$")
    public void clickOnReturnButton() {
        dashboard.clickOnReturnButton();
    }

    @And("^Click 'Save & Return' Button on Edit form$")
    public void clickOnSaveAndReturnButton() {
        dashboard.clickOnSaveAndReturnButton();
    }

}
