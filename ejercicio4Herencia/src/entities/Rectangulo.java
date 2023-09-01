package entities;

import interfaces.CalculosFormas;
import java.util.Scanner;

public class Rectangulo implements CalculosFormas {

    Scanner scan = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.println("Ingresa la base: ");
        double base = scan.nextDouble();
        System.out.println("Ingresa la altura: ");
        double altura = scan.nextDouble();
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Ingresa la base: ");
        double base = scan.nextDouble();
        System.out.println("Ingresa la altura: ");
        double altura = scan.nextDouble();
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

}
