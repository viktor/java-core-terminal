/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import Xml.*;
import javax.swing.JOptionPane;
 
 

/**
 *
 * @author jared
 */

public class audio extends materialAudioVisual {
    private String Artista;
    private String Numero_de_Canciones;
    private String Unidades_Disponibles;
    
  
    
     
    //listas
    HashMap caja = new HashMap<>();
    ArrayList<String> lista = new ArrayList<>();
    
     // xml 
     xmlAudio XA = new xmlAudio();    
    
    
    
    
     
     
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
        Codigo = JOptionPane.showInputDialog("Ingrese el Codigo de la Canción :"); 
        if(!(Codigo == null || vacio.equals(Codigo))){
            lista.add(Codigo);
        } 
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        }while ((Codigo == null || vacio.equals(Codigo)));   
       
        //----------------TITULO------------------------
        do{     
        Titulo = JOptionPane.showInputDialog("Ingrese el Titulo de la Canción :");
        if(!(Titulo == null || vacio.equals(Titulo))){
                lista.add(Titulo);
        }
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Titulo == null || vacio.equals(Titulo)));  
        
        //-----------------ARTISTA--------------------------
        do{
        Artista = JOptionPane.showInputDialog("Ingrese el Artista :");
        if(!(Artista == null || vacio.equals(Artista))){
            
            lista.add(Artista);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Titulo == null || vacio.equals(Titulo)));  
        
        //-----------------GENERO--------------------------
        do{
        Genero = JOptionPane.showInputDialog("Ingrese el Genero :");
        if(!(Genero == null || vacio.equals(Genero))){
            lista.add(Genero);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Genero == null || vacio.equals(Genero)));  
        
        //-----------------duracion--------------------------
        do{
        Duracion = JOptionPane.showInputDialog("Ingrese la Duración :");
        if(!(Duracion == null || vacio.equals(Duracion))){
            lista.add(Duracion);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Duracion == null || vacio.equals(Duracion)));  
        
        
        //-----------------NUMERO DE CANCIONES--------------------------
        do{
         Numero_de_Canciones = JOptionPane.showInputDialog("Ingrese el Numero de Canciones:");
        if(!(Numero_de_Canciones == null || vacio.equals(Numero_de_Canciones))){
            lista.add(Numero_de_Canciones);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Numero_de_Canciones == null || vacio.equals(Numero_de_Canciones)));
     
         //-----------------UNIDADES DISPONIBLES--------------------------
        do{
         Unidades_Disponibles = JOptionPane.showInputDialog("Ingrese las Unidades Disponibles :");
        if(!(Unidades_Disponibles == null || vacio.equals(Unidades_Disponibles))){
            lista.add(Unidades_Disponibles);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El campo quedo vacio");
        }
        
        }while ((Unidades_Disponibles == null || vacio.equals(Unidades_Disponibles)));
        
        
        // xml
        XA.crearAudio(Codigo, Interna, Titulo, Artista, Genero, Duracion, Numero_de_Canciones, Unidades_Disponibles);
        
               
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
            JOptionPane.showMessageDialog(null," Interna : " + mentry.getKey());
            
             if(!lista.isEmpty()){
           JOptionPane.showMessageDialog(null, "Los Datos de CD son \n");
           for (int i=0; i < lista.size(); i++){
            
            if (i == 0 ){
           JOptionPane.showMessageDialog(null, "Id : "+lista.get(i));
       
            }
            
            if (i == 1)
            {
            JOptionPane.showMessageDialog(null, "Titulo : "+lista.get(i));
            }
            
            if (i == 2 ){
           JOptionPane.showMessageDialog(null, "Artista : "+lista.get(i));
       
            }
            
            if (i == 3)
            {
            JOptionPane.showMessageDialog(null, "Genero : "+lista.get(i));
            }
            
            if (i == 4 ){
           JOptionPane.showMessageDialog(null, "Duración :"+lista.get(i));
       
            }
            
            if (i == 5)
            {
            JOptionPane.showMessageDialog(null, "Numero de Canciones : "+lista.get(i));
            }
            
            if (i == 7)
            {
            JOptionPane.showMessageDialog(null, "Unidades disponibles : "+lista.get(i));
            }
       
       
       }
       }
       else{
       JOptionPane.showMessageDialog(null,"No se encuentra Elementos");
       }
        }
        
         // xml
        XA.leer();
        
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
