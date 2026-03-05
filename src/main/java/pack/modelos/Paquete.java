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

    double volumen;
    private double precioFinal;

    public Paquete(String idSeguimiento, double peso, double volumen) {
        super(idSeguimiento, peso);
        this.volumen = volumen;
    }

    @Override
    public void calcularPrecioFinal() {
        int precioBase = 5;
        double primerPrecio = 0;

        if (peso > 5) {
            primerPrecio = precioBase + (peso - 5) * 2;

        } else if (peso < 5) {
            primerPrecio = precioBase;

        }
        if (volumen > 1) {
            precioFinal = primerPrecio + 10;
            System.out.println("El precio final es:" + precioFinal);
        } else if (volumen < 1) {
            precioFinal = primerPrecio;
            System.out.println("El precio final es:" + precioFinal);
        }

    }

    public double calcularSeguro(double valorMercancia) {
        double precioFinalConSeguro;
        precioFinalConSeguro = precioFinal * 3 / 100;
        return precioFinalConSeguro;

    }
}
