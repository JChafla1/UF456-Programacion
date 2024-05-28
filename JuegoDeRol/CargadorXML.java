package JuegoDeRol;

import org.xml.sax.SAXException;

public class CargadorXML {

    public static void cargarPersonajesDesdeXML(String archivo, Gestion gestion) {

        try {
            // Se carga y normaliza el archivo XML
            File inputFile = new File(archivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

        }
        
    }
    
}
