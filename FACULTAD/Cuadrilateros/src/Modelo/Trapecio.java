/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

/**
 *
 * @author gener_000
 */
public class Trapecio extends Cuadrilatero{
    private float baseMayor;
    private float baseMenor;
    private float altura;
    private float area;

    public Trapecio(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB, puntoC, puntoD);
        setBases();
        setAltura();
        setArea();
    }

    public float getBaseMayor() {
        return baseMayor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBases() {
        if (bases()){
            if (getDistanciaAB()>getDistanciaCD()){
                this.baseMayor = getDistanciaAB();
                this.baseMenor = getDistanciaCD();
            } else {
                this.baseMayor = getDistanciaCD();
                this.baseMenor = getDistanciaAB();
            }
        } else {
            if (getDistanciaBC()>getDistanciaDA()){
                this.baseMayor = getDistanciaBC();
                this.baseMenor = getDistanciaDA();
            } else {
                this.baseMayor = getDistanciaDA();
                this.baseMenor = getDistanciaBC();
            }
        }
    }

    public boolean bases () {
        float pendienteAB = (getPuntoB().getY()-getPuntoA().getY())/(getPuntoB().getX()-getPuntoA().getX());
        float pendienteCD = (getPuntoD().getY()-getPuntoC().getY())/(getPuntoD().getX()-getPuntoC().getX());
        if (pendienteAB==pendienteCD){
            return true;
        }else {
            return false;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura() {
        float n = getDistanciaAB()-getDistanciaDA();
        this.altura = (float) sqrt(pow(getDistanciaDA(),2)-pow(n,2));
    }

    public float getArea(){
        return area;
    }

    public void setArea(){
        this.area = ((getBaseMayor()+getBaseMenor())*getAltura())/2;
    }

    @Override
    public String toString() {
        return "Trapecio = " + getArea() + super.toString();
    }
}
