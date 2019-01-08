package com.ejercicios;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {

		 Scanner leer  = new Scanner(System.in);
		 String capturar=null;
		 double g= 0, b=0;
		 
		 System.out.println("un militar dispara una bala de una pistola de 9 mm en direccion vertical hacia arriba, a una velocidad de 330m/s con una gravedad de 9.8 m/s "
		 		+ "calcule la altura maxima \n");
		 
		 System.out.println("datos \n"
		 		+ "velocidad inicial = 330m/s \n"
		 		+ "gravedad = 9.8 m/s \n"
		 		+ "altura maxima=?");
		 
		 System.out.println("la formula a utilizar es : "
		 		+ "vf2= vo2 + 2g.h \n ");
		  g= 330*2+2*9.8;
		  System.out.println("la altura maxima que alcansa la bala es : "+ g);
	
		 

	}

}
