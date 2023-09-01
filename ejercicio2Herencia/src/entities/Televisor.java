package entities;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    public double pulgadas;
    public boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa las pulgadas del TV: ");
        double pulgadasInput = scan.nextDouble();
        this.setPulgadas(pulgadasInput);
        scan.nextLine();
        System.out.println("Ingresa si tiene sintonizador TDT (S/N)");
        String respInput = scan.nextLine();
        if (respInput.equalsIgnoreCase("S")) {
            this.setSintonizador(true);
        } else {
            this.setSintonizador(false);
        }
    }

    @Override
    public double precioFinal() {
        double precioFinalTelevisor = super.precioFinal();

        if (pulgadas > 40) {
            precioFinalTelevisor *= 1.3;
        }

        if (isSintonizador()) {
            precioFinalTelevisor += 500;
        }

        return precioFinalTelevisor;
    }

}
