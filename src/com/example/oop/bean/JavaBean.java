package com.example.oop.bean;

/**
 * JavaBeans
 * 
 * El concepto de javabean vease aqui ->  https://es.wikipedia.org/wiki/JavaBean
 * es un estandar de transporte de datos y de logica de negocios (Enterprise JavaBean).
 * 
 * El Enterprise JavaBean es un concepto mas avanzado, el cual almacena logica de negocio
 * que puede ser llamada por red usando protocolos como CORBA o HTTP, puede ser asincrono 
 * o puede procesar datos por transaccion, puede tener estado,etc.
 * 
 * El javabean simple puede transportar datos, respeta estandares de encapsulacion el cual
 * consiste en respetar el acceso a variables (miembros de clase) los cuales deben ser 
 * accedidos por los metodos set/get de la clase.
 * 
 * Este es un ejemplo de un JavaBean simple.
 * 
 * 
 * @author alx
 *
 */
public class JavaBean {
	//clase Java Bean, una clase es una definicion de un objeto cosa 
	
	// propiedad/campo es una variable que pertenece a la clase, 
	// las propiedades describen los objetos
	private String message;
	
	/**
	 * Metodo get, es para pedir el dato en este caso mensaje
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Metodo set, es para agregar o insertar datos a la variable mensaje
	 * 
	 * La variable mensaje solamente es accedida por set/get eso significa que 
	 * esta ENCAPSULADA y respeta estandares de ACCESO
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
