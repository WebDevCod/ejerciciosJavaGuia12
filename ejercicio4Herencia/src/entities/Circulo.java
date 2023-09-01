package entities;

import interfaces.CalculosFormas;
import java.util.Scanner;

public class Circulo implements CalculosFormas {

    Scanner scan = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.println("Ingresa el radio: ");
        double radio = scan.nextDouble();
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Ingresa el díametro: ");
        double diametro = scan.nextDouble();
        double perimetro = PI * diametro;
        return perimetro;
    }

}
