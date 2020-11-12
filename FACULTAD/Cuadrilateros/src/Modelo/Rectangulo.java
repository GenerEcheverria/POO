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
public class Rectangulo extends Paralelogramo{
    private float base;
    private float altura;
    private float area;

    public Rectangulo(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB, puntoC, puntoD);
        this.base = getDistanciaCD();
        this.altura = getDistanciaBC();
        setArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase() {
        base = getDistanciaCD();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura() {
        altura = getDistanciaBC();
    }

    public float getArea(){
        return area;
    }

    public void setArea(){
         area = (float) (getBase()*getAltura());
    }

    @Override
    public String toString() {
        return "Rectangulo = " + getArea() + super.toString();
    }
}
