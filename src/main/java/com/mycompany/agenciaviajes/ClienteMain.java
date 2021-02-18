
package com.mycompany.agenciaviajes;

import java.text.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


/**
 *
 * @author Eliana Andrea Camayo, Luis Manuel Arroyo 
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static List<Viaje> viajes = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        leerViajes();
        mostrarViajes();
    }

    /**
     * Lee viajes en el arreglo polimórfico
     */
    public static void leerViajes() {
        try{
            Viaje viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new
SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new
SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
 viajes.add(viaje1);
        } catch (ParseException ex){
            
        }
    
    }

    /**
     * Recorre e imprime datos del arreglo polimófico
     */
    public static void mostrarViajes() {
        // En este caso vemos que todos los viajes ejecutan el método
      //  "descripcion()" de forma diferente // ya que al ser este método abstracto en la clase padre, les forzamos a
              //  las clases hijas a que // implementen ese método.
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Cualquier método: " + viaje.cualquierMetodo());
            System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
            System.out.println("");

        }
    }

}
