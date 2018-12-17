package Test;

import com.sun.tools.javac.util.Assert;
import main.Actions.Seleccionar_Action;
import main.Actions.VerifyScreen_Action;
import main.Actions.setEnvio_Action;
import main.PageObject.envioPO;
import main.PageObject.homePO;
import main.PageObject.seleccionarPO;
import org.junit.jupiter.api.Test;
import utils.WaitElement;

import static main.PageObject.envioPO.from;
import static main.PageObject.envioPO.submit;

public class setDetails extends Base {
    @Test
    public void setDetails() {
        envioPO detallesEnvio = new envioPO(driver);
        homePO home = new homePO(driver);
        seleccionarPO seleccionar = new seleccionarPO(driver);

        try {
            Assert.check(VerifyScreen_Action.Execute("home"));
            home.crearEnvio.click();
            WaitElement.waitForElement(driver, submit);
            Assert.check(VerifyScreen_Action.Execute("detallesEnvio"));
            setEnvio_Action details_Action = new setEnvio_Action();
            details_Action.setFrom("04810 - Madrid");
            details_Action.setTo("04810 - Madrid");
            details_Action.setAlto("10");
            details_Action.setLargo("10");
            details_Action.setAncho("10");
            details_Action.setPeso("1");
            details_Action.submit();
            Seleccionar_Action seleccionar_Action = new Seleccionar_Action();
            seleccionar_Action.contratar();
            seleccionar_Action.guardar();
            Assert.check(VerifyScreen_Action.Execute("home"));
        } catch (Exception e) {
            throw new RuntimeException("Registration Element not found", e);
        }
    }
}

