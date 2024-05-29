package Amazon;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    // Lista
    private List<Producto> productos;

    // Constructor
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    // Añadir productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Calcular precios
    public double calcularPrecioTotal() {
        double prcioTotal = 0;
        for (Producto producto : productos) {
            prcioTotal += producto.calcularPrecioFinal();
        }
        return prcioTotal;
    }

    // Mostrar detalles de los productos
    public void mostrarDetallesProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

}
