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
 * @author juan.ucan
 */
public class TBModeloEmpleadoAsalariado {
    
    
    public void inicializaTabla(JTable tabla){
        
        Vector<String> titulos = new Vector<String>();   
        Vector< Vector<Object> > data = new Vector< Vector<Object> >();
        
        titulos.add("Seguro Social");
        titulos.add("Nombre");
        titulos.add("Apellido Paterno");
        titulos.add("Apellido Materno");
        titulos.add("Salario");
        
        for(int i= 0; i< Inicio.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            row.add(Inicio.listaEmpleados.get(i).getNss());
            row.add(Inicio.listaEmpleados.get(i).getNombre());
            row.add(Inicio.listaEmpleados.get(i).getApellidoP());
            row.add(Inicio.listaEmpleados.get(i).getApellidoM());
            row.add(Inicio.listaEmpleados.get(i).getSalario());
            data.add(row); // Aquí se va armando la matriz de datos
        }
        
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        tabla.setModel(modelo);
    }
}
