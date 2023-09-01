package entities;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la carga de la lavadora: ");
        double cargaInput = scan.nextDouble();
        this.setCarga(cargaInput);
    }

    @Override
    public double precioFinal() {
        double precioFinalLavadora = super.precioFinal();

        if (carga > 30) {
            precioFinalLavadora += 500;
        }

        return precioFinalLavadora;
    }

}
