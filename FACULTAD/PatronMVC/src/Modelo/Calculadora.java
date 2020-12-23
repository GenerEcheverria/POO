/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ryzen5
 */
public class Calculadora {
    public String dividir(String numero1, String numero2){
        String resultado = "";
        try{
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            int division = num1 / num2;
            resultado = ""+division;
        }
        catch(ArithmeticException e){
            resultado = resultado + "No se puede dividir entre 0";
        }
        catch(NumberFormatException e2){
            resultado = resultado + "Los datos capturados deben ser enteros";
        }
        return resultado;
    }
}
