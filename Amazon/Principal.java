package Amazon;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Alimento alimento = new Alimento(1, "Pa", 1.0, LocalDate.of(2024, 6, 1));
        Electrodomestico electrodomestico = new Electrodomestico(2, "Rentadora", 300.0, 36);
        Libro libro = new Libro(3, "Java Programming", 50.0, "John Doe", 350);

        tienda.agregarProducto(alimento);
        tienda.agregarProducto(electrodomestico);
        tienda.agregarProducto(libro);

        tienda.mostrarDetallesProductos();

        double preuTotal = tienda.calcularPrecioTotal();
        System.out.println("Preu total de la botiga: " + preuTotal);
    }
}
