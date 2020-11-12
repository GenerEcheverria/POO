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
public class Conejo extends Animal{
    private int largoOrejas;

    public Conejo( String nombre, int edad, int largoOrejas) {
        super(nombre, edad);
        this.largoOrejas = largoOrejas;
    }

    public int getLargoOrejas() {
        return largoOrejas;
    }

    public void setLargoOrejas(int largoOrejas) {
        this.largoOrejas = largoOrejas;
    }
    
    //Metodo concreto
    public String mover(){
        return "Brincando...";
    }

    @Override
    public String toString() {
        return super.toString() + "," + getLargoOrejas();
    }
    
    
}
