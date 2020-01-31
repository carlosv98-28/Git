package Aplicacion1.Pages;

import Aplicacion1.Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CompraPages extends PagesBase {

    String nserie=null;
    String sSubserie=null;

    @FindBy(how = How.XPATH, using ="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
    WebElement cantidad;
    @FindBy(how = How.XPATH, using ="//*[@id=\"group_1\"]/option[2]")
    WebElement selectSize;
    @FindBy(how = How.ID, using ="add_to_cart")
    WebElement addToCart;
    @FindBy(how = How.XPATH, using ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement proceedToCheckout;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p[2]/a[1]/span")
    WebElement proceedToCheckout1;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedToCheckout3;
    @FindBy(how = How.XPATH, using ="//*[@id=\"cgv\"]")
    WebElement terminos;
    @FindBy(how = How.XPATH, using ="//*[@id=\"form\"]/p/button/span")
    WebElement proceedToCheckout4;
    @FindBy(how = How.XPATH, using ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement metodoPago;
    @FindBy(how = How.XPATH, using ="//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmarComp;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/div/p/strong")
    WebElement verificacionComp;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/p/a")
    WebElement backMyOrdenes;
    @FindBy(how = How.XPATH, using ="//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a")
    WebElement pdf;

    public void definirCantidad(){
        setFactory();
        cantidad.click();
    }
    public void definirSize(){
        setFactory();
        selectSize.click();
    }
    public void selectComprar(){
        setFactory();
        addToCart.click();
        proceedToCheckout.click();
        Browser.timeouts(num);
        proceedToCheckout1.click();
        Browser.timeouts(num);
        proceedToCheckout3.click();
        Browser.timeouts(num);
        terminos.click();
        Browser.timeouts(num);
        proceedToCheckout4.click();

    }
    public void selectMetodoPago(){
        setFactory();
        metodoPago.click();
    }
    public void confirmarCompra(){
        setFactory();
        confirmarComp.click();
        Browser.timeouts(num);
    }
    public boolean verificacionCompra(String text1){
        setFactory();
        return verificacionComp.getText().equals(text1);
    }
    public void irAMisCompras(){
        setFactory();
        backMyOrdenes.click();
    }
    public void descargarCompro() throws InterruptedException {
        pdf.click();
        Thread.sleep(9000);
    }

}
