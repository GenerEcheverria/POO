import java.util.Scanner;
public class Main {
    
    public static Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        int edad = 0;
        double cal = 0;
        char letra;
        String nombre="";
        System.out.println("Hola");
        //sout  + tab = println
        System.out.println("Ingresa tu edad");
        //edad = s.nextInt();
        edad = Integer.parseInt(s.nextLine());
        System.out.println("Ingresa tu calificacion");
        //cal = s.nextDouble();
        cal = Double.valueOf(s.nextLine());
        System.out.println("Escribe tu nombre");
        nombre=s.nextLine();
        System.out.println("Digite una letra");
        letra = s.next().charAt(0);//indica el espacio de la cadena
        System.out.println(nombre + " tu edad es "+edad + " y tu calificacion es "+cal);
    }
    
}
