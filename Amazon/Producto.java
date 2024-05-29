package Amazon;

public abstract class Producto {
    // Atributos
    protected int codigo;
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Las subclases de Producto tendrán que implementar este método para calcular el precio final
    public abstract double calcularPrecioFinal();

    // Devuelve una representación en forma de cadena de los atributos del producto
    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio;
    }
}
