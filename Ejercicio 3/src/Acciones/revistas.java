/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;
    
import Xml.xmlRevista;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import menus.Swicht;

/**
 *
 * @author jared
 */
public class revistas extends materialEscrito{
   private String Periodicidad;

    HashMap caja = new HashMap<>();
    ArrayList<String> lista = new ArrayList<>();
    
    // XML
    xmlRevista XR = new xmlRevista();
   
    
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
        
        
        //--------------------codigo-----------------
        do{ 
        Codigo = JOptionPane.showInputDialog("Ingrese el Codigo de la Revista :");
        if(!(Codigo == null || vacio.equals(Codigo))){
            lista.add(Codigo);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Codigo == null || vacio.equals(Codigo))); 
        
       //--------------------Titulo-----------------
        do{ 
        Titulo = JOptionPane.showInputDialog("Ingrese el Titulo de la Revista :");
        if(!(Titulo  == null || vacio.equals(Titulo ))){
            lista.add(Titulo);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Titulo  == null || vacio.equals(Titulo))); 
        
        //--------------------editorial-----------------
        do{ 
       Editorial = JOptionPane.showInputDialog("Ingrese la Editorial :");
        if(!(Editorial  == null || vacio.equals(Editorial))){
            lista.add(Editorial);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Editorial == null || vacio.equals(Editorial))); 
        
         //--------------------periodicidad-----------------
        do{ 
       Periodicidad = JOptionPane.showInputDialog("Ingrese la periodicidad:");
        if(!( Periodicidad == null || vacio.equals( Periodicidad))){
            lista.add( Periodicidad);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while (( Periodicidad == null || vacio.equals( Periodicidad))); 
        
       
        //--------------------año de publicacion-----------------
        do{ 
       Año_de_publicacion = JOptionPane.showInputDialog("Ingrese la fecha de publicacion :");
        if(!(  Año_de_publicacion == null || vacio.equals( Año_de_publicacion))){
            lista.add(Año_de_publicacion);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((  Año_de_publicacion == null || vacio.equals( Año_de_publicacion))); 
        
          //--------------------año de publicacion-----------------
        do{ 
       Unidades_disponibles = JOptionPane.showInputDialog("Ingrese las Unidades Disponibles : ");
        if(!(Unidades_disponibles == null || vacio.equals(Unidades_disponibles))){
            lista.add(Unidades_disponibles);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Unidades_disponibles == null || vacio.equals(Unidades_disponibles))); 
        
        // XML
        XR.crearRevista(Codigo, Interna, Titulo, Editorial, Periodicidad, Año_de_publicacion, Unidades_disponibles);
      
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
            JOptionPane.showMessageDialog(null, "Interna :\n" + mentry.getKey());
            
        if(!lista.isEmpty()){
                 
           JOptionPane.showMessageDialog(null, "Los Datos de la revista son");
           for (int i=0; i < lista.size(); i++){
            
        
            if (i == 0 ){
           JOptionPane.showMessageDialog(null, " id: "+lista.get(i));
       
            }
            
            if (i == 1)
            {
            JOptionPane.showMessageDialog(null, "Titulo :"+lista.get(i));
            }
            
            if (i == 2 ){
           JOptionPane.showMessageDialog(null, "Editorial:"+lista.get(i));
       
            }
            
            if (i == 3)
            {
            JOptionPane.showMessageDialog(null, "Periodicidad :"+lista.get(i));
            }
            
            if (i == 4 ){
           JOptionPane.showMessageDialog(null, "Fecha de Publicacion : "+lista.get(i));
       
            }   
            
             if (i == 5 ){
           JOptionPane.showMessageDialog(null, "Unidades Disponibles : "+lista.get(i));
       
            }   
             
       }
       }
       else{
       JOptionPane.showMessageDialog(null,"No se encuentra Elementos");
       }
        }
        
        // XML 
        XR.leer();
        
    }

    
    public void Borrar()
    {
          JOptionPane.showMessageDialog(null,"La lista ha sido borrada con exito");
          caja.clear();
          lista.clear();
    }
    
    
    public void Buscar(){
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
