/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.StrictMath.*;

/**
 *
 * @author gener_000
 */
public class Romboide extends Paralelogramo{
    private float base;
    private float altura;
    private float area;

    public Romboide(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB, puntoC, puntoD);
        this.base = getDistanciaCD();
        this.altura = getDistanciaBC();
        setArea();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        float n = abs(getDistanciaAB()-getDistanciaDA());
        this.altura = (float) sqrt(pow(getDistanciaDA(),2)-pow(n,2));
    }

    public float getArea(){
        return area;
    }

    public void setArea (){
        area = getAltura()*getBase();
    }

    @Override
    public String toString() {
        return "Romboide = " + getArea() + super.toString();
    }
}
