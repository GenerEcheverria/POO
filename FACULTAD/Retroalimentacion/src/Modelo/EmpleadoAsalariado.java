/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Ryzen5
 */
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado( String primerNobre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNobre, apellidoPaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return  getSalarioSemanal();
    }

    @Override
    public String toString() {
        return super.toString()+" SalarioSemanal: " + getSalarioSemanal();
    }
    
    
}
