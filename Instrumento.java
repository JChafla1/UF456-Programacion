
// Clase abstracta, significa que no se pueden crear instancias directamente de ella
//  Sólo puede ser heredada por otras clases.
abstract class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Método abstracto que deberá ser implementado por las subclases
    public abstract void play();
}

public class Instrumento {
    
}
