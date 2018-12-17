package main.Actions;

import main.PageObject.envioPO;

public class setEnvio_Action {

    public setEnvio_Action(){
    }

    public void setFrom(String From) {
        envioPO.from.clear();
        envioPO.from.sendKeys(From);
    }

    public void setTo(String To) {
        envioPO.to.clear();
        envioPO.to.sendKeys(To);
    }

    public void setPeso(String Peso){
        envioPO.peso.sendKeys(Peso);
    }

    public void setLargo(String Largo) {
        envioPO.largo.sendKeys(Largo);
    }

    public void setAlto(String Alto) {
        envioPO.alto.sendKeys(Alto);
    }

    public void setAncho(String Ancho) {
        envioPO.ancho.sendKeys(Ancho);
    }

    public void submit() {
        envioPO.submit.click();}
}