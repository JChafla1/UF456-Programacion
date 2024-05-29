
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

// Hereda de la clase Cuerda
class Guitarra extends Cuerda {
    
    // Constructor
    public Guitarra() {
        super("Guitarra");
    }

    // Mensaje indicando que se esta tocando la guitarra
    @Override
    public void play() {
        System.out.println("Estas tocando la guitarra");
    }
}

// Esta vez ejemplo de viento
class Flauta extends Viento {
    public Flauta() {
        super("Flauta");
    }

    @Override
    public void play() {
        System.out.println("Estas tocando la flauta");
    }
}

public class Instrumento {
    
}
