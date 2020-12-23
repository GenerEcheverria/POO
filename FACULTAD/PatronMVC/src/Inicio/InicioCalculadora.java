/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Controlador.CtrlCalculadora;
import Modelo.Calculadora;
import Vista.FrmCalculadora;

/**
 *
 * @author Ryzen5
 */
public class InicioCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora unaCalculadora = new Calculadora();
        CtrlCalculadora unCtrlCalculadora = new CtrlCalculadora();
        FrmCalculadora unFrmcalculadora = new FrmCalculadora();
            
        unFrmcalculadora.setUnCtrlCalculadora(unCtrlCalculadora);
        unCtrlCalculadora.setUnaCalculadora(unaCalculadora);
        unFrmcalculadora.setVisible(true);
    }
    
}
