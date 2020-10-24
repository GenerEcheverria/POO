
package pack;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dia;
        int mes;
       
        System.out.println("---FECHA DE HOY---");
        System.out.println("Escribe el dia");
        dia = scanner.nextInt();
        System.out.println("Escribe el mes");   
        mes = scanner.nextInt();      
        DiaAnio hoy = new DiaAnio(dia,mes);
        
        System.out.println("---FECHA DE TU CUMPLEAÑOS---");
        System.out.println("Escribe el dia");
        dia = scanner.nextInt();
        System.out.println("Escribe el mes");   
        mes = scanner.nextInt();
        DiaAnio cumple = new DiaAnio(dia,mes);
        
        hoy.visualizar(hoy.igual(cumple));     
        
        
    }
}
