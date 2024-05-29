package Amazon;

import java.time.LocalDate;

public class Alimento extends Producto{
    // Atributos
    private LocalDate fechaCaducidad;

    // Constructor
    public Alimento(int codigo, String nombre, double precio, LocalDate fechaCaducidad) {
        super(codigo, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public void establecerFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
