/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.Scanner;


public class DivisionConExcepciones {
    
    //throw nos permite lanzar una excepción propia.
    //throws permite lanzar un método. Por tanto tiene que ir declarada en el método.
    public static int cociente (int numerador, int denominador) 
    throws ArithmeticException 
    {
        return numerador/denominador;
    }
    
    public static void main(String[] args) {
        boolean continuacion = true;
        // TODO code application logic here
        do {
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Numerador: ");
                int num = Integer.parseInt(scan.nextLine());
                System.out.println("Denominador: ");
                int den = Integer.parseInt(scan.nextLine());

                int res = cociente(num,den);
                System.out.println("Resultado: " + res);
                continuacion = false;
            }
            catch(NumberFormatException e1) {
                System.out.println("Debe escribir un número entero.");
            }
            catch(ArithmeticException e2) {
                System.out.println("Debe escribir un número diferente de cero.");
            }
            
        }while (continuacion);
        
    }
    
}
