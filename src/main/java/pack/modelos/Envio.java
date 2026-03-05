/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.modelos;

/**
 *
 * @author Guayasen
 */
public abstract class Envio {

    String idSeguimiento;
    double peso;
    String destino;

    String[] historialParadas = new String[3];

    public Envio(String idSeguimiento, double peso, String destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        
    }

    public  calcularPrecioFinal();

    /**
     *
     * @param obj
     * @return
     */
    @Override
    
}
