package com.example;


/**
 * Aplicando conceptos como intervalos en java
 * 
 * @author alx
 */
public class Intervalos {
	
	/**
	 * Sea un intervalo entre 1 al 10 (incluido los extremos)
	 * imprimiremos la secuencia de 1 en 1.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// aplicando concepto de arreglos 
		int intervalo[] = new int[10];
		
		/*
		 * El arreglo es un conjunto de elementos contenidos en una variable
		 * En este caso tenemos una variable entera que puede recibir 10 valores
		 * este conjunto de ejemplos puede ser modificado en posiciones
		 * 
		 * Escrito de la siguiente manera
		 * 
		 * Tipo  nombre               nuevo entero arreglo de 10 posiciones
		 * int   nombreDelArreglo[] = new int[10];
		 * 
		 * los elementos contenidos en el arreglo son accesibles de la siguiente manera
		 * 
		 * las posiciones empiezan en 0
		 * nombreDelArreglo[0] = valor;
		 * 
		 * donde valor corresponde al tipo de arreglo usado
		 * 
		 * */
		int valor = 1;
		
		/*
		 * Expresion for - es usada para crear un bucle/ciclo repetitivo
		 * 
		 * donde
		 * for( int contador=0; CONDICION a validar; contador++)
		 * el contador nos ayuda a comprender cuantas veces va a usarse 
		 * las instrucciones contenidas en el for
		 * 
		 * */
		for(int i=0; i<intervalo.length; i++) {
			//accediendo a elementos del arreglo y asignando valores
			intervalo[i] = valor++;
		}
		
		System.out.println("Interval values: ");
		for (int value : intervalo) {
			System.out.print("--" + value);
		}
		
	}
	
}
