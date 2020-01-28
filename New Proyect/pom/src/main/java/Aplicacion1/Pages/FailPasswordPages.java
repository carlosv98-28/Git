package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Aplicacion1.Browser.Browser;

public class FailPasswordPages extends ManagerPages {
    static int num = 20;
    
    public FailPasswordPages() {
    	PageFactory.initElements(Browser.driver, this);
	}

	@FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/div[1]/ol/li")
    WebElement pageElement;

    @FindBy(how = How.ID, using ="email")
    WebElement Email;

    @FindBy(how = How.ID, using ="passwd")
    WebElement Passwd;

    @Override
    public void ingresarDatos() {
        Browser.timeouts(num);
        Email.sendKeys("web@mail.com");
        Passwd.sendKeys("qwertyu");
    }

    @Override
    public String captura( ) {
        return pageElement.getText();
    }

}
