//Gener Alejandro Echeverria Chi
//ADA1 POO
//LIS
package Paquete;

import java.text.Collator;
import java.util.Locale;

public class Departamento {
    private String clave;
    private String nombre;

    public Departamento(){

    }
    public Departamento(String clave, String nombre) {
        this.clave = clave;
        setNombre(nombre);
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        switch (getClave()){
            case "CO": this.nombre = "Compras";
                break;
            case "AL": this.nombre = "Almacén";
                break;
            case "FI": this.nombre = "Finanzas";
                break;
            case "RH": this.nombre = "Recursos Humanos";
                break;
        }
    }

    public boolean validarDepartamento(String clave, String nombre){
        Collator c = Collator.getInstance(new Locale("es"));
        c.setStrength(Collator.PRIMARY);

        switch (clave){
            case "CO": if ("Compras".equalsIgnoreCase(nombre)) {
                return true;
            } break;
            case "AL": if (c.equals("Almacén",nombre)) {
                return true;
            } break;
            case "FI": if ("Finanzas".equalsIgnoreCase(nombre)) {
                return true;
            } break;
            case "RH": if ("Recursos Humanos".equalsIgnoreCase(nombre)){
                return true;
            } break;
        }
        System.out.println("ESCRIBE UNA CLAVE Y NOMBRE VALIDOS!!!");
        return false;
    }

    @Override
    public String toString() {
        return getClave() + " " + getNombre();
    }
}
