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

            NodeList nList = doc.getElementsByTagName("personatge");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                // Se obtienen los valores de los elementos hijo de cada nodo <personatge>.
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String nombre = eElement.getElementsByTagName("nom").item(0).getTextContent();
                    int nivel = Integer.parseInt(eElement.getElementsByTagName("nivell").item(0).getTextContent());
                    int puntosDeVida = Integer.parseInt(eElement.getElementsByTagName("puntsDeVida").item(0).getTextContent());
                    int puntosDeMana = Integer.parseInt(eElement.getElementsByTagName("puntsDeMana").item(0).getTextContent());
                    String arma = eElement.getElementsByTagName("arma").item(0).getTextContent();
                    String armadura = eElement.getElementsByTagName("armadura").item(0).getTextContent();

                    // Se crean instancias de Personaje y Elemento y se agregan a Gestion
                    Personaje personaje = new Personaje(nombre, nivel, puntosDeVida, puntosDeMana);
                    gestion.agregarPersonaje(personaje);

                    Elemento elemento = new Elemento(nombre, arma, armadura, "");
                    gestion.agregarElemento(elemento);

        }
        
    }
    
}
