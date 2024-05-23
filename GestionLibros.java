
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

public class GestionLibros {
    
}
