/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * ADA2 POO
 * Gener Alejandro Echeverria Chi
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private int NSS;

    public Empleado(String primerNombre, String apellidoPaterno, int NSS) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.NSS = NSS;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public abstract float ingresos ();

    @Override
    public String toString() {
        return  getPrimerNombre() + " " + getApellidoPaterno() + "\nNumero de seguro social: " + getNSS();
    }
}
