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
public class EmpleadoPorComision extends Empleado{
    private float ventasBrutas;
    private float tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, int NSS, float ventasBrutas, float tarifaComision) {
        super(primerNombre, apellidoPaterno, NSS);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public float getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(float ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public float getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(float tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double obtenerMontoPago() {
        return getTarifaComision()*getVentasBrutas();
    }

    @Override
    public String toString() {
        return "Empleado por comision: " + super.toString() + "\nVentas brutas: " + getVentasBrutas() + "\nTarifa por comision: " + getTarifaComision();
    }
}
