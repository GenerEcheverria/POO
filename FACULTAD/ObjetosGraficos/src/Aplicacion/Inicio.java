/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;


import Modelo.EmpleadoAsalariado;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author juan.ucan
 */
public class Inicio {
    
    public static ArrayList<EmpleadoAsalariado> listaEmpleados = new ArrayList<EmpleadoAsalariado>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        
        
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        
        /*
        
        JFrame unaVentana = new JFrame();
        
        unaVentana.setSize(400, 300);
        
        unaVentana.setVisible(true);
        
        */
        
        
    }
    
}
