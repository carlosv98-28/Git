package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Aplicacion1.Browser.Browser;

public abstract class ManagerPages {
	
	public ManagerPages() {
		System.setProperty("webdriver.chrome.driver","C:/dev/tools/chromedriver.exe");
	}
	
	private static String url ="http://automationpractice.com/";
    
    static int num = 40;
    
    @FindBy(how = How.XPATH, using ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement SignIn;

     @FindBy(how = How.ID, using ="SubmitLogin")
    WebElement SubmitLogin;
     
    public void iniciarNavegador(){
        Browser.goTo(url);
        PageFactory.initElements(Browser.driver, this);
    }
    
    public void irASignIn(){
    	Browser.timeouts(num);
    	SignIn.click();
    }

    public abstract void ingresarDatos();

    public void irASubmitLogin(){
        SubmitLogin.click();
    }
    
    public abstract String captura();

}
