package com.example;

import java.util.Scanner;

/**
 * Arreglos bidimensionales. "Matrices"
 * 
 *   Una matriz es un objeto matematico visualmente asi:
 *   
 *   | 3   9 |
 *   |		 |
 *   | 1   5 |
 *   
 *   En este caso esta matriz es de 2x2 (2 dimensiones). 
 *   El concepto de arreglos era lineal como los intervalos Ej { 1, 2 },
 *   en este caso son bidimensonales porque son 2 dimensiones y puede 
 *   interpretarse como un objeto visual, visuale las matrices asi como el 
 *   ejemplo anterior, esto le ayudara a comprender como se comportan.
 *   
 *   Esto lleva a la siguiente pregunta, el arreglo de 1 dimension es tambien 
 *   una matriz? (vea al final la respuesta :) ).
 *   
 * @author alx
 *
 */
public class Bidimensionales {

	public static void main(String[] args) {
		System.out.println("FIGURAS BIDIMENSIONALES Y ARREGLOS \n "
				+ "CREADOR DE CUADRADOS/RECTANGULOS \n "
				+ "ESCRIBA EL AREA DE LA FIGURA (A * B) \n");
	   
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escriba valor de A:");
		int a = scanner.nextInt();
		System.out.println("Escriba valor de B:");
		int b = scanner.nextInt();
		
		/*
		 * He aqui un nuevo concepto!, un char es un elemento, un caracter
		 * alfanumerico comprendido entre a-z o cualquier x elemento puede ser signo $#!@#, etc.
		 * 
		 * En este caso tenemos una matriz de a por b, donde a y b son numeros naturales. Si el valor
		 * es te 2 x 2 la matriz se veria asi cuando se crea:
		 * 
		 *  | ''    '' |
		 *  |          |
		 *  | ''    '' |
		 *  
		 *  Por que cuando se crea todos valen '' o valen null, para ponerle valores
		 *  necesitamos 2 instrucciones 'for' Asi nos metemos en la cordenada de 'a' y la de 'b'
		 *  
		 *  lo que queremos lograr es entrar a todas las coordenadas [a][b] asi metemos el valor
		 *  a la matriz/arreglo.
		 * 
		 */
		char area[][] = new char[a][b];
		int i = 0, j = 0;
		int limitI = a, limitJ = b;
		
		System.out.println("Creando la figura.. :) \n");
		
		/*
		 * Creando figura
		 */		
		for(i=0;i<limitI;i++) {
			for(j=0;j<limitJ;j++) {
				area[i][j]= '*';
			}
		}
		
		/*
		 * Despues del for ya hemos creado valores * en los elementos de la matriz
		 */
		
		System.out.println("Sea un rectangulo, cuadrado, con a x b dimensiones,\n "
				+ "este es su resultado:\n");
		for(i=0;i<limitI;i++) {
			for(j=0;j<limitJ;j++) {
				System.out.print(area[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println(""
				+ "Elabore mas figuras bidimensionales dentro de este algoritmo \n"
				+ "incluya triangulos rectangulos de la siguiente forma (pidiendo altura y base): \n");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		
	}
	
	/*
	 * Casi lo olvidaba, una matriz de como | 0    2 | tambien es un arreglo-matriz 
	 * es llamada matriz fila o matriz columna, no olvides revisar el concepto 
	 * en algun sitio de matematicas :)
	 */
}
