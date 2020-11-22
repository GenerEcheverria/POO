package Modelo;

public class RadioAnalogico implements Botones{
    private String marca;

    public RadioAnalogico(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String subirVolumen() {
        return "Girar boton para subir volumen...";
    }

    @Override
    public String cambiarEstacion() {
        return "Girar boton para cambiar de estacion...";
    }

    @Override
    public String toString() {
        return "RadioAnalogico: " + "marca='" + getMarca();
    }
}
