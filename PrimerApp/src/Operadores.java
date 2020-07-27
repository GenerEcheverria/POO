
import java.util.Scanner;


public class Operadores {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, resto;
        System.out.println("Digita dos numeros");
        numero1 = s.nextFloat();
        numero2 = s.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1/numero2;
        resto = numero1%numero2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Division: "+ div);
        System.out.println("Resto: " + resto);
        
        
        //Clase math
        double raiz1 = Math.sqrt(35);
        int raiz2 = (int)Math.sqrt(9);
        System.out.println("La raiz de 9 es: " + raiz1);
        
        double base = 5, exponente = 2;
        double resultado = Math.pow(base,exponente);
        System.out.println("Exponente: " + resultado);
    }
}
