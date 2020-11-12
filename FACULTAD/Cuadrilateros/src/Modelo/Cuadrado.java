/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.StrictMath.pow;

/**
 *
 * @author gener_000
 */
public class Cuadrado extends Paralelogramo{
    private float lado;
    private float area;

    public Cuadrado(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB, puntoC, puntoD);
        this.lado = getDistanciaAB();
        setArea();
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea(){
        return area;
    }

    public void setArea(){ area = (float) pow(getLado(),2);
    }

    @Override
    public String toString() {
        return "Cuadrado = " + getArea() + super.toString();
    }
}
