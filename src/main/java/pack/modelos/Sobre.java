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

    boolean esAcolchado;

    public Sobre(String idSeguimiento, double peso, boolean esAcolchado) {
        super(idSeguimiento, peso);
        this.esAcolchado = esAcolchado;
    }

    @Override
    public void calcularPrecioFinal() {
        int precioBase = 2;
        double primerPrecio = 0;
        double precioFinal;
        if (esAcolchado = true) {
            primerPrecio = precioBase + 1.5;

        } else if (peso < 5) {
            primerPrecio = precioBase;

        }
        if (ciudad = Las Palmas){

        }

    }
}
