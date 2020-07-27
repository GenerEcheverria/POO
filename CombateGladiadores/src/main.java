
import java.util.Scanner;
public class main {
    public static Scanner s = new Scanner (System.in);
    public static void main(String[] args) {
        String nombre ="";
        int fuerza = 0, danoAtaque = 0, opcion = 0;
        System.out.println("--PRIMER GLADIADOR--");
        System.out.println("Ingresa el nombre");
        nombre = s.nextLine();
        do {
            System.out.println("Ingresa la fuerza de " + nombre + "(1 a 5)");
            fuerza = Integer.parseInt(s.nextLine());
        } while (fuerza <1 && fuerza >5);
        Gladiador g1 = new Gladiador();
        g1.setNombre(nombre);
        g1.setFuerza(fuerza);
        System.out.println("--SEGUNDO GLADIADOR--");
        System.out.println("Ingresa el nombre");
        nombre = s.nextLine();
        do {
            System.out.println("Ingresa la fuerza de " + nombre + "(1 a 5)");
            fuerza = Integer.parseInt(s.nextLine());
        } while (fuerza <1 && fuerza >5);
        Gladiador g2 = new Gladiador();
        g2.setNombre(nombre);
        g2.setFuerza(fuerza);
        System.out.println("**MENU DE COMBATE**");
        do {
            System.out.println("Escoge el gladiador que atacara \n 1. " + g1.getNombre() + "\n 2. " + g2.getNombre());
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion){
                case 1: 
                    danoAtaque = g1.atacar();
                    System.out.println(g1.getNombre() + " ataco a " + g2.getNombre() + " y el dano fue de " + danoAtaque);
                    g2.recibirDano(danoAtaque);
                    if (g2.getEstado().equals("Derrotado")){
                        System.out.println(g2.getNombre() + " ha sido derrotado");
                    }
                    break;
                case 2: 
                    danoAtaque = g2.atacar();
                    System.out.println(g2.getNombre() + " ataco a " + g1.getNombre() + " y el dano fue de " + danoAtaque);
                    g1.recibirDano(danoAtaque);
                    if (g1.getEstado().equals("Derrotado")){
                        System.out.println(g1.getNombre() + " ha sido derrotado");
                    }
                    break;
            }
            System.out.println("La energia de " + g1.getNombre() + " es " + g1.getEnergia());
            System.out.println("La energia de " + g2.getNombre() + " es " + g2.getEnergia());
        }while (g1.getEstado().equals("En guardia") && g2.getEstado().equals("En guardia"));
        System.out.println("--FIN DEL COMBATE--");
    }
    
}
