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
public class validacion {
    
    public static void validarEdad(int edad) throws edadnegativa {
        if(edad<18)throw new edadnegativa();
    }
    
}
