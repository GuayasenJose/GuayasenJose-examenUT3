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

    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;

    public String[] historialParadas = new String[3];

    public Envio(String idSeguimiento, double peso, Direccion destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        historialParadas = new String [3];
        historialParadas[0] ="Sin registro";
        historialParadas[1] ="Sin registro";
        historialParadas[2] ="Sin registro";
        
        
    }
    public String[] getHistorialParadas()
    public  calcularPrecioFinal();

    /**
     *
     * @param obj
     * @return
     */
    @Override
    
}
