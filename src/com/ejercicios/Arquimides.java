package com.ejercicios;
import java.util.Scanner;

public class Arquimides {

	public static void main(String[] args) {
	
		 Scanner leer  = new Scanner(System.in);
		 String capturar=null;
		 double d= 0, v=0, m=0;
		 
		  System.out.println("seleccione un literal de para la operacion que usted desea \n ");
		  System.out.println("a) Ejercicio con valores dados \n "
		  		+"b) ejercicio con valores a introducir  \n");
		 capturar=leer.next();
		  
		 switch(capturar ){
		 
			 case "a":
		 System.out.println("El enunciado es : \n"
		 		+ "todo cuerpo sumergido en un fluido experimenta un empuje vertical y hacia arriba igual al peso de fluido desalojado \n");
		 
		 System.out.println(" la masa de una roca es 20 g y ocupa un volumen de 5 cm3 \n"
		 		+ "¿cual es la densidad de la roca \n ?");
		 
		 
		 System.out.println("formula a utilizar es :"
		 		+ "d=m/v \n"
		 		+ "d= densidad a encontrar \n"
		 		+ "m= masa del objeto \n"
		 		+ "v= volumen del objeto \n");
		 
		 		d=20/5;
		  System.out.println("La densidad es  : "+d+"g/cm3");
		  break;
		  
			 case "b":
				 System.out.println("El enunciado es : \n"
				 		+ " todo cuerpo sumergido en un fluido experimenta un empuje vertical y hacia arriba igual al peso de fluido desalojado \n");
				 
				 System.out.println(" la masa de un obejto es ? y ocupa un volumen de ? \n "
				 		+ "¿cual es la densidad del objeto ?\n");
				 
				 System.out.println("introduzca la masa del objeto");
				 m=leer.nextDouble();
				 System.out.println("introduzca el volumen del objeto");
				 v=leer.nextDouble();
				 
				 System.out.println(" formula a utilizar es :"
				 		+ "d=m/v \n"
				 		+ "d= densidad a encontrar \n"
				 		+ "m= masa del objeto \n"
				 		+ "v= volumen del objeto \n");
				 
				 		d=m/v;
				  System.out.println("La densidad es  : "+d+"g/cm3");
				  break;
		 }
		 
			 
			 


	}

}
