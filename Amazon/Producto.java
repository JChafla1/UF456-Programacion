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
}
