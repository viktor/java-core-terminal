/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import javax.swing.JOptionPane;
import Acciones.audio;
import Acciones.libros;
import Acciones.revistas;
import Acciones.video;

/**
 *
 * @author Lalo
 */
public class Swicht {

    
    private String Menu;
    private String opc;
    audio au = new audio();
    video dv = new video();
    libros li = new libros();
    revistas re = new revistas();
    
    
    
   
    
        
    
     //METODO PRINCIPAL
    public void Menu(){
    {
        //Pregunta que tipo de material necesita 
       
       opc = JOptionPane.showInputDialog(null,"Selccione una Opción\n"
                                            + "1. Material AudioVisual\n"
                                            + "2. Material Escrito\n"
                                            + "3. Salir" );
       
       
       switch (opc){
           
           case "1":
               //Envia al metod Materialaudiovisual
                MaterialAudioVisual();
               break;
               
           case "2":
               //Envia al metod MaterialEscrito
                MaterialEscrito();
               break;
               
           case "3":
               //Cierra el programa
             System.exit(0);
               break; 
               
           default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               Menu();
               ;
       }
       
}

    } //FIN METODO INICIAL
    
    
    // Metodo Audiovisual
    public void MaterialAudioVisual (){
  
           opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. CD de Audio\n"
                                            + "2. DVD's\n"
                                            + "3. Regresar" );
           

 
       //SWICHT PARA ELEGIR ENTRE CD Y DVD
       switch (opc){
           
           case "1":
               
               CD();
                
            break;
               
           case "2":
               
               DVD();
                
               break;
               
           case "3":
            Menu();
               break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               MaterialAudioVisual();
               ; 
    }
      
    }//fIN METODO AudioVisual
    
    
    
    
    //METODO CD
      public void CD(){
               
          opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. Agregar Material\n"
                                            + "2. Modificar Material\n"
                                            + "3. Listar Materiales Disponibles\n"
                                            + "4. Borrar Material\n"
                                            + "5. Buscar Material\n"
                                            + "6. Regresar\n" );
       
       //SWICHT PARA ELEGIR ENTRE CD Y DVD
       switch (opc){
           
           case "1":
               
               au.Agregar();
               
               CD();
            break;
               
           case "2":
               
              au.Modificar();
              CD();
               break;
               
           case "3":
              
            au.Ver();
            CD();
               break; 
               
            case "4":
               
              au.Borrar();
              CD();
                
            break;
               
           case "5":
               
              au.Buscar();
              CD();
               break;
               
           case "6":
              MaterialAudioVisual();
            break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
              CD();
            break;
    
    }
      }//FIN METODO CD
      
      
      //METODODO DVD
      public void DVD(){
               
       opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. Agregar Material\n"
                                            + "2. Modificar Material\n"
                                            + "3. Listar Materiales Disponibles\n"
                                            + "4. Borrar Material\n"
                                            + "5. Buscar Material\n"
                                            + "6. Regresar\n" );
       
       //SWICHT PARA ELEGIR ENTRE CD Y DVD
       switch (opc){
           
           case "1":
          
               dv.Agregar();
                DVD();
            break;
               
           case "2":
               
              dv.Modificar();
              DVD();
               break;
               
           case "3":
              
            dv.Ver();
            DVD();
               break; 
               
            case "4":
              
                dv.Borrar();
                DVD();
                
            break;
               
           case "5":
               
               dv.Buscar();
              DVD();
               break;
               
           case "6":
              MaterialAudioVisual();
            break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               DVD();
            break;
    
    }
      } // FIN METODO DVD
    
 
      //---------------------------------------------------------------------------------
      
      
    // Metodo Escrito
    public void MaterialEscrito(){
    
 
       opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. Libros\n"
                                            + "2. Revistas\n"
                                            + "3. Regresar" );
       
       //SWICHT PARA ELEGIR ENTRE libros y revistas
       switch (opc){
           
           case "1":
               
                Libros();  
            break;
               
           case "2":
               
               Revistas();
                
               break;
               
           case "3":
              Menu();
             break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               MaterialEscrito();
               ; 
    }
      
    }//fIN METODO Escrito
    
    
    
    
    //METODO LIBROS
      public void Libros(){
               
          opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. Agregar Material\n"
                                            + "2. Modificar Material\n"
                                            + "3. Listar Materiales Disponibles\n"
                                            + "4. Borrar Material\n"
                                            + "5. Buscar Material\n"
                                            + "6. Regresar\n" );
       
       //SWICHT PARA ELEGIR lo que desea hacer con libros
           
       switch (opc){
           
           case "1":
                   li.Agregar();
                   Libros();
            break;
               
           case "2":
               
               li.Modificar();
              Libros();
               break;
               
           case "3":
              
            li.Ver();
                          Libros();
               break; 
               
            case "4": 
                
                li.Borrar();
                              Libros();
            break;
               
           case "5":
               
              li.Buscar();
                            Libros();
               break;
               
           case "6":
              MaterialEscrito();
                            Libros();
            break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               Libros();
            break;
    
    }
      }//FIN METODO Libros
      
      
      //METODODO Revistas
      public void Revistas(){
               
       opc = JOptionPane.showInputDialog(null,"Seleccione una opcion\n"
                                            + "1. Agregar Material\n"
                                            + "2. Modificar Material\n"
                                            + "3. Listar Materiales Disponibles\n"
                                            + "4. Borrar Material\n"
                                            + "5. Buscar Material\n"
                                            + "6. Regresar\n" );
       
       //SWICHT PARA ELEGIR lo que desea hacer con revistas
       switch (opc){
           
           case "1":
                   re.Agregar();
                   Revistas();
            break;
               
           case "2":
               
               re.Modificar();
              Revistas();
               break;
               
           case "3":
              
             re.Ver();
             Revistas();
               break; 
               
            case "4": 
                
                re.Borrar();
                Revistas();
            break;
               
           case "5":
               
              re.Buscar();
              Revistas();
               break;
               
           case "6":
              MaterialEscrito();
            break; 
            
            default:
               
               JOptionPane.showMessageDialog(null, "Opción no disponible , Pruebe de Nuevo");
               Revistas();
            break;
    
    }
      } // FIN METODO Revistas
      
      
      
      
      
      
      
      
}// FIN CLASE

        


