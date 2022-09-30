/**
 *
 * @author Mathews Jared
 */
import java.util.Scanner;

public class Calculo_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calculo de salario de guillermo, la mitad tiene luis y juntando lo de luis y guillermo la mitad tiene juan 
		
		
		// Se declara una variable para capturar los datos 
		Scanner lectura = new Scanner (System.in);
		
		// varibales tipo entero 
		int guillermo = 0, luis = 0, juan = 0, calculo=0;
		
		// dialogo con el usuario
		System.out.println("Ingresa el Salario de guillermo");
		guillermo = lectura.nextInt(); // captura datos
		
		// se calcula los salarios
		luis = (guillermo / 2);
		juan = (luis + guillermo) / 2;
		calculo = guillermo + luis + juan;
		
		// se presentan los dotos en pantalla
		System.out.println("El dinero de guillermo es :" +guillermo);
		System.out.println("El dinero de luis es : "+luis );
		System.out.println("El dineor de juan es : "+juan);
		System.out.println("El dinero total de los 3 es :"+calculo);
		
		
		

	}

}
