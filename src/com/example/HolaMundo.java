/**
 * BIENVENIDO A ESTA GUIA DE JAVA CORE
 * CON EJEMPLOS BASICOS PARA COMPRENDER 
 * COMO FUNCIONA ESTE LENGUAJE DE 
 * PROGRAMACION.
 * 
 * @author alejandro
 * @version 1.0 (:
 * */

/* Este es un comentario con '*' es usado 
 * para comentar en parrafos */

//este es un comentario de una linea  muy facil de usar

//package - esta expression muestra una referencia a paquete
// un paquete java es un conjunto de carpetas, la referencia esta hecha en '.' 
// donde cada punto indica que esta adentro de otro folder 
// el package name en este caso es 'com.example'
package com.example;

/*
 * Estandar de nombrado de paquetes:
 * Como estandar los paquetes son nombrados como el domain de la compania por ejemplo:
 * com.mycompania
 * 
 * los subpaquetes de este paquete son funcionalidades de la compania, por ejemplo:
 * 
 * com.mycompania.operaciones
 * En este paquete de operaciones por ejemplo irian clases especiales para operaciones.
 * Asi mismo puede tener paquetes para nombrar cosas o valores, tambien para servicios, etc.
 * */


/**
 * Este es el Holamundo :)
 * @author alx
 * 
 * class es usado para definir una clase, en lenguajes de programacion 
 * una clase es usada para definir un objeto o cosa, definir cualquier 
 * tipo de elementos para luego ser procesados.
 * 
 */
public class HolaMundo {
	
	/**
	 * La manera mas facil de ejecutar un codigo simple en terminal con java es 
	 * usando public static void main(String[] args) esto ejecutara la clase dentro 
	 * de cualquier IDE (development environment). 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//En este caso tomamos la terminal del sistema e imprimimos "HOLA MUNDO" 
		System.out.println("HOLA MUNDO!");
	}
	
	/**
	 * Breve explicacion de palabras clave en el lenguaje.
	 * 
	 * public: en este caso indica acceso, es un modificador de acceso de cualquier cosa (variable, clase, metodo etc).
	 * Basicamente dice que el acceso al recurso es publico (puede ser accedido donde sea y como sea).
	 * 
	 * static: static dice que el recurso no necesita ser instanciado (lo explicare despues) y es accesible.
	 * 
	 * void: indica que el metodo no devuelve valor (no debe responder nada).
	 * 
	 * main() -> todas los metodos accecidos mas facilmente son llamados "main"
	 * 
	 * args son los argumentos para instanciar/llamar el metodo
	 * 
	 * Ejecute la clase usando Run As -> Run as Java Application.
	 */
	
	/*
	 * CONVENCIONES DE NOMBRADO:
	 * Entiendase como convenciones de nombramiento como todas las reglas
	 * para definir elementos como variables, metodos y clases, las convenciones
	 * son:
	 * 
	 *  -> Usar nombres lo mas claro posibles
	 *  -> Usar nombres que cada palabra empiece con mayusculas
	 *  
	 *  Ejemplos:
	 *  
	 *  class EstaEsUnaClase{
	 *     
	 *     String estaEsUnaVariable;
	 *     
	 *     void metodoQueNoRetornaValor(){
	 *     		// instrucciones
	 *     }
	 *     
	 *  }
	 * */
	
}
