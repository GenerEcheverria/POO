/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author gener_000
 */

public class EmpleadoBaseMasComisionH extends EmpleadoPorComision{
    private double sueldoBase;  

    public EmpleadoBaseMasComisionH( String primerNombre, String apellidoPaterno, String seguroSocial, double ventasBrutas, double tarifaComision, double sueldoBase) {
        super(primerNombre, apellidoPaterno, seguroSocial, ventasBrutas, tarifaComision);
        this.sueldoBase = sueldoBase;
    } 


    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double sueldo(){
        return getSueldoBase()+super.sueldo();
    }

    @Override
    public String toString() {
        return super.toString()+", " + getSueldoBase() + '}';
    }
    
    

    

    
    
    
    
}
