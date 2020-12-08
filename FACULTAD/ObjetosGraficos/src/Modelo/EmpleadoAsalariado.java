/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juan.ucan
 */
public class EmpleadoAsalariado {
    private String nss;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private double salario;
    
    //Constructor

    public EmpleadoAsalariado(String nss, String nombre, String apellidoP, String apellidoM, double salario) {
        this.nss = nss;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.salario = salario;
    }
    
    //Métodos get
    public String getNss() {
        return nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public double getSalario() {
        return salario;
    }
    
    
    //Métodos set
    public void setNss(String nss) {
        this.nss = nss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "nss=" + getNss() + ", nombre=" + getNombre() + ", apellidoP=" + getApellidoP() + ", apellidoM=" + getApellidoM() + ", salario=" + getSalario();
    }
    
    
    
}
