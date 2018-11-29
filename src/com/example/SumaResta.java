package com.example;

import java.util.Scanner;

public class SumaResta {

   /**
    * Ejemplo simple de una calculadora de sumas y restas.
    * @param args
    */
   public static void main(String[] args) {
	   
	   System.out.println(" \n **** | CALC |**** \n  *** IN TERMINAL *** \n" 
          + "Operaciones Numero enteros \n a) suma \n b) resta ");
	   
	   //Scanner toma la terminal en cada momento espere por un valor el cursor de la terminal
	   //leera el valor
	   Scanner scanner = new Scanner(System.in);
	   //esperando leer el valor
	   String valorEscrito = scanner.nextLine();
	   Integer numeroEntero1;
	   Integer numeroEntero2;
	   
	   //Ejemplo de if  ==
	   if(valorEscrito.equals("a")) {
		   //No hago nada solo es muestra
	   }else{
		   //No hago nada solo es muestra
	   }
	   
	   switch (valorEscrito) {// recibe una variable a evaluar
		case "a": //si el valor es igual a "a"
			System.out.println("Escriba primer numero:");
			scanner = new Scanner(System.in);
			valorEscrito = scanner.nextLine();
			
			//Integer.valueOf convierte un valor a entero
			numeroEntero1 = Integer.valueOf(valorEscrito);
			
			System.out.println("Escriba el segundo numero:");
			scanner = new Scanner(System.in);
			valorEscrito = scanner.nextLine();
			numeroEntero2 = Integer.valueOf(valorEscrito);
			
			System.out.println("Resultado: " + (numeroEntero1 + numeroEntero2));
			break;//se usa para detener la ejecucion despues de tener el caso exitoso
			
		case "b":
			System.out.println("Escriba primer numero:");
			scanner = new Scanner(System.in);
			valorEscrito = scanner.nextLine();
			numeroEntero1 = Integer.valueOf(valorEscrito);
			
			System.out.println("Escriba el segundo numero:");
			scanner = new Scanner(System.in);
			valorEscrito = scanner.nextLine();
			numeroEntero2 = Integer.valueOf(valorEscrito);
			
			System.out.println("Resultado: " + (numeroEntero1 - numeroEntero2));
			break;
		default: //es como un else, sin embargo puedo usar otro case
			break;
	   }
	   
	   System.out.println("Thanks for use CALC :)");
	   
   }

}
