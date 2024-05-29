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

    // Este es un método adicional que devuelve el tipo de bicicleta (tipo)
    public String getTipo() {
        return this.tipo;
    }
}
