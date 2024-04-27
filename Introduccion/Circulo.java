package Introduccion;

public class Circulo {
    // Atributos
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos para calcular el área y el perímetro
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetre() {
        return 2 * Math.PI * radio;
    }
}
