package com.ejercicios;

import java.util.Scanner;

public class AlturaConDatos {
	

		public static void main(String[] args) {
			
			 Scanner leer  = new Scanner(System.in);
			 String capturar=null;
			 double h= 0, vo=0, g=0;
			 
			 System.out.println("un militar dispara una bala de una pistola de 9 mm en direccion vertical hacia arriba, a una velocidad de ? con una gravedad de ? m/s "
			 		+ "calcule la altura maxima \n");
			 
			 System.out.println("introdusca los siguientes datos \n"
			 		+ "velocidad inicial \n");
			 vo=leer.nextDouble();
			 		System.out.println("gravedad  \n");
			 		 g=leer.nextDouble();
			 	System.out.println("altura maxima=?");	
			 
			 System.out.println("la formula a utilizar es : "
			 		+ "vf2= vo2 + 2g.h \n ");
			  h= vo*2+2*g;
			  System.out.println("la altura maxima que alcansa la bala es : "+ h);

		}

	}



