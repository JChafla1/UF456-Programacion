package JuegoDeRol;

public class Personaje {
    // Atributos
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeMana;

    // Constructor para inicializar un objeto Personaje con valores específicos
    public Personaje(String nombre, int nivel, int puntosDeVida, int puntosDeMana) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeMana = puntosDeMana;
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getPuntosDeMana() {
        return puntosDeMana;
    }


    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public void setPuntosDeMana(int puntosDeMana) {
        this.puntosDeMana = puntosDeMana;
    }


    // Método toString para representar como una cadena de texto
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", puntosDeMana=" + puntosDeMana +
                '}';
    }

}
