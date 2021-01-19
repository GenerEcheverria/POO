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
public class Factura implements PorPagar , Serializable{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int camtidad, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = camtidad;
        this.precioArticulo = precioArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int camtidad) {
        this.cantidad = camtidad;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    @Override
    public double obtenerMontoPago() {
        return getCantidad()*getPrecioArticulo();
    }

    @Override
    public String toString() {
        return  "NumeroPieza:" + getNumeroPieza() + ", descripcionPieza: " + getDescripcionPieza() + ", cantidad: " + getCantidad() + ", precioArticulo: " + getPrecioArticulo();
    }
    
    
    
}
