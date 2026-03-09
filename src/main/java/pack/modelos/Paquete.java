/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.modelos;

/**
 *
 * @author Guayasen
 */
public class Paquete extends Envio {

    private double volumen;
    

    public Paquete(String idSeguimiento, double peso, Direccion destino) {
        super(idSeguimiento, peso, destino);
        
    }

    @Override
    public void calcularPrecioFinal() {
        double precioBase =5.0;
        double precio = precioBase;
        if (peso >5)
            precio += (peso - 5) * 2.0;
        
        if (volumen > 1)
            precio +=10.0;
        
        return(precio);
         
    }

    @Override
    public double calcularSeguro (double valorMercancia) {
        return valorMercancia * 0.03;
    }
}
