/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.modelos;

/**
 *
 * @author Guayasen
 */
public class Sobre extends Envio {

    private boolean esAcolchado;

    public Sobre(String idSeguimiento, double peso, Direccion destino) {
        super(idSeguimiento, peso, destino);
        
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 2.0;
        
        if (esAcolchado)  {
            precio += 1.5;
        }
        
        if (destino.getCiudad() .equalsIgnoreCase("Las Palmas")) {
            precio -= 0.5;
        }
        return precio;
    }
}
