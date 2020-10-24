//Gener Alejandro Echeverria Chi
//ADA1 POO
//LIS
package Paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

        int opcion;
        do {
            System.out.println("=======================================================");
            System.out.println("\t\tSistema de recursos humanos");
            System.out.println("Selecciona la opcion que deseas:");
            System.out.println("  1)Ingresar empleado.");
            System.out.println("  2)Imprimir lista de empleados.");
            System.out.println("  3)Salir.");
            opcion=Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1: IngresarEmpleado(listaEmpleado); break;
                case 2: ImprimirLista(listaEmpleado); break;
                case 3:
                    System.out.println("Saliendo..."); break;
                default:
                    System.out.println("Ingresa una opcion válida");
            }
        } while (opcion!=3);
        System.out.println("=======================================================");
    }

    public static void IngresarEmpleado(ArrayList<Empleado> listaEmpleado){
        int opcion;
        int dia;
        int mes;
        int anio;
        boolean test;
        String claveDep;
        String nombreDep;
        do {
            System.out.println("=======================================================");
            System.out.println("\t\tSistema de recursos humanos");
            System.out.print("Clave del Empleado: ");
            int clave = Integer.parseInt(scanner.nextLine());
            System.out.print("Nombre del Empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido Paterno: ");
            String apellidoPaterno = scanner.nextLine();
            System.out.print("Apellido materno: ");
            String apellidoMaterno = scanner.nextLine();
            Fecha nacimiento = new Fecha();
            do {
                System.out.println("\nFecha de Nacimiento");
                System.out.print("\tDía (dos dígitos): ");
                dia = Integer.parseInt(scanner.nextLine());
                System.out.print("\tMes (dos dígitos): ");
                mes = Integer.parseInt(scanner.nextLine());
                System.out.print("\tAño (cuatro dígitos): ");
                anio = Integer.parseInt(scanner.nextLine());
                test = nacimiento.validarFecha(dia,mes,anio);
            }while (!test);
            nacimiento = new Fecha(dia,mes,anio);
            do {
                System.out.println("\nFecha de Ingreso");
                System.out.print("\tDía (dos dígitos): ");
                dia = Integer.parseInt(scanner.nextLine());
                System.out.print("\tMes (dos dígitos): ");
                mes = Integer.parseInt(scanner.nextLine());
                System.out.print("\tAño (cuatro dígitos): ");
                anio = Integer.parseInt(scanner.nextLine());
                test = nacimiento.validarFecha(dia,mes,anio);
                if (nacimiento.getAnio()>=anio){
                    System.out.println("INGRESO DEBE SER POSTERIOR AL NACIMIENTO!!!");
                    test = false;
                }
            } while(!test);
            Fecha ingreso = new Fecha(dia, mes, anio);
            Departamento departamento = new Departamento();
            do {
                System.out.println("\nDepartamento");
                System.out.print("\tClave departamento: ");
                claveDep = scanner.nextLine();
                System.out.print("\tNombre departamento: ");
                nombreDep = scanner.nextLine();
                test = departamento.validarDepartamento(claveDep,nombreDep);
            }while (!test);
            departamento = new Departamento(claveDep, nombreDep);
            System.out.println("\nHorario \n\tLunes-Viernes");
            Horario horarioLV = datosHorario();
            System.out.println("¿Desea capturar otro horario (S- Si, N- No)?");
            char otroHorario = scanner.nextLine().charAt(0);
            Horario horarioSabado = new Horario();
            Horario horarioDomingo = new Horario();
            if (otroHorario=='S'||otroHorario=='s'){
                System.out.println("¿Que horario desea capturar?: ");
                System.out.println("1. Sabado\n2. Domingo\n3. Sabado y domingo");
                int opcion2 = Integer.parseInt(scanner.nextLine());
                switch (opcion2){
                    case 1:  System.out.println("\nHorario \n\tSabado");
                        horarioSabado = datosHorario();
                        break;
                    case 2: System.out.println("\nHorario \n\tSabado");
                        horarioDomingo = datosHorario();
                        break;
                    case 3: System.out.println("\nHorario \n\tSabado");
                        horarioSabado = datosHorario();
                        System.out.println("\nHorario \n\tDomingo");
                        horarioDomingo = datosHorario();
                        break;
                }
            }
            Empleado nuevoEmpleado = new Empleado (clave,nombre,apellidoMaterno,apellidoPaterno, nacimiento,ingreso,departamento,horarioLV,horarioSabado,horarioDomingo);
            listaEmpleado.add(nuevoEmpleado);
            System.out.print("¿Desea capturar otro empleado (1 para continuar, 0 para terminar)?: ");
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println("=======================================================");
        }while (opcion!=0);
    }

    public static void ImprimirLista(ArrayList<Empleado> listaEmpleado){
        System.out.println("=================================================================================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSistema de recursos humanos:\n");
        for (Empleado obj : listaEmpleado){
            System.out.println(obj.toString());
        }
        System.out.println("=================================================================================================================================================================");
    }

    public static Horario datosHorario() {
        boolean test;
        int horaInicio;
        int minutoInicio;
        int horaTermina;
        int minutoTermina;
        Horario prueba = new Horario();
        do {
            System.out.println("\tInicio: ");
            System.out.print("\t\tHora: ");
            horaInicio = Integer.parseInt(scanner.nextLine());
            System.out.print("\t\tMinuto: ");
            minutoInicio = Integer.parseInt(scanner.nextLine());
            test = prueba.validarHorario(horaInicio,minutoInicio);
        }while (!test);
        do {
            System.out.println("\tTermina: ");
            System.out.print("\t\tHora: ");
            horaTermina = Integer.parseInt(scanner.nextLine());
            System.out.print("\t\tMinuto: ");
            minutoTermina = Integer.parseInt(scanner.nextLine());
            test = prueba.validarHorario(horaTermina,minutoTermina);
        }while (!test);
        Horario horario = new Horario(horaInicio,minutoInicio, horaTermina, minutoTermina);
        return horario;
    }
}
