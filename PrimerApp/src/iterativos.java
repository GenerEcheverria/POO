
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gener_000
 */
public class iterativos {
    public static Scanner s = new Scanner(System.in);
    public static void main (String[] args){
        cicloFor();
    }
    public static void cicloWhile(){
        int i=0, sumador=0, dato=0;
        while (i<5){
            System.out.println("Escribe el dato" + i);
            dato=Integer.parseInt(s.nextLine());
            sumador+=dato;
       
            i++;    
        System.out.println("Sumador "+sumador);}
    }
    public static void cicloDoWhile(){
        int numero=0;
        do {
            System.out.println("Escribe el numero");
            numero=Integer.parseInt(s.nextLine());
        }while (numero>1 && numero<10);
    }
    public static void cicloFor(){
        for (int j=0; j<5;j++){
            System.out.println(""+j);
        }
    }
}
