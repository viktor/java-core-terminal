package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;

public class Metodos { 
    
    //Clases
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Formato de fecha ingresada.
    Calendar calendar1 = new GregorianCalendar(); //Conversion fecha actual.
    Calendar calendar2 = new GregorianCalendar(); //Conversion fecha ingresada.
    Date fechaactual = new Date(); //Obtener fecha actual del sistema.
    
    //Atributos.
    String nombre;
    int genero=0;
    String fechanac;
    int edad;
    int meses_diferencia;
    int dias_diferencia;
    Date fecha = null;
    String saludo;
    String signo_zodiacal = "";
    String bisiesto;
    
    //Atributos fecha ingresada.
    int año = 0;
    int dia = 0;
    int mes = 0;
    
    //Atributos fecha actual del sistema.
    int año_actual = 0;
    int dia_actual = 0;
    int mes_actual = 0;
    
    public void IngresarDatos()
    {
        do
        {
            nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Bienvenido",JOptionPane.PLAIN_MESSAGE);
        }while(nombre == null || nombre.isEmpty());
        do
        {
            genero = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija su género: \n\n1. Masculino\n\n2. Femenino", "Género",JOptionPane.PLAIN_MESSAGE));
            
        }while(genero<1 || genero>2);
        
        fechanac = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento\nFormato = dia/mes/año \nEjemplo: 02/10/2005", "Fecha de Nacimiento",JOptionPane.PLAIN_MESSAGE);
        try
        {
            fecha = formato.parse(fechanac);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Formato de fecha erroneo. ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Convertor()
    {
        calendar1.setTime(fechaactual);
        año_actual = calendar1.get(calendar1.YEAR);
        mes_actual = calendar1.get(calendar1.MONTH);
        dia_actual = calendar1.get(calendar1.DATE);
        
        calendar2.setTime(fecha);
        año = calendar2.get(calendar2.YEAR);
        mes = calendar2.get(calendar2.MONTH);
        dia = calendar2.get(calendar2.DATE);
        
        meses_diferencia = mes_actual - mes;
        dias_diferencia = dia_actual - dia;
    }
    
    public void SignoZodiacal()
    {
        Convertor();
        if(dia >= 20 && mes >= 0 || dia <= 18 && mes <= 1)
                    {
                        signo_zodiacal = "Su signo zodiacal es Acuario";
                    }else
                    if(mes >= 1 && dia >= 19 || dia <= 20 && mes <= 2)
                    {
                        signo_zodiacal = "Su signo zodiacal Piscis";
                    }else
                        if(mes >= 2 && dia >= 21 || dia <= 19 && mes <= 3)
                        {
                            signo_zodiacal = "Su signo zodiacal Aries";
                        }else
                            if(mes >= 3 && dia >= 20 || dia <= 20 && mes <= 4)
                            {
                                signo_zodiacal = "Su signo zodiacal Tauro";
                            }else
                                if(mes >= 4 && dia >= 21 || dia <= 20 && mes <= 5)
                                {
                                    signo_zodiacal = "Su signo zodiacal Géminis";
                                }else
                                    if(mes >= 5 && dia >= 21 || dia <= 22 && mes <= 6)
                                    {
                                        signo_zodiacal = "Su signo zodiacal Cáncer";
                                    }else
                                        if(mes >= 6 && dia >= 23 || dia <= 22 && mes <= 7)
                                        {
                                            signo_zodiacal = "Su signo zodiacal Leo";
                                        }else
                                            if(mes >= 7 && dia >= 23 || dia <= 22 && mes <= 8)
                                            {
                                                signo_zodiacal = "Su signo zodiacal Virgo";
                                                }else
                                                    if(mes >= 8 && dia >= 23 || dia <= 22 && mes <= 9)
                                                    {
                                                        signo_zodiacal = "Su signo zodiacal Libra";
                                                    }else
                                                        if(mes >= 9 && dia >= 23 || dia <= 21 && mes <= 10)
                                                        {
                                                            signo_zodiacal = "Su signo zodiacal Escorpio";
                                                        }else
                                                            if(mes >= 10 && dia >= 22 || dia <= 21 && mes <= 11)
                                                            {
                                                                signo_zodiacal = "Su signo zodiacal Sagitario";
                                                            }else
                                                                if(mes >= 10 && dia >= 22 || dia <= 19 && mes <= 11)
                                                                {
                                                                    signo_zodiacal = "Su signo zodiacal Capricornio";
                                                                }
    }
    
    public void AñoBisiesto()
    {
        //Calcular si el año es bisiesto o no
                if(año%4==0)
                {
                    if(año%100==0)
                    {
                        if(año%400==0)
                        {
                            bisiesto = "\nEl año " + año + " es bisiesto, tiene 366 días.";
                        }else
                        {
                            bisiesto = "\nEl año " + año + " no es bisiesto, tiene 365 días.";
                        }
                    }else
                    {
                        bisiesto = "\nEl año " + año + " es bisiesto, tiene 366 días.";
                    }
                }else
                {
                    bisiesto = "\nEl año " + año + " no es bisiesto, tiene 365 días.";
                }
    }
   
    public void Proceso_Datos()
    {
        Convertor();
        if(meses_diferencia == 0 && dias_diferencia <= dia_actual && dias_diferencia > 0|| meses_diferencia == 0 && dias_diferencia == 0 || meses_diferencia > 0)
        {
            edad = año_actual - año; //Obtenemos la edad actual.
            
            if(meses_diferencia == 0 && dias_diferencia == 0)
            {
                JOptionPane.showMessageDialog(null, "Hoy es tu cumpleaños, ¡Felicidades " + nombre + "!");
            }
            
            if(genero == 1)//Genero Hombre
            {
                if(edad > 30)
                {
                    saludo = "Buenos días Mr. " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }else
                {
                    saludo = "Hola amigo " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }
                
                SignoZodiacal();
                AñoBisiesto();
                
                JOptionPane.showMessageDialog(null, saludo + signo_zodiacal + bisiesto + "\nUsted nació un: " + fecha);
            }else if(genero == 2)// Genero Mujer 
            {
                if(edad > 30)
                {
                    saludo = "Buenos días Ms. " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }else
                {
                    saludo = "Hola amiga " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }
                
                SignoZodiacal();
                AñoBisiesto();
                
                JOptionPane.showMessageDialog(null, saludo + signo_zodiacal + bisiesto + "\nUsted nació un: " + fecha);
            }
        }else if(meses_diferencia<0 || meses_diferencia == 0 && dias_diferencia < 0)
        {
            edad = año_actual - año;
            edad -= 1; //Obtenemos la edad actual.
            
            if(genero == 1)//Genero Hombre
            {
                if(edad > 30)
                {
                    saludo = "Buenos días Mr. " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }else
                {
                    saludo = "Hola amigo " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }
                
                SignoZodiacal();
                AñoBisiesto();
                
                JOptionPane.showMessageDialog(null, saludo + signo_zodiacal + bisiesto + "\nUsted nació un: " + fecha);
            }else if(genero == 2)// Genero Mujer 
            {
                if(edad > 30)
                {
                    saludo = "Buenos días Ms. " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }else
                {
                    saludo = "Hola amiga " + nombre + ".\nSu edad actual es " + edad + " años.\n";
                }
                
                SignoZodiacal();
                AñoBisiesto();
                
                JOptionPane.showMessageDialog(null, saludo + signo_zodiacal + bisiesto + "\nUsted nació un: " + fecha);
            }
        }
    }
}
