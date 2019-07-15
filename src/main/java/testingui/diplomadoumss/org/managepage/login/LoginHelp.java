package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;

public class LoginHelp {

    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[1]")
    private WebElement emailTextField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[2]")
    private WebElement passwordTextField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/button")
    private WebElement submitButton;


//    @FindBy(xpath = "//input[@name='email' and @type='email']")
//    private WebElement emailTextField;
//
//    @FindBy(xpath = "//input[@name='password' and @type='password']")
//    private WebElement passwordTextField;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    private WebElement submitButton;

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void clickLogin(){
        submitButton.click();
    }

    public void setUserPP(String user){
        emailTextField.sendKeys(user);
    }

    public void setPasswordField(String pass){
        passwordTextField.clear();
        passwordTextField.sendKeys(pass);
        passwordTextField.sendKeys(Keys.TAB);
    }
}
