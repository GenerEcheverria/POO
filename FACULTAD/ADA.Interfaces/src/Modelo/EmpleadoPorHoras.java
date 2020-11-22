/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *  ADA
 *  Gener Alejandro Echeverria Chi
 */
public class EmpleadoPorHoras extends Empleado{
    private float sueldo;
    private float horas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, int NSS, float sueldo, float horas) {
        super(primerNombre, apellidoPaterno, NSS);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    @Override
    public double obtenerMontoPago() {
        if (getHoras() <= 40){
            return (float) (getSueldo()*getHoras());
        } else {
            return (float) (40 * getSueldo() + (getHoras() - 40)*getSueldo()*1.5);
        }
    }

    @Override
    public String toString() {
        return "Empleado por horas: " + super.toString() + "\nSueldo por Horas: " + getSueldo() + "; Horas trabajadas: " + getHoras();
    }
}
