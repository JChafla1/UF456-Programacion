package JuegoDeRol;

public class Personaje {
    // Atributos
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeMana;
    private String arma;
    private String armadura;

    // Constructor para inicializar un objeto Personaje con valores específicos
    public Personaje(String nombre, int nivel, int puntosDeVida, int puntosDeMana, String arma, String armadura) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeMana = puntosDeMana;
        this.arma = arma;
        this.armadura = armadura;
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

    public String getArma() {
        return arma;
    }

    public String getArmadura() {
        return armadura;
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

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    // Método toString para representar como una cadena de texto
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", puntosDeMana=" + puntosDeMana +
                ", arma='" + arma + '\'' +
                ", armadura='" + armadura + '\'' +
                '}';
    }
    
}
