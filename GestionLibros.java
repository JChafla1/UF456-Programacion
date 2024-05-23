import java.util.List;

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

    public T buscarLibroPorTitulo(String titulo) {
        for (T libro : lista) {
            // instanceof: comprueba si un objeto es una instancia de tipo clase o interficie
            if (libro instanceof Libro && ((Libro) libro).getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        for (T libro : lista) {
            System.out.println(libro);
        }
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


// Clases especificas para cada genero
class Novela extends Libro {
    public Novela(String titulo, String autor) {
        super(titulo, autor);
    }
}

class CienciaFiccion extends Libro {
    public CienciaFiccion(String titulo, String autor) {
        super(titulo, autor);
    }
}

class Poesia extends Libro {
    public Poesia(String titulo, String autor) {
        super(titulo, autor);
    }
}

