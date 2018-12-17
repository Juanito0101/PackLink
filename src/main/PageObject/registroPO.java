package main.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registroPO extends commonPO {

    @FindBy(id = "register-email")
    public static WebElement email;

    @FindBy(id = "register-password")
    public static WebElement password;

    @FindBy(id = "register-tel")
    public static WebElement tel;

    @FindBy(id = "register-shipments")
    public static WebElement shipments;

    @FindBy(id = "register-platform")
    public static WebElement platform;

    @FindBy(id = "register-ecommerce")
    public static WebElement ecommerce;

    @FindBy(id = "register-termsAndConditions")
    public static WebElement termsAndCond;

    @FindBy(id = "register-dataProcessing")
    public static WebElement dataProcessing;

    @FindBy(id = "register-marketingEmail")
    public static WebElement marketingEmail;

    @FindBy(id = "register-submit")
    public static WebElement submit;

    @FindBy(id = "nav-button")
    public static WebElement acceder;

    public registroPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

