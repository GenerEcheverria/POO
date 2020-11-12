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
public class Aguila extends Animal{
    private double alturaVuelo;

    public Aguila(String nombre, int edad, double alturaVuelo) {
        super(nombre, edad);
        this.alturaVuelo = alturaVuelo;
    }

    public double getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    //
    public String mover(){
        return "Volando...";
    }

    @Override
    public String toString() {
        return super.toString() + "," + getAlturaVuelo();
    }
    
    
    
    
    
}
