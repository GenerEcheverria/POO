//Gener Alejandro Echeverria Chi
//ADA1 POO
//LIS
package Paquete;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horario {
    private int horaEntrada;
    private int minutoEntrada;
    private int horaSalida;
    private int minutoSalida;

    public Horario(){

    }

    public Horario(int horaEntrada, int minutoEntrada, int horaSalida, int minutoSalida) {
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
        this.horaSalida = horaSalida;
        this.minutoSalida = minutoSalida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public int getMinutoSalida() {
        return minutoSalida;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    public boolean validarHorario (int hora, int minuto){
        boolean prueba = false;
        try {
            SimpleDateFormat fecha = new SimpleDateFormat("HH:ss");
            fecha.setLenient(false);
            fecha.parse(hora + ":" + minuto);
            prueba = true;
        } catch (ParseException e){
            prueba = false;
            System.out.println("ESCRIBE UN HORARIO VALIDO!!!");
        }
        return prueba;
    }

    @Override
    public String toString() {
        SimpleDateFormat horario = new SimpleDateFormat("HH:ss");
        Date date = null;
        Date date2 = null;
        try {
            date = horario.parse(getHoraEntrada() + ":" + getMinutoEntrada());
            date2 = horario.parse( getHoraSalida() + ":" + getMinutoSalida());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formato = horario.format(date) + " a " + horario.format(date2);
        return formato;
    }
}