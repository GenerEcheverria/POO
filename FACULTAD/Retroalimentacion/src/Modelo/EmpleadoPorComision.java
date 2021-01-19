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
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision( String primerNobre, String apellidoPaterno, String numeroSeguroSocial,double ventaBrutas, double tarifaComison) {
        super(primerNobre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventaBrutas;
        this.tarifaComision = tarifaComison;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventaBrutas) {
        this.ventasBrutas = ventaBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComison) {
        this.tarifaComision = tarifaComison;
    }

    @Override
    public double obtenerMontoPago() {
        return getTarifaComision()*getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + ", ventasBrutas=" + getVentasBrutas() + ", tarifaComision: " + getTarifaComision() ;
    }
    
    
}
