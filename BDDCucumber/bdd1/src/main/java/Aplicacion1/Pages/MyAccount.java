package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccount extends PagesBase {
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p")
    WebElement welcome;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/ul/li/a/span")
    WebElement home;

    public boolean verificacionBievenida(String text){
        setFactory();
        return welcome.getText().equals(text);
    }
    public void irAHome(){
        setFactory();
        home.click();
    }

}
