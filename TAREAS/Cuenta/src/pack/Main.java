
package pack;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int saldo;
        int numeroCuenta;
        String descripcion
        
        System.out.println("Escribe el saldo:");
        saldo = Integer.parseInt(s.nextLine());
        System.out.println("Escribe el numero de cuenta");
        numeroCuenta = Integer.parseInt(s.nextLine());
        System.out.println("Descripcion");
        descripcion = s.nextLine();
        Saldo saldo1= new Saldo(saldo, numeroCuenta,descripcion);
        toString();
        saldo1.getSaldo();
        System.out.println("Cuanto quieres abonar");
        int abono = Integer.parseInt(s.nextLine());
        saldo1.abonar(abono);
        System.out.println("Nuevo saldo: "+ saldo1.getSaldo());    
             
    }
}
