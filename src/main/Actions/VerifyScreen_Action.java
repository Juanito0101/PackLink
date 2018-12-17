package main.Actions;

import com.sun.tools.javac.util.Assert;
import main.PageObject.envioPO;
import main.PageObject.homePO;
import main.PageObject.registroPO;

public class VerifyScreen_Action {
    public static boolean Execute(String ScreenName) {
        boolean isUserOnCorrectScreen = false;
        try {
            switch (ScreenName.toLowerCase()) {
                case "registro":
                    Assert.check(true, registroPO.email.getAttribute("required"));
                    Assert.check(true, registroPO.password.getAttribute("required"));
                    Assert.check(true, registroPO.tel.getAttribute("required"));
                    Assert.check(true, registroPO.shipments.getAttribute("required"));
                    Assert.check(true, registroPO.platform.getAttribute("required"));
                    Assert.check(true, registroPO.ecommerce.getAttribute("required"));
                    isUserOnCorrectScreen = true;
                    System.out.println("Pantalla " + ScreenName + " validada correctamente");
                    break;
                case "home":
                    Assert.check(true, homePO.crearEnvio.isDisplayed());
                    isUserOnCorrectScreen = true;
                    System.out.println("Pantalla " + ScreenName + " validada correctamente");
                    break;
                case "envio":
                    Assert.check(true, envioPO.submit.isDisplayed());
                    isUserOnCorrectScreen = true;
                    System.out.println("Pantalla " + ScreenName + " validada correctamente");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            isUserOnCorrectScreen = false;
        }
        return isUserOnCorrectScreen;
    }
}
