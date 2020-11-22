/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * ADA2 Interfaces
 * Gener Alejandro Echeverria Chi
 */
public class EmpleadoAsalariado extends Empleado{
    private float salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, int NSS, float salarioSemanal) {
        super(primerNombre, apellidoPaterno, NSS);
        this.salarioSemanal = salarioSemanal;
    }

    public float getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(float salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "Empleado asalariado:" + super.toString() + "\nSalario semanal: " + getSalarioSemanal();
    }
}
