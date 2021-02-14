/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

/**
 *
 * @author jared
 */
public abstract class materiales {

    protected String Codigo;
    protected String Interna;
    protected String Titulo;

    public abstract void Agregar();

    public abstract void Modificar();

    public abstract void Ver();

    public abstract void Borrar();

    public abstract void Buscar();
    
    public abstract void Salir();
    

}
