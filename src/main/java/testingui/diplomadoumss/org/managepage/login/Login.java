package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    private WebDriver webDriver;

    @BeforeClass
    public void init(){
        webDriver = getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    @Test
    public void userlogin(){
        LoginHelp login = PageFactory.initElements(webDriver, LoginHelp.class);
        login.setUserPP(PropertyAccesor.getInstance().getUserName());
        login.setPasswordField(PropertyAccesor.getInstance().getPassword());
        login.clickLogin();
    }



//    public void setPassword(String password) { passwordTextField.sendKeys(password); }
//
//    public void setSubmit(String Button){ submitButton.click(); }
//
//    //http://pachatech.com/wp-login.php / admin / samy123 //


}
