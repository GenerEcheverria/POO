
package ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main (String[] args){
        Coche coche1 = new Coche();
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        System.out.println("El color del coche 1 es " + coche1.color);
        System.out.println("La marca del coche 1 es " + coche1.marca);
        System.out.println("El kilometraje del coche 1 es " + coche1.km);
    }
}
