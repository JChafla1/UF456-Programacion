package Vehicle;

public class Bicicleta implements vehicle {

    // Atributos
    private String tipo;
    private int velocidatActual;

    // Constructores
    public Bicicleta(String tipo) {
        this.tipo = tipo;
        this.velocidatActual = 0;
    }

    // Lo mismo que en el archivo anterior
    @Override
    public void accelerar(int velocidat) {
        this.velocidatActual += velocidat;
    }

    @Override
    public void frenar() {
        this.velocidatActual = 0;
    }

    @Override
    public int obtenerVelocidadActual() {
        return this.velocidatActual;
    }

}
