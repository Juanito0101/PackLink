package Test;

import main.Actions.VerifyScreen_Action;
import main.PageObject.homePO;
import main.PageObject.registroPO;
import main.Actions.Registrer_Action;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;
import utils.WaitElement;

public class Register extends Base{
    @Test
    public void registerUser() {
        registroPO registro = new registroPO(driver);
        homePO home = new homePO(driver);

        try {
           WaitElement.waitForElement(driver, registro.email);
           Assert.check(VerifyScreen_Action.Execute("Registro"));
           Registrer_Action registrer_Action = new Registrer_Action();
           registrer_Action.setEmail("qacandidate+juanmtorrecilla@packlink.es");
           registrer_Action.setPassword("Test123");
           registrer_Action.setTel("43243243");
           registrer_Action.setShipments();
           registrer_Action.setPlatform();
           registrer_Action.setEcommerce();
           registrer_Action.setTermsAndCond();
           registrer_Action.setDataProcessing();
           registrer_Action.submit();
           Assert.check(VerifyScreen_Action.Execute("home"));
        } catch (Exception e) {
            throw new RuntimeException("Registration Element not found", e);
        }
    }
}