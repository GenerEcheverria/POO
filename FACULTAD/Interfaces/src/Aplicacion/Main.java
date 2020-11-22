//Gener Alejandro Echeverria Chi
package Aplicacion;
import Modelo.*;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Botones> listaImplementaciones = new ArrayList<Botones>();

        listaImplementaciones.add(new RadioDigital("Sony"));
        listaImplementaciones.add(new RadioAnalogico("Philips"));
        listaImplementaciones.add(new RadioDigital("Samsung"));

        for(int i=0;i<listaImplementaciones.size();i++){
            System.out.println(listaImplementaciones.get(i) + ", "+listaImplementaciones.get(i).subirVolumen() + ", "+listaImplementaciones.get(i).cambiarEstacion());
        }
    }
}
