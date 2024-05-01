package Empresa;

public class EmpleatPerComissio extends Empleat {
    private double vendesRealitzades;
    private double comissioPerVenta;

    public EmpleatPerComissio(String nom, double salari, double vendesRealitzades, double comissioPerVenta) {
        super(nom, salari);
        this.vendesRealitzades = vendesRealitzades;
        this.comissioPerVenta = comissioPerVenta;
    }

    public void calcularSalari() {
        double salari = getSalari() + (vendesRealitzades * comissioPerVenta);
        System.out.println("Salari per comissions: " + salari);
    }
}
