package JuegoDeRol;

public class Elemento {
    // Atributos
    private String nombre;
    private String arma;
    private String armadura;
    private String pociones;

    // Constructores
    public Elemento(String nombre, String arma, String armadura, String pociones) {
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
        this.pociones = pociones;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getArma() {
        return arma;
    }

    public String getArmadura() {
        return armadura;
    }

    public String getPociones() {
        return pociones;
    }


    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public void setPociones(String pociones) {
        this.pociones = pociones;
    }
}
