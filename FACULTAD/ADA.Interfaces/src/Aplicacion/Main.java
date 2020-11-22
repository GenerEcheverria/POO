/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;
import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ADA2 Interfaces
 * Gener Alejandro Echeverria Chi
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        ArrayList<PorPagar> lista = new ArrayList<PorPagar>();
        boolean continuar = true;
        int i=0;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Selecciona: \n 1. Factura\n 2. Empleado");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1": lista.add(CrearFacturas());  break;
                case "2": lista.add(CrearEmpleados()); break;
                default:
                    System.out.println("Opcion invalida!!!");
            }
            System.out.println("¿Desea otra operacion? S/N");
            String otro = scanner.nextLine();
            if (otro.equalsIgnoreCase("N")){
                continuar=false;
            }
        }while(continuar);
        System.out.println("-----------------------------------------");
        System.out.println("IMPRIMIENDO...\n");
        System.out.println("\t\t\t\tFACTURAS ");
        for (PorPagar obj: lista){
            if (obj instanceof Factura){
                System.out.println(obj.toString() + "\nMonto a pagar: " + obj.obtenerMontoPago()+"\n") ;
                i++;
            }
        }
        if (i==0){
            System.out.println("No se ingresaron facturas");
        }
        i=0;
        System.out.println("\n\t\t\t\tEMPLEADOS");
        for (PorPagar obj: lista){
            if (obj instanceof Empleado){
                System.out.println(obj.toString() + "\nMonto a pagar: " + obj.obtenerMontoPago()+"\n") ;
                i++;
            } 
        }
        if (i==0){
            System.out.println("No se ingresaron empleados");
        }
    }

    public static Factura CrearFacturas(){
        System.out.println("----------------------------------");
        System.out.println("\t\t\t\tFACTURA ");
        System.out.print("Numero de la pieza (Clave): ");
        String numeroPieza = scanner.nextLine();
        System.out.print("Descripcion de la pieza: ");
        String descripcion = scanner.nextLine();
        System.out.print("Cantidad de piezas: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio por articulo:");
        double precio = Double.parseDouble(scanner.nextLine());
        return new Factura(numeroPieza,descripcion,cantidad,precio);
    }

    public static Empleado CrearEmpleados(){
        System.out.println("__________________________________________________");
        System.out.println("\t\t\t\tEMPLEADO ");
        System.out.println("Escribe el tipo de empleado que deseas ingresar:\n 1.Empleado asalariado\n 2.Empleado por horas\n 3.Empleado por comision\n 4.Empleado base mas comision");
        String opcion;
        do {
            System.out.print("Opcion: ");
            opcion = scanner.nextLine();
        }while(Integer.valueOf(opcion)<=0||Integer.valueOf(opcion)>=5);
        System.out.println("\n\t\t\tEMPLEADO ");
        System.out.print("Primer nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellido = scanner.nextLine();
        System.out.print("Numero de seguridad social: ");
        int NSS =  Integer.parseInt(scanner.nextLine());
        float ventasBrutas;
        float tarifa;
        switch (opcion){
            case "1":
                System.out.print("Salario semanal: ");
                float salarioSemanal = Float.parseFloat(scanner.nextLine());
                return new EmpleadoAsalariado(nombre,apellido,NSS,salarioSemanal);
            case "2":
                System.out.print("Sueldo por horas: ");
                float sueldoHoras = Float.parseFloat(scanner.nextLine());
                System.out.print("Horas trabajadas: ");
                float horas = Float.parseFloat(scanner.nextLine());
                return new EmpleadoPorHoras(nombre,apellido,NSS,sueldoHoras,horas);
            case "3":
                System.out.print("Ventas brutas: ");
                ventasBrutas = Float.parseFloat(scanner.nextLine());
                System.out.print("Tarifa por comision: ");
                tarifa = Float.parseFloat(scanner.nextLine());
                return new EmpleadoPorComision(nombre, apellido, NSS, ventasBrutas, tarifa);
            case "4":
                System.out.print("Ventas brutas: ");
                ventasBrutas = Float.parseFloat(scanner.nextLine());
                System.out.print("Tarifa por comision: ");
                tarifa = Float.parseFloat(scanner.nextLine());
                System.out.print("Salario base: ");
                float salarioBase = Float.parseFloat(scanner.nextLine());
                return new EmpleadoBaseMasComision(nombre, apellido, NSS, ventasBrutas,tarifa,salarioBase);
        }
        return null;
    }
}

