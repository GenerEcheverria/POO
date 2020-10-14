
 
package pack;

public class DiaAnio {
    private int dia;
    private int mes;
    private int anio;

    public DiaAnio(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public boolean igual(int dia, int mes){
        return this.dia==dia && this.mes==mes;        
    }
    
    public void visualizar(boolean result){
        if (result){
            System.out.println("HOY ES TU CUMPLEAÑOS!!! :)");
        } else {
            System.out.println("NO ES TU CUMPLEAÑOS. uwu");
        }
    }
}
