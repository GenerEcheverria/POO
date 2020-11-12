/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ADA2 POO
 * Gener Alejandro Echeverria Chi
 */
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String opcion;
        boolean nuevo=true;
        int i=1;
        do{
            System.out.println("__________________________________________________");
            System.out.println("Escribe el tipo de empleado que deseas ingresar:\n 1.Empleado asalariado\n 2.Empleado por horas\n 3.Empleado por comision\n 4.Empleado base mas comision");
            System.out.print("Opcion: ");
            opcion = scanner.nextLine();
            System.out.println("\n\t\t\tEMPLEADO "+i);
            i++;
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
                    EmpleadoAsalariado asalariado = new EmpleadoAsalariado(nombre,apellido,NSS,salarioSemanal);
                    empleados.add(asalariado);
                    break;
                case "2":
                    System.out.print("Sueldo por horas: ");
                    float sueldoHoras = Float.parseFloat(scanner.nextLine());
                    System.out.print("Horas trabajadas: ");
                    float horas = Float.parseFloat(scanner.nextLine());
                    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(nombre,apellido,NSS,sueldoHoras,horas);
                    empleados.add(empleadoPorHoras);
                    break;
                case "3":
                    System.out.print("Ventas brutas: ");
                    ventasBrutas = Float.parseFloat(scanner.nextLine());
                    System.out.print("Tarifa por comision: ");
                    tarifa = Float.parseFloat(scanner.nextLine());
                    EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(nombre, apellido, NSS, ventasBrutas, tarifa);
                    empleados.add(empleadoPorComision);
                    break;
                case "4":
                    System.out.print("Ventas brutas: ");
                    ventasBrutas = Float.parseFloat(scanner.nextLine());
                    System.out.print("Tarifa por comision: ");
                    tarifa = Float.parseFloat(scanner.nextLine());
                    System.out.print("Salario base: ");
                    float salarioBase = Float.parseFloat(scanner.nextLine());
                    EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(nombre, apellido, NSS, ventasBrutas,tarifa,salarioBase);
                    empleados.add(empleadoBaseMasComision);
                    break;
            }
            System.out.println("/n ¿Desea ingresar otro empleado? S/N");
            String otro = scanner.nextLine();
            if (otro.equalsIgnoreCase("N")){
                nuevo=false;
            }
        }while(nuevo);
        System.out.println("__________________________________________________");
        System.out.println("\t\t\t\tEMPLEADOS\n");
        for (int j=0;j<empleados.size();j++){
            if (empleados.get(j) instanceof EmpleadoBaseMasComision){
                 ((EmpleadoBaseMasComision) empleados.get(j)).setSalarioBase((float)1.1*((EmpleadoBaseMasComision) empleados.get(j)).getSalarioBase());
            }

            System.out.println(empleados.get(j).toString() + "\nSueldo: " + empleados.get(j).ingresos() + "\n");


        }
    }
}
