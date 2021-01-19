/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ryzen5
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNobre, String apellidoPaterno, String numeroSeguroSocial, double ventaBrutas, double tarifaComison,double salarioBase) {
        super(primerNobre, apellidoPaterno, numeroSeguroSocial, ventaBrutas, tarifaComison);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double obtenerMontoPago() {
        return super.obtenerMontoPago()+ getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + ", salarioBase: " + getSalarioBase();
    }
    
    
}
