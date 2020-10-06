
package Paquete;

/**
 *
 * @author gener_000
 */
public class Auto {
    private String color;
    private int numeroPuertas;
    private int numeroLLantas;
    
    public void acelerarAuto (){
        System.out.println("Acelerando");
    }
    
    public String ObtenerColor(){
        return color;
    }
    
    public void establecerColor(String unColor){
       color = unColor;
    }
    
    public int ObtenerNumeroPuertas (){
        return numeroPuertas;
    }
    
    public void EstablecerNumeroPuertas(int puertas){
        numeroPuertas = puertas;
    }
    
    public String ObtenerAtributos(){
        return ObtenerColor()+""+ObtenerNumeroPuertas();
    }
    
}
