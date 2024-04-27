package Introduccion;

public class Tareas {
    // Atributos
    private String descripcion;
    private boolean completada;

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() { // "is-" es el prefijo de lo boleanos
        return completada;
    }

    // Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    // Constructor
    public Tareas(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, la tarea se inicializa como no completada
    }
}
