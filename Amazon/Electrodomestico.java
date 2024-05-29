package Amazon;

public class Electrodomestico extends Producto {
    // Atributos
    private int mesesGarantia;

    // Constructor
    public Electrodomestico(int codigo, String nombre, double precio, int mesesGarantia) {
        super(codigo, nombre, precio);
        this.mesesGarantia = mesesGarantia;
    }

    // Permite cambiar los meses de garantia
    public void establirGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }
    
}
