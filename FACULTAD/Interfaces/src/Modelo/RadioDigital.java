package Modelo;

public class RadioDigital implements Botones{
    private String marca;

    public RadioDigital(String marca) {
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
        return "Tocar boton para subir volumen...";
    }

    @Override
    public String cambiarEstacion() {
        return "Tocar boton para cambiar estacion...";
    }

    @Override
    public String toString() {
        return "RadioDigital: " +
                "marca='" + getMarca();
    }
}
