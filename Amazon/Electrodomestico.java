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

    // Calculo para los meses de garantia
    @Override
    public double calcularPrecioFinal() {
        if (mesesGarantia > 24) {
            return precio * 1.1; // 10% de recargo si la garantía es superior a 24 meses
        }
        return precio;
    }

    // Añadir los meses de garantia al producto
    @Override
    public String toString() {
        return super.toString() + ", Meses de garantia: " + mesesGarantia;
    }
    
}
