
// Clase generica LlistaLlibres
class LlistaLlibres<T> {
    private List<T> lista;

    public LlistaLlibres() {
        lista = new ArrayList<>();
    }

    public void introducirLibro(T libro) {
        lista.add(libro);
    }

    public void eliminarLibro(T libro) {
        lista.remove(libro);
    }
    
}

// Clase base de Libro
class Libro {
    // Atributos
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    // Sirve para hacer una redefinicion de codigo
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
}

public class GestionLibros {
    
}
