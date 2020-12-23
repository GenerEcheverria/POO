/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Calculadora;

/**
 *
 * @author Ryzen5
 */
public class CtrlCalculadora {
    private Calculadora unaCalculadora;

    public void setUnaCalculadora(Calculadora unaCalculadora) {
        this.unaCalculadora = unaCalculadora;
    }
    
    
    public String dividir (String numero1, String numero2){
        String resultado = unaCalculadora.dividir(numero1,numero2);
        return resultado;
    }
}
