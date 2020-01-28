package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Aplicacion1.Browser.Browser;

public class SignInPages extends ManagerPages {
	
	public  SignInPages() {
		PageFactory.initElements(Browser.driver, this); 		
	}

    static int num = 20;

    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p")
    WebElement pageElement;

    @FindBy(how = How.ID, using ="email")
    WebElement Email;

    @FindBy(how = How.ID, using ="passwd")
    WebElement Passwd;

    @FindBy(how = How.LINK_TEXT, using ="Sign out")
    WebElement SignOut;

    @Override
    public void ingresarDatos() {
        Browser.timeouts(num);
        Email.sendKeys("web@mail.com");
        Passwd.sendKeys("12345678");
    }

    @Override
    public String captura() {
        return pageElement.getText();
    }

    public void CerrarSession(){
        SignOut.click();
    }

}
