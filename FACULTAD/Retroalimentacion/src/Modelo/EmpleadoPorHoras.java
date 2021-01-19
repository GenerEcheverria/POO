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
public class EmpleadoPorHoras extends Empleado{
    private double sueldoPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String primerNobre, String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas) {
        super(primerNobre, apellidoPaterno, numeroSeguroSocial);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double obtenerMontoPago() {
        if (getHorasTrabajadas()<=40){
            return getHorasTrabajadas()*getSueldoPorHora();
        }else {
            return 40*getSueldoPorHora()+(getHorasTrabajadas() -40)*getSueldoPorHora()*1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", sueldoPorHora: " + getSueldoPorHora() + ", horasTrabajadas=" + getHorasTrabajadas();
    }
    
    
}
