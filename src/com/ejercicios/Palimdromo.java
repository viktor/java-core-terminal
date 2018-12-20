package com.ejercicios;

import java.util.Scanner;

public class Palimdromo {

	public static void main(String[] args) {
		
		  @SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		  int a = 0;
	    String palabra = null ;
	    
		  System.out.println("Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda. ");
		  System.out.println("ingrese una palabra ");
		  palabra=leer.nextLine();
		  
			char [] invertir=palabra.toCharArray();

		  for (a=palabra.length()-1; a>=0; a--)
		  {
		
			  System.out.print(invertir[a]);
		  }
			
			
			

	}

}
