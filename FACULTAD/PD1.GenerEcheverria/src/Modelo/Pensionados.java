package Modelo;

public class Pensionados extends Normales{
    private int minutosAcumulados;

    public Pensionados(String placa, int horaEntrada, int horaSalida, int minutosAcumulados) {
        super(placa, horaEntrada, horaSalida);
        this.minutosAcumulados = minutosAcumulados;
    }

    public int getMinutosAcumulados() {
        return minutosAcumulados;
    }

    public void setMinutosAcumulados(int minutosAcumulados) {
        this.minutosAcumulados = minutosAcumulados;
    }

    public float calculoIngreso(){
        return (float) (getMinutosAcumulados()*0.02);
    }

    @Override
    public String toString() {
        return "Vehiculo pensionado: \n"+super.toString() +  "\nMinutos acumulados: " + getMinutosAcumulados();
    }
}
