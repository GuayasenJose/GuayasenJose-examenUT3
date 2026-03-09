/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.main;

import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author Guayasen
 */
public class Main {
    public static void main(String[] args) {
       Direccion Dire = new Direccion("Avda. Jose S. Peñate", "35012", "Las Palmas");
       Paquete paquete1 = new Paquete("GP-999", 8.5, direccion1);
       
       paquete1.historialParadas[0] =  "Madrid";
       paquete1.historialParadas[1] =  "Sevilla";
       
       System.out.println("Historial de paradas del envio");
       for(int i = 0; i < paquete1.historialParadas.length; i++) {
           System.out.println("Parada " + i + ": " + paquete1.historialParadas[i]);
       }
       
       
       precioFinal = paquete1.calcularPrecioFinal();
       System.out.println("Precio final del paquete" + precioFinal);
       Sytem.out.println("Seguro del paquete: " + paquete1.calcularSeguro(precioFinal));
            
    }
    
}
