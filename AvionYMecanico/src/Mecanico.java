
import java.util.Random;


public class Mecanico {
    private String nombre;
    private int nivel;
    
    public int realizarMantencion (){
        int probabilidad = 0;
        Random rnd =new Random();
        probabilidad = rnd.nextInt(2);
        return probabilidad;
    }
    public int cargarCombustible(){
        return this.getNivel();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
