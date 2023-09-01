package ejercicio4herencia;

import entities.Circulo;
import entities.Rectangulo;

public class Ejercicio4Herencia {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

    }

}
