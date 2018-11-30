package com.ejercicios;
import java.util.Scanner;


public class ClaseMath {

	public static void main(String[] args) {
		
		 Scanner cap = new Scanner(System.in);
		   String selec = null;
		   System.out.println("calculadora de jared  ");
		  int a;
		  int b;
		  int  resultado;
		  double c,d;
		 
		  System.out.println("seleccione un literal de para la operacion que usted desea \n ");
		  System.out.println("a) valor absoluto \n "
		  		+" b) valor minimo \n"
		  		+ "c) valor maximo\n"
		  		+ "d) redondeo de un numero \n"
		  		+ "e) random \n"
		  		+ "f) potencia \n"
		  		+ "g) raiz cuadrada \\n");
		  selec = cap.next();
		  switch (selec) {
		  case "a":
			  System.out.println("usted a seleccionado valor absoluto \n ");
			  System.out.println("ingrese un numero \n ");
			  a=cap.nextInt();
			 resultado= Math.abs(a);
			 System.out.println("el valor absoluto de es " +resultado);
			 break;
		  
		  }
		  switch (selec) {
		  case "b":
			  System.out.println("usted a seleccionado valor minimo \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= Math.min(a,b);
			 System.out.println("el valor minimo entre "+a+" y "+b+" es " +resultado);
			 break;
		  
		  }
		  switch (selec) {
		  case "c":
			  System.out.println("usted a seleccionado valor maximo \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= Math.max(a,b);
			 System.out.println("el valor maximo entre "+a+" y "+b+" es " +resultado);
			 break;
		  
		  }
		  switch (selec) {
		  case "d":
			  System.out.println("usted a seleccionado redondeo de un numero \n ");
			  System.out.println("ingrese un numero \n ");
			  c=cap.nextDouble();
			  resultado= (int) Math.round(c);
			 System.out.println("el redondeo de "+c+" es " +resultado);
			 break;
		  
		  }
		  switch (selec) {
		  case "e":
			  System.out.println("usted a seleccionado random \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			 resultado= (int) Math.random();
			 System.out.println("el valor random es "+resultado);
			 break;
	
	    }
		  
		  switch (selec) {
		  case "f":
			  System.out.println("usted a seleccionado potencia \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= (int) Math.pow(a,b);
			 System.out.println("el numero "+a+" elevado a "+b+" es "+resultado);
			 break;
	
	    }
		  
		  switch (selec) {
		  case "g":
			  System.out.println("usted a seleccionado raiz cuadrada \n ");
			  System.out.println("ingrese un numero \n ");
			  a=cap.nextInt();
			 resultado= (int) Math.sqrt(a);
			 System.out.println("la rai cuadrada de "+a+" es "+resultado);
			 break;
	
	    }
		  
		  

    }
}
