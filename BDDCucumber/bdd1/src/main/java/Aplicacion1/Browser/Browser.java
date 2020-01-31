package Aplicacion1.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void goTo(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void timeouts(int num) {
        driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
    }

}
