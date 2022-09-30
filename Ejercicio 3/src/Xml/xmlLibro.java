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
public class xmlLibro {

    public void crearLibro(String codigo, String Interna, String Titulo, String Autor, String NP, String Editorial,
            String isbn, String AP, String UD) {

        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creo un DOMImplementation
            DOMImplementation implementation = builder.getDOMImplementation();

            // Creo un documento con un elemento raiz
            Document documento = implementation.createDocument(null, "libro", null);
            documento.setXmlVersion("1.0");

            // Creo los elementos o secciones de incio
            Element Libro = documento.createElement("Secciones");
            // Creo los elementos o secciones de final
            Element libro = documento.createElement("Secciones");

            // Creo los elementos o etiquetas codigo
            Element Codigo = documento.createElement("Codigo");
            // el texto que ire dentro la etiqueta
            Text textCodigo = documento.createTextNode(codigo);
            Codigo.appendChild(textCodigo);
            libro.appendChild(Codigo);

            // Tinterna etiquetas
            Element interna = documento.createElement("Interna");
            //texto dentro de la etiqueta
            Text textInterna = documento.createTextNode(Interna);
            interna.appendChild(textInterna);
            libro.appendChild(interna);

            // Titulo etiquetas
            Element titulo = documento.createElement("Titulo");
            //texto dentro de la etiqueta
            Text textTitulo = documento.createTextNode(Titulo);
            titulo.appendChild(textTitulo);
            libro.appendChild(titulo);

            // Autor etiquetas
            Element autor = documento.createElement("Autor");
            //texto
            Text textAutor = documento.createTextNode(Autor);
            //texto ira dentro de la etiqueta autor
            autor.appendChild(textAutor);
            // y autor ira dentro de codigo la primer etiqueta
            libro.appendChild(autor);

            // NumeroPaginas etiquetas
            Element NumeroPaginas = documento.createElement("NumeroPaginas");
            //texto
            Text textNP = documento.createTextNode(NP);
            //texto ira dentro de la etiqueta NumeroPaginas
            NumeroPaginas.appendChild(textNP);
            // y NumeroPaginas ira dentro de codigo la primer etiqueta
            libro.appendChild(NumeroPaginas);

            // editorial etiquetas
            Element editorial = documento.createElement("Editorial");
            //texto
            Text textEditorial = documento.createTextNode(Editorial);
            //texto ira dentro de la etiqueta Editorial
            editorial.appendChild(textEditorial);
            // y Editorial ira dentro de codigo la primer etiqueta
            libro.appendChild(editorial);

            // ISBN etiquetas
            Element ISBN = documento.createElement("ISBN");
            //texto
            Text textISBN = documento.createTextNode(isbn);
            //texto ira dentro de la etiqueta ISBN
            ISBN.appendChild(textISBN);
            // y ISBN ira dentro de codigo la primer etiqueta
            libro.appendChild(ISBN);

            // Año_de_publicacion etiquetas
            Element AñoPublicacion = documento.createElement("Año_de_publicacion");
            //texto
            Text textAP = documento.createTextNode(AP);
            //texto ira dentro de la etiqueta Año_de_publicacion
            AñoPublicacion.appendChild(textAP);
            // y Año_de_publicacion ira dentro de codigo la primer etiqueta
            libro.appendChild(AñoPublicacion);

            // Unidades_Disponibles etiquetas
            Element UnidadesDisponibles = documento.createElement("Unidades_Disponibles");
            //texto
            Text textUD = documento.createTextNode(UD);

            //texto ira dentro de la etiqueta Unidades_Disponibles
            UnidadesDisponibles.appendChild(textUD);
            // y Unidades_Disponibles ira dentro de codigo la primer etiqueta
            libro.appendChild(UnidadesDisponibles);

            // Añado al elemento codigo el elemento codigo
            Libro.appendChild(libro);

            // Añado al todo lo escrito al xml
            documento.getDocumentElement().appendChild(libro);

            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("libro.xml"));

            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void leer() {
        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Obtengo el documento, a partir del XML
            Document documento = builder.parse(new File("libro.xml"));

            //Se agarra todas las etiquetas secciones y lo recorre en el for
            NodeList listaLibro = documento.getElementsByTagName("Secciones");

            System.out.println("Libros");
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
