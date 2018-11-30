package com.example;

import java.util.Scanner;

/*
 * Procesamiento de cadenas de texto (String).
 * Objecto char es un caracter individual, un String 
 * es un conjunto de caracteres alfanumericos.
 * 
 */
public class ProcesamientoString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escriba un string de una linea:");
		String cadenaTexto = scanner.nextLine();

		System.out.println("Analisis de cadena de texto \n "
				+ "Lenght (tamano): "+ cadenaTexto.length());
		
		cadenaTexto = cadenaTexto.concat(" Concatenado ** ");
		
		System.out.println("Concatenado existe en este indice: "+cadenaTexto.indexOf("Concatenado"));
		System.out.println("Caracter existente en la posicion 4 "+cadenaTexto.charAt(4));
		
		cadenaTexto = cadenaTexto.replace("Concatenado", "Reemplazado");
		
		System.out.println("Este es el valor reemplazado "+cadenaTexto);
		System.out.println("Existe Concatenado? "+ cadenaTexto.indexOf("Concatenado"));
		
		System.out.println("Escriba un valor a comparar: ");
		String valorAcomparar = scanner.nextLine();
		System.out.println("Comparando.. Es igual ? "+ cadenaTexto.equals(valorAcomparar));
		
		System.out.println("Escriba nombre y apellido con ',' : ");
		String nombreCompleto = scanner.nextLine();
		
		System.out.println("Ejemplo de uso de split");
		String nombres[] = nombreCompleto.split(",");
		
		System.out.println("AAAH tu nombre es: "+ nombres[0]);
		System.out.println("Tu apellido es: "+nombres[1]);
		System.out.println("Uso de trim() para eliminar espacios "+ nombreCompleto.trim() );
		
		String subCadena = valorAcomparar.substring(2, 10);
		System.out.println("Substring : "+ subCadena);
	}
	
	/*
	 * Haga un analizar de texto, pegue el contenido de un sitio parrafo en una sola linea de la 
	 * terminal, el analizador de text tiene que pedir una palabra y buscarla en todo
	 * el texto dado al principio. 
	 * 
	 * Haga un conteo de palabras, en case a la busqueda, use indexOf, corte el string o 
	 * realize de String para analizar el texto dado.
	 * 
	 * Ejemplo:
	 * 
	 * > Escriba un texto en sola linea para analizar:
	 * > Este es un texto de ejemplo, bla bla, Nose cuantas veces vas a encontrar bla bla dentro de este texto bla bla, espero q lo encuentres bla bla
	 * > Ingrese palabra a buscar:
	 * > bla
	 * 
	 * > el conteo final es: xvalor
	 * 
	 * 
	 */

}
