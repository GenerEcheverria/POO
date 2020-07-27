
import java.util.Scanner;

public class condicional {
    public static Scanner s = new Scanner(System.in);
    public static void main (String [] args){
        //condicional();
        //condicionalSwitch();
        condicionalTernario();
    }
    public static void condicional (){
        int edad = 0;
        System.out.println("Escribe tu edad");
        edad=Integer.parseInt(s.nextLine());
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    public static void condicionalSwitch (){
        int digito = 0;
        System.out.println("Escribe un numero");
        digito=Integer.parseInt(s.nextLine());
        switch (digito){
            case 1: System.out.println("Tu numero es uno");
                break;
            case 2: System.out.println("Tu numero es dos");
                break;
            default: System.out.println("NA");
        }
    }
    public static void condicionalTernario (){
        double n1=0.0,n2=0.0,n3=0.0,prom=0.0;
        String estado = "";
        System.out.println("Primera calificacion");
        n1=Double.parseDouble(s.nextLine());
        System.out.println("Segunda calificacion");
        n2=Double.parseDouble(s.nextLine());
        System.out.println("Tercera calificacion");
        n3=Double.parseDouble(s.nextLine());
        prom=(n1+n2+n3)/3;
        System.out.println("Promedio " + prom);
        estado = prom>=70.0?"Aprobado":"Reprobado";
        System.out.println(""+estado);
    }
}
