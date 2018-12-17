package main.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleccionarPO extends commonPO {

    @FindBy(xpath = "//button[@type='button']/span[.='Contrata Ahora'][1]")
    public static WebElement contrata;

    @FindBy(linkText = "Guardar")
    public static WebElement guardar;

    public seleccionarPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
