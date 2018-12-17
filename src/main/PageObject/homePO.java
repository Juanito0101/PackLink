package main.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePO extends commonPO {

    @FindBy(id = "emptyStatesConnectIntegration")
    public static WebElement connectarTienda;

    @FindBy(id = "emptyStatesCreateNewShipment")
    public static WebElement crearEnvio;

    public homePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
