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


    // Indica que estamos sobreescribiendo el método abstracto calcularPreuFinal() definido en la clase Producto
    @Override
    public double calcularPrecioFinal() {
        LocalDate avui = LocalDate.now();
        long diesRestants = avui.until(fechaCaducidad).getDays();
        if (diesRestants <= 7) {
            return precio * 0.5; // 50% de descompte si quedan 7 dias o menos
        }
        return precio;
    }

    // Obtenemos el nombre, codigo y precio y le añadimos la fecha de caducidad
    @Override
    public String toString() {
        return super.toString() + ", Fecha de caducidad: " + fechaCaducidad;
    }
}
