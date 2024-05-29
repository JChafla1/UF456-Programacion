package Vehicle;

public class Bicicleta implements vehicle {

    // Atributos
    private String tipus;
    private int velocitatActual;

    // Constructores
    public Bicicleta(String tipus) {
        this.tipus = tipus;
        this.velocitatActual = 0;
    }
}
