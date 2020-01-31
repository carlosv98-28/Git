package Aplicacion1.Pages;

import Aplicacion1.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPages extends PagesBase {

    @FindBy(how = How.ID, using ="email")
    WebElement email;
    @FindBy(how = How.ID, using ="passwd")
    WebElement passwd;
    @FindBy(how = How.ID, using ="email_create")
    WebElement emailCreate;
    @FindBy(how = How.XPATH, using ="//*[@id=\"SubmitCreate\"]/span")
    WebElement createAnAccount;
    @FindBy(how = How.ID, using ="SubmitLogin")
    WebElement signIn;

    public void nuevaCuenta() {
        setFactory();
        Browser.timeouts(num);
        emailCreate.sendKeys(GeneradorDeMail());
        createAnAccount.click();
    }
    public void cuentaCreada() {
        setFactory();
        Browser.timeouts(num);
        email.sendKeys("web@mail.com");
        passwd.sendKeys("12345678");
        signIn.click();
    }

}
