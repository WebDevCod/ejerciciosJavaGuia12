package entities;

import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // métodos creados
    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.setConsumoEnergetico(letra);
        } else {
            this.setConsumoEnergetico('F');
        }
    }

    private void comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;

        for (String colorDisponible : coloresDisponibles) {
            if (colorDisponible.equalsIgnoreCase(color)) {
                colorValido = true;
                break;
            }
        }

        if (!colorValido) {
            this.setColor("Blanco");
        } else {
            this.setColor(color);
        }
    }

    public void crearElectrodomestico() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el color del electrodomésitco: ");
        String colorInput = scan.nextLine();
        comprobarColor(colorInput);

        System.out.println("Ingrese el consumo energético (Letra entre A y F): ");
        char consumoEnergeticoInput = scan.next().charAt(0);
        consumoEnergeticoInput = Character.toUpperCase(consumoEnergeticoInput);
        comprobarConsumoEnergetico(consumoEnergeticoInput);

        System.out.println("Ingresa el peso en kg del producto: ");
        double pesoInput = scan.nextDouble();
        this.setPeso(pesoInput);

        this.precio = 1000;
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }

}
