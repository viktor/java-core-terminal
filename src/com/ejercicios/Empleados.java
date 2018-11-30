package com.ejercicios;

import java.util.Scanner;

public class Empleados {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		 int a = 0;
		 String ca=null;
		System.out.println(" dijite 5 empleados ");
		a =leer.nextInt();
		 String arreglo[]=new String[a];
		 
		for (int i=0; i<arreglo.length; i++) {
			System.out.println("escriba los 5 nombres de los empleados");
			ca=leer.nextLine();
			arreglo[i]=ca;
			
			
		}
		for(String nombre : arreglo ) {
		System.out.println("los numeros de empleado son " +a+ " y los nombre son "+nombre);
		}
   
			                                  
        
		
	                                        }
		
	               }
