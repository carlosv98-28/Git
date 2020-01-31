package Aplicacion1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomenPages extends PagesBase {

    @FindBy(how = How.XPATH, using ="//*[@id=\"block_top_menu\"]/ul/li[1]")
    WebElement womenCat;
    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/h5/a")
    WebElement selectPro;


    public void irAWomen(){
        setFactory();
        womenCat.click();
    }
    public void selectProduc(){
        setFactory();
        selectPro.click();
    }



}
