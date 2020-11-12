/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author gener_000
 */
public class Serpiente extends Animal{

    public Serpiente(String nombre, int edad) {
        super(nombre, edad);
    }
    
   public String mover(){
       return "Arrastrando...";
   } 
   
    
}
