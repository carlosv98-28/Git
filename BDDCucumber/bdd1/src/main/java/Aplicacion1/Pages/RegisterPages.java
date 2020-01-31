package Aplicacion1.Pages;

import Aplicacion1.Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPages extends PagesBase {
    @FindBy(how = How.ID, using ="uniform-id_gender1") WebElement sexoSelect;
    @FindBy(how = How.ID, using ="customer_firstname") WebElement nombre;
    @FindBy(how = How.ID, using ="customer_lastname") WebElement apellido;
    @FindBy(how = How.ID, using ="passwd") WebElement password;
    @FindBy(how = How.ID, using ="address1") WebElement empresa;
    @FindBy(how = How.ID, using ="city") WebElement ciudad;
    @FindBy(how = How.ID, using ="postcode") WebElement codPostal;
    @FindBy(how = How.ID, using ="phone_mobile") WebElement celular;
    @FindBy(how = How.ID, using ="alias") WebElement alias;
    @FindBy(how = How.ID, using ="submitAccount") WebElement registar;

    public void ingresarDatos(){
        setFactory();
        sexoSelect.click();
        nombre.sendKeys(generarNombresAleatorios(1));
        apellido.sendKeys(generarApellidoAleatorios(1));
        password.sendKeys(GeneradorDePassword());
        fechaSelect();
        empresa.sendKeys("iceberg");
        ciudad.sendKeys("caba");
        codPostal.sendKeys("00000");
        ciudadSelect();
        celular.sendKeys("1178451285");
        alias.getAttribute("value");
        alias.sendKeys(generarNombresAleatorios(1));
        registar.click();

    }

    private void fechaSelect(){
        diasSelecter.click();
        mesSelecter.click();
        yearSelecter.click();
    }
    private void ciudadSelect(){

        estado.click();
        ciudadE.click();
    }

    @FindBy(how = How.XPATH, using ="//*[@id=\"days\"]/option[18]") WebElement diasSelecter;
    @FindBy(how = How.XPATH, using ="//*[@id=\"months\"]/option[5]") WebElement mesSelecter;
    @FindBy(how = How.XPATH, using ="//*[@id=\"years\"]/option[7]") WebElement yearSelecter;

    @FindBy(how = How.XPATH, using ="//*[@id=\"id_state\"]/option[39]") WebElement estado;
    @FindBy(how = How.XPATH, using ="//*[@id=\"id_country\"]/option[2]") WebElement ciudadE;

}
