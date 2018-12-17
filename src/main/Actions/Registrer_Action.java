package main.Actions;

import main.PageObject.registroPO;
import org.openqa.selenium.support.ui.Select;

public class Registrer_Action {

    public Registrer_Action() {
    }

    public void setEmail(String email) {
        registroPO.email.sendKeys(email);
    }

    public void setPassword(String Password) {
        registroPO.password.sendKeys(Password);
    }

    public void setTel(String Tel) {
        registroPO.tel.sendKeys(Tel);
    }

    public void setShipments() {
        Select dropdown = new Select(registroPO.shipments);
        dropdown.selectByVisibleText("51 - 100");
    }

    public void setPlatform() {
        Select dropdown2 = new Select(registroPO.platform);
        dropdown2.selectByIndex(2);
    }

    public void setEcommerce() {
        Select dropdown3 = new Select(registroPO.ecommerce);
        dropdown3.selectByIndex(5);
    }

    public void setTermsAndCond() { registroPO.termsAndCond.click(); }

    public void setDataProcessing() { registroPO.dataProcessing.click(); }

    public void submit(){ registroPO.submit.click(); }

}
