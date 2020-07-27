
package paquete1;

public class Clase1 {
    //public para usarlo en todos los paquetes
    //private para usarlo solo en la misma clase
    //por defecto oara usarlo solo en el mismo paquete
    public int atributo1; 
    private int edad;
    private String nombre;
    
    //Setter
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Getter
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
