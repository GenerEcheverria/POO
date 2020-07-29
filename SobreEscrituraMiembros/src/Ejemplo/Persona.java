
package Ejemplo;

public class Persona extends Animal{
    @Override //sobreescribiendo el metodo del padre
    public void comer (){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
