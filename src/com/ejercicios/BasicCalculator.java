package com.ejercicios;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		   @SuppressWarnings("resource")
		Scanner cap = new Scanner(System.in);
		   String selec = null;
		   System.out.println("calculadora de jared ");
		  int  a = 0;
		  int b = 0;
		  int c= 0;
		  int x1 = 0;
		  int x2 = 0;
		  int resultado = 0;
		
		  System.out.println("seleccione un literal de para la operacion que usted desea \n ");
		  System.out.println("a) suma \n "
		  		+" b) resta \n"
		  		+ "c) multiplicacion\n"
		  		+ "d) divicion \n"
		  		+ "e) promedio \n"
		  		+ "f) funcion cuadrattica \n"
		  		+ "g) factorial de un numero \n");
		  selec = cap.next();
		  switch (selec) {
		  case "a":
			  System.out.println("usted a seleccionado suma \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= (a+b);
			 System.out.println(a+"+"+b+"="+resultado);
			 break;
		  
		  
		  case "b":
			  System.out.println("usted a seleccionado resta \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= (a-b);
			 System.out.println(a+"-"+b+"="+resultado);
			 break;
		  
		
		  case "c":
			  System.out.println("usted a seleccionado multiplicacion\n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= (a*b);
			 System.out.println(a+"*"+b+"="+resultado);
			 break;
		  
		 
		  case "d":
			  System.out.println("usted a seleccionado divicion \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= (a/b);
			 System.out.println(a+"/"+b+"="+resultado);
			 break;
		  
		 
		  case "e":
			  System.out.println("usted a seleccionado promedio \n ");
			  System.out.println("ingrese el primer numero \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el segundo numero \n ");
			  b=cap.nextInt();
			 resultado= ((a+b)/2);
			 System.out.println(a+"+"+b+"/2 ="+resultado);
			 break;
		  
		  
		  case "f":
			  System.out.println("usted a seleccionado funcion cuadratica \n ");
			  System.out.println("ingrese el primer valor  \n ");
			  a=cap.nextInt();
			  System.out.println("ingrese el primer valor  \n ");
			  b=cap.nextInt();
			  System.out.println("ingrese el primer valor  \n ");
			  c=cap.nextInt();
			 x1=(int) (((-b)+ Math.sqrt((b*b)-(4*(a*c))))/(2*a));
			 x2=(int) (((-b)- Math.sqrt((b*b)-(4*(a*c))))/(2*a));

			 System.out.println("la funcion cuadratica de x1   es "+x1);
			 System.out.println("la funcion cuadratica de x2   es "+x2);
			 break;
			 
		  case "g":
			
			  System.out.println("usted a seleccionado factorial de un numero \n ");
			  System.out.println("ingrese el primer valor  \n ");
			 a=cap.nextInt();
			 System.out.println("el numero factorial de " +a+ " es " +factorial(a));
				
		  
		  }
	

	
	}
	public static  double factorial  (int n) {
		
		double aux=1;
		for (int i=1; i<= n; i++) {
			
			aux*=i;
			
		}
		return aux;
	}
	}

	
	
