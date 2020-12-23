/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;


import java.util.ArrayList;
import Vista.*;
import Modelo.*;

/**
 *
 * @author Gener Echeverria
 * LIS POO 
 * 16/12/2020
 */

public class Inicio {
    public static ArrayList<Errores> listaErrores = new ArrayList<Errores>();
    public static void main(String[] args) {
        FrmCalculadora calculadora = new FrmCalculadora();
        calculadora.setVisible(true);
    }
    
    
}
