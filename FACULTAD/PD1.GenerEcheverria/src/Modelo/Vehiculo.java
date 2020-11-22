package Modelo;

public abstract class Vehiculo {
    private String placa;
    private int horaEntrada;

    public Vehiculo(String placa, int horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public abstract float calculoIngreso();

    @Override
    public String toString() {
        return "Placa: " + getPlaca() + "\nHora entrada: " + getHoraEntrada();
    }
}
