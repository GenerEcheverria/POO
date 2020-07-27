
package ClasesYObjetos;

public class Main {
    public static void main (String[] args){
        /*Operacion op = new Operacion();
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicar();
        op.dividir();
        op.mostrar();*/
        
        
        Persona p1 = new Persona ("Gener",23);
        p1.mostrar();
        p1.correr();
        
        Persona p2 = new Persona("12345123");
        p2.correr(100);
    }
}
