/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;
import Xml.xmlVideo;
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
public class video extends materialAudioVisual {
    
    private String Duracion;
    private String Director;
    
    HashMap caja = new HashMap<>();
    ArrayList<String> lista = new ArrayList<>();
    
    // xml
    
    xmlVideo XV = new xmlVideo();
    

    
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
        Codigo = JOptionPane.showInputDialog("Ingrese el Codigo del DVD :");
        if(!(Codigo == null || vacio.equals(Codigo))){
            lista.add(Codigo);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Codigo == null || vacio.equals(Codigo)));   
       
        //----------------TITULO------------------------
        do{     
        Titulo = JOptionPane.showInputDialog("Ingrese el Titulo del DVD :");
        if(!(Titulo == null || vacio.equals(Titulo))){
                lista.add(Titulo);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Titulo == null || vacio.equals(Titulo)));  
        
        //----------------director------------------------
        do{     
        Director = JOptionPane.showInputDialog("Ingrese el Director del DVD:");
        if(!(Director == null || vacio.equals(Director))){
                lista.add(Director);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Director == null || vacio.equals(Director))); 
        
         //----------------duracion------------------------
        do{     
        Duracion = JOptionPane.showInputDialog("Ingrese la Duracion :");
        if(!(Duracion == null || vacio.equals(Duracion))){
                lista.add(Duracion);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Duracion == null || vacio.equals(Duracion))); 
        
          //-----------------Genero-------------------------
        do{     
           
        Genero = JOptionPane.showInputDialog("Ingrese el Genero del DVD :");
        if(!(Genero == null || vacio.equals(Genero))){
                lista.add(Genero);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Genero == null || vacio.equals(Genero))); 
        
        //xml
        XV.crearVideo(Codigo, Interna, Titulo, Director, Duracion, Genero);
         
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
            JOptionPane.showMessageDialog(null, "Interna: \n " + mentry.getKey());
            
             if(!lista.isEmpty()){
           JOptionPane.showMessageDialog(null, "Los Datos de DVD son :  \n");
           
           for (int i=0; i < lista.size(); i++){
            
            if (i == 0 ){
           JOptionPane.showMessageDialog(null, "El id del DVD es : "+lista.get(i));
       
            }
            
            if (i == 1)
            {
            JOptionPane.showMessageDialog(null, "El titulo del DVD es : "+lista.get(i));
            }
            
            if (i == 2 ){
           JOptionPane.showMessageDialog(null, "El Director del DVD es : "+lista.get(i));
       
            }
            
            if (i == 3)
            {
            JOptionPane.showMessageDialog(null, "El genero del DVD es: "+lista.get(i));
            }
            
            if (i == 4 ){
           JOptionPane.showMessageDialog(null, "La Duración del DVD es : "+lista.get(i));
       
            }        
       }
       }
       else{
       JOptionPane.showMessageDialog(null,"No se encuentra Elementos");
       }
        }
        // XML
        XV.leer();
        
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
