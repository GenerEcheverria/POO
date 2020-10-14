
package Paquete;

/**
 *
 * @author gener_000
 */
public class CreacionDeAutos {

    public static void main(String[] args) {
       Auto tracker =  new Auto();
       tracker.acelerarAuto();
       tracker.establecerColor("Azul");
       tracker.EstablecerNumeroPuertas(4);
        System.out.println(tracker.ObtenerColor()); 
        System.out.println(tracker.ObtenerNumeroPuertas());
        System.out.println(tracker.ObtenerAtributos());
       
    }
    
}
