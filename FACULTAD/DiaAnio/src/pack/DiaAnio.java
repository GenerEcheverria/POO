
 
package pack;

public class DiaAnio {
    private int dia;
    private int mes;
    

    public DiaAnio(int dia, int mes) {
        setDia(dia);
        setMes(mes);
        this.mes = mes;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0&&dia<32){
            this.dia = dia;
        } else {
            this.dia = 1;
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0&&mes<13){
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    
    public boolean igual(DiaAnio fecha){
        return this.dia==fecha.getDia() && this.mes==fecha.getMes();        
    }
    
    public void visualizar(boolean result){
        if (result){
            System.out.println("HOY ES TU CUMPLEAÑOS!!! :)");
        } else {
            System.out.println("NO ES TU CUMPLEAÑOS. uwu");
        }
    }
}
