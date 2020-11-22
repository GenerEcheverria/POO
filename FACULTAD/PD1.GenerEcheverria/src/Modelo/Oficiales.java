package Modelo;

public class Oficiales extends Normales{
    public Oficiales(String placa, int horaEntrada, int horaSalida) {
        super(placa, horaEntrada, horaSalida);
    }

    public float calculoIngreso(){
        return 0;
    }

    @Override
    public String toString() {
        return "Vehiculo Oficial: \n" + super.toString() + "\nHora de salida: " + getHoraSalida();
    }
}
