/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;
import java.util.Scanner;

public class DivisionSinExcepciones {

    /**
     * @param args the command line arguments
     */
    
    public static int cociente (int numerador, int denominador) {
        return numerador/denominador;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Numerador: ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("Denominador: ");
        int den = Integer.parseInt(scan.nextLine());
        
        int res = cociente(num,den);
        System.out.println("Resultado: " + res);
        
    }
    
}
