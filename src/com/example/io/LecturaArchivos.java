package com.example.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java IO
 * Manipulacion de archivos.
 * 
 * @author alx
 */
public class LecturaArchivos {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		File file = new File("/files/docs/prueba.txt"); 
		String linea; 
		
		try {
			br = new BufferedReader(new FileReader(file));
			while ((linea = br.readLine()) != null) {
				System.out.println(linea); 			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  		
	}
	
}
