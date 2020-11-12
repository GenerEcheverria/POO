
package Modelo;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Cuadrilatero {
    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;
    private Punto puntoD;
    private float distanciaAB;
    private float distanciaBC;
    private float distanciaCD;
    private float distanciaDA;
    
    public Cuadrilatero(){
        
    }

    public Cuadrilatero(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
        this.puntoD = puntoD;
        setDistanciaAB(puntoA,puntoB);
        setDistanciaBC(puntoB,puntoC);
        setDistanciaCD(puntoC,puntoD);
        setDistanciaDA(puntoD,puntoA);
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public Punto getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(Punto puntoC) {
        this.puntoC = puntoC;
    }

    public Punto getPuntoD() {
        return puntoD;
    }

    public void setPuntoD(Punto puntoD) {
        this.puntoD = puntoD;
    }

    public float getDistanciaAB() {
        return distanciaAB;
    }

    public void setDistanciaAB(Punto puntoA, Punto puntoB) {
        this.distanciaAB = (float) sqrt(pow(puntoB.getX()-puntoA.getX(),2) + pow(puntoB.getY()- puntoA.getY(),2));
    }

    public float getDistanciaBC() {
        return distanciaBC;
    }

    public void setDistanciaBC(Punto puntoB, Punto puntoC) {
        this.distanciaBC = (float) sqrt(pow(puntoC.getX()-puntoB.getX(),2) + pow(puntoC.getY()- puntoB.getY(),2));
    }

    public float getDistanciaCD() {
        return distanciaCD;
    }

    public void setDistanciaCD(Punto puntoC, Punto puntoD) {
        this.distanciaCD = (float) sqrt(pow(puntoD.getX()-puntoC.getX(),2) + pow(puntoD.getY()- puntoC.getY(),2));
    }

    public float getDistanciaDA() {
        return distanciaDA;
    }

    public void setDistanciaDA(Punto puntoD, Punto puntoA) {
        this.distanciaDA = (float) sqrt(pow(puntoA.getX()-puntoD.getX(),2) + pow(puntoA.getY()- puntoD.getY(),2));
    }

    public boolean validarPuntos(){
        int contadorX=0;
        int contadorY=0;
        Punto puntos[] = {puntoA,puntoB,puntoC,puntoD};
        for (int i=0; i<=3;i++){
            for (int j=3;j>i;j--){
                if (puntos[i].getX()==puntos[j].getX()){
                    contadorX++;
                }
                if (puntos[i].getY()==puntos[j].getY()) {
                    contadorY++;
                }
            }
        }
        if (contadorX>=3||contadorY>=3){
            System.out.println("Escribe puntos de un cuadrilatero!!!");
            return false;
        } else {
            return true;
        }
    }

    public int clasificar (){
        int contador=0;
        float pendienteAB = (this.puntoB.getY()-this.puntoA.getY())/(this.puntoB.getX()-this.puntoA.getX());
        float pendienteBC = (this.puntoC.getY()-this.puntoB.getY())/(this.puntoC.getX()-this.puntoB.getX());//En cuadrado es infinito
        float pendienteCD = (this.puntoD.getY()-this.puntoC.getY())/(this.puntoD.getX()-this.puntoC.getX());
        float pendienteDA = (this.puntoA.getY()-this.puntoD.getY())/(this.puntoA.getX()-this.puntoD.getX());//En cuadrado es infinito
        if (pendienteAB==pendienteCD){
            contador++;
        }
        if (pendienteBC==pendienteDA){
            contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "  Puntos: A = " + getPuntoA() +
                ", B = " + getPuntoB() +
                ", C = " + getPuntoC() +
                ", D = " + getPuntoD();
    }
}
