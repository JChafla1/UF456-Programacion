
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

// Heredamos el nombre de la clase instrumento
abstract class Cuerda extends Instrument {
    public Cuerda(String name) {
        super(name);
    }
}

// Heredamos el nombre de la clase instrumento
abstract class Viento extends Instrument {
    public Viento(String name) {
        super(name);
    }
}

// Heredamos el nombre de la clase instrumento
abstract class Percusión extends Instrument {
    public Percusión(String name) {
        super(name);
    }
}

public class Instrumento {
    
}
