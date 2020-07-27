
import java.util.Scanner;


public class main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       Alumno a = new Alumno();
        String nombre = "";
        System.out.println("Escribe el nombre");
        nombre=s.nextLine();
        a.setNombre(nombre);
        System.out.println(a.getNombre());
        a.estudiar();
        System.out.println("Conocimiento: "+ a.getConocimiento());
        
    }
    
}
