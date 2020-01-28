package Aplicacion1.Tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import Aplicacion1.Browser.Browser;
import Aplicacion1.Pages.SignInPages;

public class SignInTest {
	
	@Test
    public void SignTest() {
	SignInPages p = new SignInPages();
	
	p.iniciarNavegador();
    p.irASignIn();
    p.ingresarDatos();
    p.irASubmitLogin();
    Assert.assertEquals(p.captura(),"Welcome to your account. Here you can manage all of your personal information and orders.");
    p.CerrarSession();
    
	}
	
    @AfterClass
    public static void Close() {
        Browser.close();
    }

}
