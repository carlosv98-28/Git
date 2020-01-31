package seleniumgluecode;

import Aplicacion1.Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    PagesBase h = new PagesBase() {};
    SignInPages sp = new SignInPages();
    RegisterPages rp = new RegisterPages();
    MyAccount ma = new MyAccount();
    WomenPages wp = new WomenPages();
    CompraPages cp = new CompraPages();
    String text = "Welcome to your account. Here you can manage all of your personal information and orders.";
    String text1 = "Your order on My Store is complete.";

    @Given("^El usurio se encuentra en la pagina home$")
    public void el_usurio_se_encuentra_en_la_pagina_home() throws Throwable {
    h.iniciarNavegador();
    }
    @When("^Se dirige a sign in$")
    public void se_dirige_a_sign_in() throws Throwable {
        h.irASignIn();
    }
    @And("^Luego se dirige a Create an account$")
    public void luego_se_dirige_a_Create_an_account() throws Throwable {
        sp.nuevaCuenta();
    }
    @And("^ingresa los datos de registro$")
    public void ingresa_los_datos_de_registro() throws Throwable {
        rp.ingresarDatos();
    }
    @Then("^Se verifica que se registro correctamente$")
    public void se_verifica_que_se_registro_correctamente() throws Throwable {
        Assert.assertTrue(ma.verificacionBievenida(text));
    }
    @And("^Ingresa los datos de la cuenta$")
    public void ingresa_los_datos_de_la_cuenta() throws Throwable {
        sp.cuentaCreada();
    }
    @Given("^El usurio se encuentra en la pagina home new$")
    public void elUsurioSeEncuentraEnLaPaginaHomeNew() {
        h.iniciarNavegador();
    }
    @When("^Se dirige a sign in new$")
    public void seDirigeASignInNew() {
        h.irASignIn();
    }
    @Then("^Se verifica que se ingreso correctamente$")
    public void seVerificaQueSeIngresoCorrectamente() {
        Assert.assertTrue(ma.verificacionBievenida(text));
    }

    @After
    public void cerrarNavegador(){
        PagesBase.close();
    }
    @And("^El usuario esta logueado y se encuentra en my account se dirige a home$")
    public void elUsuarioEstaLogueadoYSeEncuentraEnMyAccountSeDirigeAHome() {
        ma.irAHome();
    }
    @And("^Se dirige a la categoria women$")
    public void seDirigeALaCategoriaWomen() {
        wp.irAWomen();
    }
    @And("^Selecciona el producto a comprar$")
    public void seleccionaElProductoAComprar() {
        wp.selectProduc();
    }
    @And("^Selecciona la cantidad$")
    public void seleccionaLaCantidad() {
        cp.definirCantidad();
    }
    @And("^selecciona el tamaño del producto$")
    public void seleccionaElTamañoDelProducto() {
        cp.definirSize();
    }
    @And("^Seleciona Comprar$")
    public void selecionaComprar() {
        cp.selectComprar();
    }
    @And("^selecciona metodo de pago$")
    public void seleccionaMetodoDePago() {
        cp.selectMetodoPago();
    }
    @And("^confirma la compra$")
    public void confirmaLaCompra() {
        cp.confirmarCompra();
    }
    @Then("^se verifica la compra correcta$")
    public void seVerificaLaCompraCorrecta() {
        Assert.assertTrue(cp.verificacionCompra(text1));

    }
    @And("^Se dirige a mis compras$")
    public void seDirigeAMisCompras() {
        cp.irAMisCompras();
    }
    @And("^Se descarga comprobante de compra$")
    public void seDescargaComprobanteDeCompra() throws InterruptedException {
       cp.descargarCompro();
    }
}
