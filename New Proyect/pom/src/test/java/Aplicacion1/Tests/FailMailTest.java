package Aplicacion1.Tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Aplicacion1.Browser.Browser;
import Aplicacion1.Pages.FailMailPages;


public class FailMailTest {
	
	@Test
    public void MailTest() {
		FailMailPages p = new FailMailPages();
		p.iniciarNavegador();
		p.irASignIn();
		p.ingresarDatos();
		p.irASubmitLogin();
		Assert.assertEquals(p.captura(), "Invalid email address.");
		
    }
	
    @AfterClass
    public static void Close() {
        Browser.close();
    }

}
