package Aplicacion1.Pages;

import Aplicacion1.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagesBase {
    public static void setChrome() {
        System.setProperty("webdriver.chrome.driver","src/test/resourse/chromeDriver/chromedriver.exe");
    }
    public void setFactory(){
        PageFactory.initElements(Browser.driver, this);
    }
    private static String url ="http://automationpractice.com/";
    public static void close(){Browser.driver.close();}
    static int num = 40;

    @FindBy(how = How.XPATH, using ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement SignIn;
    @FindBy(how = How.ID, using ="SubmitLogin")
    WebElement SubmitLogin;

    public void iniciarNavegador(){
        setChrome();
        Browser.goTo(url);
        setFactory();
    }
    public void irASignIn(){
        Browser.timeouts(num);
        SignIn.click();
    }


    protected String GeneradorDeMail(){
        int numero;
        numero = (int) (Math.random() * 9999) + 1;
        return "webb"+numero+"@mail.com";
    }
    protected String GeneradorDePassword(){
        int numero;
        numero = (int) (Math.random() * 9999) + 1;
        return "@"+numero+"@";
    }
    protected String[] generarNombresAleatorios(int a) {
        String[] nombresAleatorios = new String[a];
        String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "BartolomÃ©", "Baruc", "Baruj", "Candelaria", "CÃ¡ndida", "Canela", "Caridad", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar"};
        for (int i = 0; i < a; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] ;
        }
        return nombresAleatorios;
    }
    protected String[] generarApellidoAleatorios(int a) {
        String[] apellidoAleatorios = new String[a];

        String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
                "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
                "Grigalva" };
        for (int i = 0; i < a ; i++) {
            apellidoAleatorios[i] = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
        }
        return apellidoAleatorios;
    }
}
