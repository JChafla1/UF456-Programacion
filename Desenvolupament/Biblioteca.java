package Desenvolupament;

public class Biblioteca {
    // Atributos
    private String titulo;
    private String autor;
    private boolean prestado;

    // Constructor
    public Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false; // Por defecto, el libro se inicializa como disponible
    }

    // Método para prestar el libro
    public void prestar() {
        this.prestado = true;
    }

    // Método para devolver el libro
    public void retornar() {
        this.prestado = false;
    }
}
