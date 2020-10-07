
package pack;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Saldo> Cuentas = new ArrayList<Saldo>();
    
//    JRadioButton btn1 = new JRadioButton("Nueva Cuenta",true);
//    JRadioButton btn2 = new JRadioButton("Escoger cuenta",false);
//    JRadioButton btn3 = new JRadioButton("Salir",false);
//    ButtonGroup menu = new ButtonGroup();
//    menu.add(btn1);
//    menu.add(btn2);
//    menu.add(btn3);
//    
    public static void main(String[] args) {
        int opcion1;
        
        do {
            
            System.out.println("Selecciona una opcion");
            System.out.println("1. Nueva cuenta");
            System.out.println("2. Escoger cuenta");
            System.out.println("3. Salir");
            opcion1 = Integer.parseInt(s.nextLine());
            if (opcion1==1){
                AgregarCuenta();
            }
            if (opcion1==2){
               if (Cuentas.size()==0){
                   System.out.println("NO HAY DATOS REGISTRADOS");
               } else {
                   ModCuenta();
               }
               
            }
        }while (opcion1!=3);
        
                     
    }
    
    public static void AgregarCuenta(){
        double saldo;
        int numeroCuenta;
        String descripcion;
        
        System.out.println("Escribe el saldo:");
        saldo = Double.parseDouble(s.nextLine());
        System.out.println("Escribe el numero de cuenta");
        numeroCuenta = Integer.parseInt(s.nextLine());
        System.out.println("Descripcion");
        descripcion = s.nextLine();
        Saldo cuenta= new Saldo(saldo, numeroCuenta,descripcion);
        Cuentas.add(cuenta);
    } 
    
    public static void ModCuenta(){
        int numeroCuenta;
        int abonar;
        int opcion2;
        System.out.println("Escribe el numero de cuenta:");
        numeroCuenta = Integer.parseInt(s.nextLine());
        do {
            System.out.println("Escoge la operacion que deseas realizar");
            System.out.println("1. Mostrar saldo");
            System.out.println("2. Agregar saldo");
            System.out.println("3. Regresar");
            opcion2=Integer.parseInt(s.nextLine());
            if (opcion2==1){
                for (Saldo sal: Cuentas){
                    if (numeroCuenta==sal.getNumeroCuenta()){
                        System.out.println(sal.toString());
                    }
                }
            }
            if (opcion2==2){
                System.out.println("Escibe la cantidad que deseas abonar");
                abonar=Integer.parseInt(s.nextLine());
                for (Saldo sal: Cuentas){
                    if (numeroCuenta==sal.getNumeroCuenta()){
                        sal.abonar(abonar);
                    }
                }
            }
        }while(opcion2!=3);        
        
    }
}
