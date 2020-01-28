package Aplicacion1.Tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Aplicacion1.Browser.Browser;
import Aplicacion1.Pages.FailPasswordPages;

public class FailPasswordTest {
    @Test
    public void PasswordTest() {
        FailPasswordPages p = new FailPasswordPages();
    	p.iniciarNavegador();
        p.irASignIn();
        p.ingresarDatos();
        p.irASubmitLogin();
        Assert.assertEquals(p.captura(),"Authentication failed.");

    }
    
    @AfterClass
    public static void Close() {
        Browser.close();
    }

}
