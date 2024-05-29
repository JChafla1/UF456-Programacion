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


    // Implementa el método acelerar de la interfaz Vehicle
    @Override
    public void accelerar(int velocidad) {
        this.velocidadActual += velocidad;
    }

    // Implementa el método frenar de la interfaz Vehicle
    @Override
    public void frenar() {
        this.velocidadActual = 0;
    }

}
