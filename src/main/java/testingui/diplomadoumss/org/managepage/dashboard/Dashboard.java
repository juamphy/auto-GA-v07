package testingui.diplomadoumss.org.managepage.dashboard;

import gherkin.lexer.Ca;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.CarsLeftPanel;

public class Dashboard extends BasePage {
    @FindBy(xpath = "//*[@href='#Cars']")
    private WebElement clickCarsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement clickCars;

    public Dashboard(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CarsLeftPanel clickCarsSelected() {
        Event.clickWebElement(clickCarsSelected);
        Event.clickWebElement(clickCars);
        return new CarsLeftPanel();
    }

    public CarsLeftPanel setLeftPanel() {
        return  clickCarsSelected();
    }
}
