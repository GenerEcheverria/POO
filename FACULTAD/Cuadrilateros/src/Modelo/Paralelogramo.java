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
public class Paralelogramo extends Cuadrilatero{
    private float diagonalAC;
    private float diagonalDB;

    public Paralelogramo(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB, puntoC, puntoD);
        this.diagonalAC = diagonalAC;
        this.diagonalDB = diagonalDB;
    }

    public float getDiagonalAC() {
        return diagonalAC;
    }

    public void setDiagonalAC(float diagonalAC) {
        this.diagonalAC = diagonalAC;
    }

    public float getDiagonalDB() {
        return diagonalDB;
    }

    public void setDiagonalDB(float diagonalDB) {
        this.diagonalDB = diagonalDB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
