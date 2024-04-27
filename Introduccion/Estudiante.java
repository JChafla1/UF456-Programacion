package Introduccion;

public class Estudiante {
    // Atributos
    private String nombre;
    private int edat;
    private int curso;

    // GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public int getEdat() {
        return edat;
    }
    
    public int getCurso() {
        return curso;
    }

    // SETTERS
    public void getNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
