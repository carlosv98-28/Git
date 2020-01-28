package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Aplicacion1.Browser.Browser;

public abstract class ManagerPages {
	
    private static String url ="http://automationpractice.com/";
    @FindBy(how = How.LINK_TEXT, using ="Sign in")
    WebElement SignIn;

     @FindBy(how = How.ID, using ="SubmitLogin")
    WebElement SubmitLogin;

    public void iniciarNavegador(){
        Browser.goTo(url);
    }
    public void irASignIn(){
        SignIn.click();
    }

    public abstract void ingresarDatos();

    public void irASubmitLogin(){
        SubmitLogin.click();
    }
    public abstract String captura();

}
