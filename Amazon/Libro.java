package Amazon;

public class Libro extends Producto {
    private String autor;
    private int numPaginas;

    public Libro(int codigo, String nombre, double precio, String autor, int numPaginas) {
        super(codigo, nombre, precio);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numPaginas > 300) {
            return precio * 1.05; // 5% de recargo si el libro tiene más de 300 páginas
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Número de pàginas: " + numPagines;
    }
}
