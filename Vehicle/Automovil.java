package Vehicle;

public class Automovil implements vehicle{
    
    // Atributos
    private String marca;
    private int velocidadActual;

    // Constructor
    public Automovil(String marca) {
        this.marca = marca;
        this.velocidadActual = 0;
    }

}
