/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;
import Xml.xmlLibro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
 
/**
 *
 * @author jared
 */
public class libros extends materialEscrito{
    private String autor;
    private String Numero_de_Paginas;
    private String ISBN;
    
   
    
    HashMap caja = new HashMap<>();
    ArrayList<String> lista = new ArrayList<>();
    
      // xml 
     xmlLibro XL = new xmlLibro(); 
    
    
    public void Agregar()
    {
        String vacio = "";
        //--------------------INTERNA-----------------
        do{ 
        Interna = JOptionPane.showInputDialog("Ingrese la Interna :");
        if(!(Interna == null || vacio.equals(Interna))){
            caja.put(Interna, lista);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Interna == null || vacio.equals(Interna))); 
        
         //---------------------CODIGO-----------------------
        do{     
        Codigo = JOptionPane.showInputDialog("Ingrese el Codigo del libro :");
        if(!(Codigo == null || vacio.equals(Codigo))){
            lista.add(Codigo);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Codigo == null || vacio.equals(Codigo))); 
      
         //---------------------titulo-----------------------
        do{     
        Titulo = JOptionPane.showInputDialog("Ingrese el Titulo del libro :");
        if(!(Titulo == null || vacio.equals(Titulo))){
            lista.add(Titulo);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Titulo == null || vacio.equals(Titulo))); 
      
         //---------------------AUTOR-----------------------
        do{     
        autor = JOptionPane.showInputDialog("Ingrese el Autor del libro :");
        if(!(autor == null || vacio.equals(autor))){
            lista.add(autor);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((autor == null || vacio.equals(autor)));
        
         //---------------------numero de paginas-----------------------
        do{     
        Numero_de_Paginas = JOptionPane.showInputDialog("Ingrese el numero de paginas :");
        if(!(Numero_de_Paginas== null || vacio.equals(Numero_de_Paginas))){
            lista.add(Numero_de_Paginas);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Numero_de_Paginas == null || vacio.equals(Numero_de_Paginas)));
        
         //---------------------editorial-----------------------
        do{     
        Editorial = JOptionPane.showInputDialog("Ingrese la Editorial :");
        if(!(Editorial == null || vacio.equals(Editorial))){
            lista.add(Editorial);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Editorial == null || vacio.equals(Editorial)));
       
        
          //---------------------IBSN-----------------------
        do{     
        ISBN = JOptionPane.showInputDialog("Ingrese el IBSN del Libro :");
        if(!(ISBN == null || vacio.equals(ISBN))){
            lista.add(ISBN);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((ISBN == null || vacio.equals(ISBN)));
        
           //---------------------Año de publicacion-----------------------
        do{     
        Año_de_publicacion = JOptionPane.showInputDialog("Ingrese el año de publicacion : ");
        if(!(Año_de_publicacion == null || vacio.equals(Año_de_publicacion))){
            lista.add(Año_de_publicacion);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Año_de_publicacion == null || vacio.equals(Año_de_publicacion)));
        
            //---------------------unidades disponibles-----------------------
        do{     
        Unidades_disponibles = JOptionPane.showInputDialog("Ingrese las Unidades Disponibles : ");
        if(!(Unidades_disponibles  == null || vacio.equals(Unidades_disponibles ))){
            lista.add(Unidades_disponibles );
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Unidades_disponibles  == null || vacio.equals(Unidades_disponibles)));
        
        // XML
        XL.crearLibro(Codigo, Interna,  Titulo,   autor,   Numero_de_Paginas,  Editorial,
             ISBN ,  Año_de_publicacion,  Unidades_disponibles);
        
    }

    public void Modificar()
    {
        lista.clear();
        caja.clear();
        Agregar();
    }
    public void Ver()
    {
        
          Set set = caja.entrySet();
        Iterator iterador = set.iterator();

        while (iterador.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterador.next();
            JOptionPane.showMessageDialog(null, " Interna \n" + mentry.getKey());
            
             if(!lista.isEmpty()){
           JOptionPane.showMessageDialog(null, "Los Datos del Libros son");
           for (int i=0; i < lista.size(); i++){
            
            if (i == 0 ){
           JOptionPane.showMessageDialog(null, " id: "+lista.get(i));
       
            }
            
            if (i == 1)
            {
            JOptionPane.showMessageDialog(null, "Titulo :"+lista.get(i));
            }
            
            if (i == 2 ){
           JOptionPane.showMessageDialog(null, "Autor:"+lista.get(i));
       
            }
            
            if (i == 3)
            {
            JOptionPane.showMessageDialog(null, "numero de paginas :"+lista.get(i));
            }
            
            if (i == 4 ){
           JOptionPane.showMessageDialog(null, "editorial : "+lista.get(i));
       
            }   
            
             if (i == 5 ){
           JOptionPane.showMessageDialog(null, "IBSN : "+lista.get(i));
       
            }   
             
              if (i == 6 ){
           JOptionPane.showMessageDialog(null, "Año de publicacion : "+lista.get(i));
       
            }   
              
              if (i == 7 ){
           JOptionPane.showMessageDialog(null, "unidades Disponibles : "+lista.get(i));
       
            }   
       }
       }
       else{
       JOptionPane.showMessageDialog(null,"No se encuentra Elementos");
       }
        }
        // XML 
        XL.leer();
    }

    
    public void Borrar()
    {
          JOptionPane.showMessageDialog(null,"La lista ha sido borrada con exito");
          caja.clear();
          lista.clear();
    }
    
    
    public void Buscar()
    {
        Interna = JOptionPane.showInputDialog(null,"Ingrese la Interna para buscar ");
         
        if (caja.containsKey(Interna))
         {
              
          JOptionPane.showMessageDialog(null,"La busqueda finalizo");
          JOptionPane.showMessageDialog(null,"Los Datos son");
          Ver();
         }
         else
         {
              JOptionPane.showMessageDialog(null,"No se encuentra Elementos");
         
         }
    }
    
    public void Salir()
    {
         System.exit(0);
    }

  
}
