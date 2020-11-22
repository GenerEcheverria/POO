/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import java.util.Scanner;
import Modelo.*;
/**
 *
 * @author gener_000
 */
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean seguir = true;
        int contadorVehiculos=0;
        float totalCobrado=0;
        do {
            String tipo;
            String placa;
            int horaEntrada;
            int horaSalida;
            int minutosAcumulados;
            System.out.println("Escribe el tipo de vehiculo \n 1. Normal\n 2. Pensionado\n 3. Oficial");
            tipo = scanner.nextLine();
            switch (tipo){
                case "1":
                    System.out.print("Escribe la placa: ");
                    placa=scanner.nextLine();
                    do{
                        System.out.print("Hora de entrada: ");
                        horaEntrada = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    do {
                        System.out.print("Hora de salida: ");
                        horaSalida = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    vehiculos.add(new Normales(placa,horaEntrada,horaSalida));
                    contadorVehiculos++;
                    break;
                case "2":
                    System.out.print("Escribe la placa: ");
                    placa=scanner.nextLine();
                    do{
                        System.out.print("Hora de entrada: ");
                        horaEntrada = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    do {
                        System.out.print("Hora de salida: ");
                        horaSalida = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    System.out.print("Minutos acumulados: ");
                    minutosAcumulados = Integer.parseInt(scanner.nextLine());
                    vehiculos.add(new Pensionados(placa,horaEntrada,horaSalida,minutosAcumulados));
                    contadorVehiculos++;
                    break;
                case "3":
                    System.out.print("Escribe la placa: ");
                    placa=scanner.nextLine();
                    do{
                        System.out.print("Hora de entrada: ");
                        horaEntrada = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    do {
                        System.out.print("Hora de salida: ");
                        horaSalida = Integer.parseInt(scanner.nextLine());
                    }while (horaEntrada>2400);
                    vehiculos.add(new Oficiales(placa,horaEntrada,horaSalida));
                    contadorVehiculos++;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!!!");
            }
            System.out.println("Quiere ingresar otro vehiculo? S/N");
            String otro = scanner.nextLine();
            if (otro.equalsIgnoreCase("N")){
                seguir=false;
            }
        }while(seguir);
        System.out.println("__________________________________________________");
        System.out.println("\t\t\t\tVEHICULOS\n");
        for (int j=0;j<vehiculos.size();j++){

            System.out.println(vehiculos.get(j).toString() + "\nCobro:$ " + vehiculos.get(j).calculoIngreso() + "\n");
            totalCobrado += vehiculos.get(j).calculoIngreso();
        }
        System.out.println("\nTotal de vehiculos: " + contadorVehiculos);
        System.out.println("Total cobrado: "+ totalCobrado);
    }
}
