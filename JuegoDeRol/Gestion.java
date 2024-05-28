package JuegoDeRol;

import java.util.List;

public class Gestion {
    // Atributos
    private List<Personaje> personajes;
    private List<Elemento> elementos;

    //Constructor
    public Gestion() {
        this.personajes = new ArrayList<>();
        this.elementos = new ArrayList<>();
    }


    // Métodos para gestionar personajes
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void eliminarPersonaje(String nombre) {
        personajes.removeIf(personaje -> personaje.getNombre().equals(nombre));
    }

    public List<Personaje> listarPersonajes() {
        return personajes;
    }
    
}
