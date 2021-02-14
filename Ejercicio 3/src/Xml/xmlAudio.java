/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author jared
 */
public class xmlAudio {
    
    public void crearAudio(String codigo, String Interna, String Titulo, String Artista, String Genero, String Duracion,
             String NC, String UD) {

        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creo un DOMImplementation
            DOMImplementation implementation = builder.getDOMImplementation();

            // Creo un documento con un elemento raiz
            Document documento = implementation.createDocument(null, "CD", null);
            documento.setXmlVersion("1.0");

           // Creo los elementos o secciones de incio
            Element CD = documento.createElement("Secciones");
            // Creo los elementos o secciones de final
            Element cd = documento.createElement("Secciones");

            // Creo los elementos o etiquetas codigo
            Element Codigo = documento.createElement("Codigo");
            // el texto que ire dentro la etiqueta
            Text textCodigo = documento.createTextNode(codigo);
            Codigo.appendChild(textCodigo);
            cd.appendChild(Codigo);

            // interna etiquetas
            Element interna = documento.createElement("Interna");

            Text textInterna = documento.createTextNode(Interna);
            interna.appendChild(textInterna);
            cd.appendChild(interna);

            // Titulo etiquetas
            Element titulo = documento.createElement("Titulo");

            Text textTitulo = documento.createTextNode(Titulo);
            titulo.appendChild(textTitulo);
            cd.appendChild(titulo);

            // editorial etiquetas
            Element artista = documento.createElement("Artista");

            Text textartista = documento.createTextNode(Artista);

            artista.appendChild(textartista);

            cd.appendChild(artista);

            // Periodicidad etiquetas
            Element duracion = documento.createElement("Duracion");

            Text textDuracion= documento.createTextNode(Duracion);

            duracion.appendChild(textDuracion);

            cd.appendChild(duracion);

            // Año_de_publicacion etiquetas
            Element numeroCanciones = documento.createElement("Numero_de_Canciones");

            Text textNC = documento.createTextNode(NC);

            numeroCanciones.appendChild(textNC);

            cd.appendChild(numeroCanciones);

            // Unidades_Disponibles etiquetas
            Element UnidadesDisponibles = documento.createElement("Unidades_Disponibles");

            Text textUD = documento.createTextNode(UD);

            UnidadesDisponibles.appendChild(textUD);

            cd.appendChild(UnidadesDisponibles);

            
            CD.appendChild(cd);

            // Añado al todo lo escrito al xml
            documento.getDocumentElement().appendChild(cd);

            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("CD.xml"));

            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    public void leer ()
    {
           try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Obtengo el documento, a partir del XML
            Document documento = builder.parse(new File("CD.xml"));

            //Se agarra todas las etiquetas secciones y lo recorre en el for
            NodeList listaLibro = documento.getElementsByTagName("Secciones");

               System.out.println("CD");
            // Recorre las etiquetas
            
            for (int i = 0; i < listaLibro.getLength(); i++) {
                // agarro el nodo actual 
                Node nodo = listaLibro.item(i);
                // Compruebo si el nodo es un elemento
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Lo transformo a Element
                    Element e = (Element) nodo;
                    // Obtengo sus hijos
                    NodeList hijos = e.getChildNodes();
                    // Recorro sus hijos
                    for (int j = 0; j < hijos.getLength(); j++) {
                        // Obtengo al hijo actual
                        Node hijo = hijos.item(j);
                        // Compruebo si es un nodo
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            // Muestro el contenido
                            System.out.println("\nPropiedad: " + hijo.getNodeName() + ", valor: " + hijo.getTextContent());
                        }

                    }
                }

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }
    

