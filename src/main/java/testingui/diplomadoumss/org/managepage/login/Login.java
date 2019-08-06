package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;
import static testingui.diplomadoumss.org.manageevents.Event.getWebElementText;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//a/strong[contains(text(), 'Logout')]")
    private WebElement logoutLink;

    public void logoutLink() {
        clickWebElement(logoutLink);
        avoidToUse(4);
    }

    public void clickCarsExpand() {
        clickWebElement(carsExpand);
        //return this;
    }

//    public Login() {
//        isWebElementVisible(loginButton);
//        avoidToUse(2);
//    }

    public String getLoginLabelButton() {
        return getWebElementText(loginButton);
    }

    public Login setEmail(String email){
        fillWebElement(emailTextField, email);
        return this;
    }

    public Login setPassword(String password){
        fillWebElement(passwordTextField, password);
        return this;
    }

    public void clickLoginButton() {
        clickWebElement(loginButton);
        //return new Dashboard();
    }

    public void setCredentials() {
        setEmail(PropertyAccesor.getInstance().getEmail()).
        setPassword(PropertyAccesor.getInstance().getPassword()).
        clickLoginButton();
    }

    public void loadPPHPTravels() {
        driver.get(PropertyAccesor.getInstance().getURL() + "/admin");
    }
}
