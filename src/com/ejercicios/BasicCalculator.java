package com.ejercicios;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		   Scanner cap = new Scanner(System.in);
		   String selec = null;
		   System.out.println("calculadora de jared ");
		  int a;
		  int b;
		  int c;
		  int x1;
		  int x2;
		  int resultado;
		
		  System.out.println("seleccione un literal de para la operacion que usted desea \n ");
		  System.out.println("a) suma \n "
		  		+" b) resta \n"
		  		+ "c) multiplicacion\n"
		  		+ "d) divicion \n"
		  		+ "e) promedio \n"
		  		+ "f) funcion cuadrattica \n");
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
		  default:System.out.println("la opcion que usted eligio no esta en la el menu de opciones");
		  
		  }
		   
		   
		   
		  
		   
		  }
	
	
}