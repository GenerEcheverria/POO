package Modelo;

public class Normales extends Vehiculo{
    private int horaSalida;

    public Normales(String placa, int horaEntrada, int horaSalida) {
        super(placa, horaEntrada);
        this.horaSalida = horaSalida;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public float calculoIngreso(){
        return (float) ((getHoraSalida()-getHoraEntrada())*0.2);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHora de salida: " + getHoraSalida();
    }
}
