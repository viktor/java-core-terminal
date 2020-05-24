/**
 *
 * @author Mathews Jared
 */
import java.util.Scanner;

public class Salario_Venta_Carros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se declara una variable para capturar los datos 
		Scanner lectura = new Scanner (System.in);
		
		// varaibles tipo flotantes
		float mensual = 1000f, comision = 150f, porcenaje = 0f, carro = 0f, calculo = 0f;
		
		// dialogo con el usuario
		System.out.println(" ¿Cuantos carros vendio en el mes ?");
		carro = lectura.nextFloat(); // captur LOS DATOS
				
		// calcula el salario
		calculo = ((comision * carro ) *0.5f) + mensual;
		
		// presenta el salario total en pantalla 
		System.out.println("El Salario del vendedor es: "+calculo);
		
		

	}

}
