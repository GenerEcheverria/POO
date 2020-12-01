/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.MenorCeroException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionConExcepciones {

    public static int cociente(int numerador, int denominador)
            throws ArithmeticException
    {
        return numerador/denominador; // Punto de lanzamiento de Exc
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entradaInt = new Scanner(System.in);
        int resultado = 0;
        boolean continuar = true;
        //ArrayList listaErrores = new ArrayList();
        ArrayList<ArrayList<Object>> listaErrores = new ArrayList<ArrayList<Object>>();
        do{
            try{
                System.out.println("Escriba un numerador: ");
                int numerador = entradaInt.nextInt(); // Punto de lanzamiento de Exc

                System.out.println("Escriba un denominador: ");
                int denominador = entradaInt.nextInt(); // Punto de lanzamiento de Exc

                if(denominador <0)
                {
                    throw new MenorCeroException("El denominador no puede ser menor a cero"); //Aquí sería un posible punto de lanzamiento de Exc
                }

                resultado = cociente(numerador, denominador); // Punto de lanzamiento de Exc
                continuar = false;
            }
            catch(InputMismatchException excep1){
                System.out.println("Debe escribir un número");
                StackTraceElement[] lista1 = excep1.getStackTrace();
                ArrayList filas = new ArrayList();
                for(int i=0; i <lista1.length; i++){
                    filas.add(lista1[i].getClassName());
                    filas.add(lista1[i].getFileName());
                    filas.add(lista1[i].getMethodName());
                    filas.add(lista1[i].getLineNumber());
                }
                listaErrores.add(filas);


                entradaInt.nextLine();
            }
            catch(ArithmeticException excep2){
                //excep2.printStackTrace();
                //System.out.println(excep2.);
                System.out.println("El denominador no puede ser cero");
                StackTraceElement[] lista1 = excep2.getStackTrace();
                ArrayList filas = new ArrayList();
                for(int i=0; i <lista1.length; i++){
                    filas.add(lista1[i].getClassName());
                    filas.add(lista1[i].getFileName());
                    filas.add(lista1[i].getMethodName());
                    filas.add(lista1[i].getLineNumber());
                }
                listaErrores.add(filas);

            }
            catch(MenorCeroException excep3){
                System.out.println(excep3.getMessage());
                StackTraceElement[] lista1 = excep3.getStackTrace();
                ArrayList filas = new ArrayList();
                for(int i=0; i <lista1.length; i++){
                    filas.add(lista1[i].getClassName());
                    filas.add(lista1[i].getFileName());
                    filas.add(lista1[i].getMethodName());
                    filas.add(lista1[i].getLineNumber());
                }
                listaErrores.add(filas);
            }

        }
        while(continuar);

        System.out.println("El resultado de la división es: " + resultado);


        System.out.println("Clase \t\t\t\t\t Archivo \t\t\t\t Métodos \t\t\t Línea");

        for(int i=0; i <listaErrores.size(); i++){
            System.out.println("\n");
            for(int j=0; j< listaErrores.get(i).size(); j++){
                System.out.print(listaErrores.get(i).get(j) + "\t\t\t");
            }
            System.out.println("\n");
            //System.out.println(listaErrores[i].getClassName() + "\t\t" + listaErrores[i].getFileName()
            //+ "\t\t" + listaErrores[i].getMethodName() + "\t\t\t" + listaErrores[i].getLineNumber());
        }



    }

}