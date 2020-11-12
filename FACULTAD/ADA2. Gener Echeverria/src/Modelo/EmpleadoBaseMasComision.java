/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *  ADA2 POO
 *  Gener Alejandro Echeverria Chi
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private float salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, int NSS, float ventasBrutas, float tarifaComision, float salarioBase) {
        super(primerNombre, apellidoPaterno, NSS, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float ingresos(){
        return (getTarifaComision()*getVentasBrutas()) + getSalarioBase();
    }

    @Override
    public String toString() {
        return "[+ Salario base]  " + super.toString() + "\nSalario base: " + getSalarioBase();
    }
}
