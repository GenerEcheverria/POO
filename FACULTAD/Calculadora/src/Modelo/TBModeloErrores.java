/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Aplicacion.Inicio;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gener Echeverria
 * LIS POO 
 * 16/12/2020
 */
public class TBModeloErrores {
    
    
    public void inicializaTabla(JTable tabla){
        
        Vector<String> titulos = new Vector<String>();   
        Vector< Vector<Object> > data = new Vector< Vector<Object> >();
        
        titulos.add("Clase");
        titulos.add("Archivo");
        titulos.add("Método");
        titulos.add("Línea");
        
        
        for(int i= 0; i< Inicio.listaErrores.size(); i++){
            Vector<Object> row = new Vector<Object>();
            row.add(Inicio.listaErrores.get(i).getClase());
            row.add(Inicio.listaErrores.get(i).getArchivo());
            row.add(Inicio.listaErrores.get(i).getMetodo());
            row.add(Inicio.listaErrores.get(i).getLinea());
            
            data.add(row);
        }
        
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        tabla.setModel(modelo);
    }
}
