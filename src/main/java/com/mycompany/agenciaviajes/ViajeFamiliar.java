
package com.mycompany.agenciaviajes;

/**
 *
 * @author Eliana Andrea Camayo, Luis Manuel Arroyo 
 */
public class ViajeFamiliar  extends Viaje {
    private int familia;

    public ViajeFamiliar(int familia) {
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    @Override
    public String descripcion(){
        return "Viaje para disfrutar en familia";
    }
    
    @Override
    public String cualquierMetodo2(){
        return "";
    }
 
}
