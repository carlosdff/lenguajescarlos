/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author T107
 */
public class usuario {
    
    private String nombre;
    private int edad;
    
 public void setNombre(String nombre){
    
    this.nombre=nombre;
}
    public String getNombre(){
    return nombre;
}
    public void setEdad(int edad)throws edadnegativa{
        
       validacion.validarEdad(edad);
        
       // if(edad<18) edad=-edad;
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

}
