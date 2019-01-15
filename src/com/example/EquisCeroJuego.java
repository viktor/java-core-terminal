package com.example;

import java.util.Scanner;

public class EquisCeroJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char xAnd0 [][] = new char[3][3];
		
		xAnd0[0][0] = '?'; 
		xAnd0[0][1] = '?';
		xAnd0[0][2] = '?';

		xAnd0[1][0] = '?'; 
		xAnd0[1][1] = '?'; 
		xAnd0[1][2] = '?'; 
		
		xAnd0[2][0] = '?'; 
		xAnd0[2][1] = '?'; 
		xAnd0[2][2] = '?'; 
		
		System.out.println("JUEGOS FACILES USANDO PROGRAMACION :) \n\n"
				+ "2 | "+xAnd0[2][0]+"  "+xAnd0[2][1]+"  "+xAnd0[2][2]+" |\n"
				+ "1 | "+xAnd0[1][0]+"  "+xAnd0[1][1]+"  "+xAnd0[1][2]+" |\n"
				+ "0 | "+xAnd0[0][0]+"  "+xAnd0[0][1]+"  "+xAnd0[0][2]+" |\n"
				+ "    0  1  2");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Escriba el valor X/0 (h para ayuda) en la coordenada de la matriz (x,y): ");
			String input = scanner.nextLine();
			
			if(input.trim().equals("h")) {
				System.out.println("Usted selecciono la ayuda \n "
						+ "La sintaxis esperada es : \n"
						+ "X 0,0 - para la primer coordenada escribir X \n\n");
			}else {
				String[] vals = input.split(" ");
				String value = vals[0].trim();
				String coord = vals[1];
				String xAndY[] = coord.split(",");
				
				System.out.println("\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b"+"\b\b\b\b\b\b\b\b\b\b\b");
				
				xAnd0[Integer.parseInt(xAndY[0])][Integer.parseInt(xAndY[1])] = (value.trim().toCharArray()[0]);
				System.out.println("JUEGOS FACILES USANDO PROGRAMACION :) \n\n"
						+ "2 | "+xAnd0[2][0]+"  "+xAnd0[2][1]+"  "+xAnd0[2][2]+" |\n"
						+ "1 | "+xAnd0[1][0]+"  "+xAnd0[1][1]+"  "+xAnd0[1][2]+" |\n"
						+ "0 | "+xAnd0[0][0]+"  "+xAnd0[0][1]+"  "+xAnd0[0][2]+" |\n"
						+ "    0  1  2");				
			}
		}
		
	}

}
