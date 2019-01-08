import java.util.Scanner;

public class String {

	@SuppressWarnings("null")
	public static void main(java.lang.String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
	     java.lang.String palabra, texto   = null ;
	
	     System.out.println("ingrese un texto para analizarlo ");
		  texto=leer.nextLine();
	      System.out.println("el tamanio de la cadena es "+texto.length());
		  
		  System.out.println("ingrese una palabra a buscar  ");
		  palabra=leer.nextLine();
	
		 System.out.println("la palabra introducida esta en el indice "+palabra.indexOf(texto));
		 
	}



}
