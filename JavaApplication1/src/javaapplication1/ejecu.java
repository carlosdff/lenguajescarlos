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
public class ejecu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws edadnegativa{
       usuario us1=new usuario();
       
       
       us1.setNombre ("carlos");
       System.out.println("esto siempre debe salir");
       us1.setEdad  (18);
       
       System.out.println("esto si la edades menor de 18 no tendia que salirse nunca");
        
  
    }
    
}
