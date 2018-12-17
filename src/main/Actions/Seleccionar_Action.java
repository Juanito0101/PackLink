package main.Actions;

import main.PageObject.seleccionarPO;

public class Seleccionar_Action {

    public Seleccionar_Action(){
    }

   public void contratar(){
       seleccionarPO.contrata.click();
    }

    public void guardar(){
        seleccionarPO.guardar.click();
    }
}
