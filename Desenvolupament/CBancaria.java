package Desenvolupament;

public class CBancaria {
    // Atributos
    private double saldo;

    // Constructor
    public CBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para ingresar dinero
    public void ingressar(double quantitat) {
        this.saldo += quantitat;
    }

    // Método para retirar dinero
    public void retirar(double quantitat) {
        if (this.saldo >= quantitat) {
            this.saldo -= quantitat;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }
}
