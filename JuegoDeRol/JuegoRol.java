package JuegoDeRol;

public class JuegoRol {
    public static void main(String[] args) {
        
        // Crear una instancia de Gestion
        Gestion gestion = new Gestion();

        // Cargar personajes desde el XML
        String archivoXML = "personatges.xml"; // Ruta del archivo XML
        CargadorXML.cargarPersonajesDesdeXML(archivoXML, gestion);

        // Listar personajes cargados
        System.out.println("Personajes cargados desde XML:");
        for (Personaje personaje : gestion.listarPersonajes()) {
            System.out.println(personaje);
        }

        // Listar elementos cargados
        System.out.println("Elementos cargados desde XML:");
        for (Elemento elemento : gestion.listarElementos()) {
            System.out.println(elemento);
        }

    }
}
