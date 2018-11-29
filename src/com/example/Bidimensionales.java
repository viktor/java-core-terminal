package com.example;

import java.util.Scanner;

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
		
		char area[][] = new char[a][b];
		int i = 0, j = 0;
		int limitI = a, limitJ = b;
		
		System.out.println("Creando la figura.. :) \n");
		
		/*
		 * Creando plano cartesiano
		 */		
		for(i=0;i<limitI;i++) {
			for(j=0;j<limitJ;j++) {
				area[i][j]= '*';
			}
		}
		
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
	
}
