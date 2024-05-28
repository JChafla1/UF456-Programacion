package JuegoDeRol;

public class JuegoRol {
    public static void main(String[] args) {
        
        // Crear una instancia de Gestion
        Gestion gestion = new Gestion();

        // Cargar personajes desde el XML
        String archivoXML = "personatges.xml"; // Ruta del archivo XML
        CargadorXML.cargarPersonajesDesdeXML(archivoXML, gestion);

    }
}
