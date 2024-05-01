package Empresa;

public class EmpleatPerHores extends Empleat {
    private int horesTreballades;
    private double tarifaPerHora;

    public EmpleatPerHores(String nom, double salari, int horesTreballades, double tarifaPerHora) {
        super(nom, salari);
        this.horesTreballades = horesTreballades;
        this.tarifaPerHora = tarifaPerHora;
    }

    public void calcularSalari() {
        double salari = horesTreballades * tarifaPerHora;
        System.out.println("Salari per hores treballades: " + salari);
    }
}
