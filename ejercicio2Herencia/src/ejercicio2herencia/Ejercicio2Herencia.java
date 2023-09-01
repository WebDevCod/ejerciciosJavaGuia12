package ejercicio2herencia;

import entities.Electrodomestico;
import entities.Lavadora;
import entities.Televisor;
import java.util.ArrayList;

public class Ejercicio2Herencia {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora(5, 2000, "blanco", 'A', 80);
        Lavadora lavadora2 = new Lavadora(10, 3500, "blanco", 'A', 80);
        Televisor televisor1 = new Televisor(32, true, 1500, "negro", 'A', 3);
        Televisor televisor2 = new Televisor(40, true, 3500, "negro", 'A', 3);

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);

        double preciosSumados = 0.0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioProducto = electrodomestico.precioFinal();
            System.out.println("Precio: " + precioProducto);
            preciosSumados += precioProducto;
        }

        System.out.println("Total de precios sumados: " + preciosSumados);

//        Lavadora lavadora = new Lavadora();
//        Televisor televisor = new Televisor();
//
//        lavadora.crearLavadora();
//        System.out.println("Precio lavadora: " + lavadora.precioFinal());
//
//        televisor.crearTelevisor();
//        System.out.println("Precio televisor: " + televisor.precioFinal());
    }

}
