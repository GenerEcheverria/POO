/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.PorPagar;
import Vista.FrmInicio;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryzen5
 */

public class GestionCxP {
    public static ArrayList<PorPagar> listaPorPagar = new ArrayList<PorPagar>();
    public static void main(String[] args){
        try{
            FileInputStream archivo = new FileInputStream("Pagos.txt");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            GestionCxP.listaPorPagar = (ArrayList<PorPagar>) entrada.readObject();
        }
        catch(IOException e1){
            //JOptionPane.showMessageDialog( "Problema con la lectura de datos");
            System.out.println("Problemas con la lectura de datos");
        }
        catch(ClassNotFoundException e2){
            System.out.println("El tipo de dato no es el correcto");
        }
        

        
        new FrmInicio().setVisible(true);
       
    }
}
