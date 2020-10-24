//Gener Alejandro Echeverria Chi
//ADA1 POO
//LIS
package Paquete;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha (){

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean validarFecha (int dia, int mes, int anio){
        boolean prueba = false;
        try {
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            fecha.setLenient(false);
            fecha.parse(dia+"/" + mes + "/" + anio);
            prueba = true;
        } catch (ParseException e){
            prueba = false;
            System.out.println("ESCRIBE UNA FECHA VALIDA!!!");
        }
        return prueba;
    }

    @Override
    public String toString() {
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = fecha.parse(getDia()+"/" + getMes()+ "/" + getAnio());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formato = fecha.format(date);
        return formato;
    }
}
