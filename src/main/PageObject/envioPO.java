package main.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class envioPO extends commonPO {

    @FindBy(xpath = "//*[text()=' Ciudad o código postal '][1]")
    public static WebElement from;

    @FindBy(xpath = "//*[text()=' Ciudad o código postal '][2]")
    public static WebElement to;

    @FindBy(id = "selector-0")
    public static WebElement peso;

    @FindBy(id = "lenght-0")
    public static WebElement largo;

    @FindBy(id = "width-0")
    public static WebElement ancho;

    @FindBy(id = "height-0")
    public static WebElement alto;

    @FindBy(xpath = "//button[contains(., 'Obtener precios')]")
    public static WebElement submit;

    public envioPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
