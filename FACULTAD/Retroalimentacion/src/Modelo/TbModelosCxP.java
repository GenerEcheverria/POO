/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Aplicacion.GestionCxP;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryzen5
 */
public class TbModelosCxP {
    public void inicializaTabla(JTable tabla,int opcion){
        Vector <String> titulos= new Vector <String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        
        
        switch(opcion){
            case 1: //Factura 
                titulos.add("Pieza");
                titulos.add("Descripcion");
                titulos.add("Cantidad");
                titulos.add("Precio");
                for (int i=0;i<GestionCxP.listaPorPagar.size();i++){
                    Vector<Object> row = new Vector<Object>();
                    if(GestionCxP.listaPorPagar.get(i) instanceof Factura){
                        row.add(((Factura) GestionCxP.listaPorPagar.get(i)).getNumeroPieza());
                        row.add(((Factura) GestionCxP.listaPorPagar.get(i)).getDescripcionPieza());
                        row.add(((Factura) GestionCxP.listaPorPagar.get(i)).getCantidad());
                        row.add(((Factura) GestionCxP.listaPorPagar.get(i)).getPrecioArticulo());
                        row.add(GestionCxP.listaPorPagar.get(i).obtenerMontoPago());
                        data.add(row);
                    }
                }
                break;
            case 2: //Empleado asalariado   
                titulos.add("Seguro social");
                titulos.add("Nombre");
                titulos.add("Apellido paterno");
                titulos.add("Salario semanal");
                for(int i=0;i<GestionCxP.listaPorPagar.size();i++){
                    Vector<Object> row = new Vector<Object>();
                    if(GestionCxP.listaPorPagar.get(i) instanceof EmpleadoAsalariado){
                        row.add(((EmpleadoAsalariado) GestionCxP.listaPorPagar.get(i)).getPrimerNombre());
                        row.add(((EmpleadoAsalariado) GestionCxP.listaPorPagar.get(i)).getApellidoPaterno());
                        row.add(((EmpleadoAsalariado) GestionCxP.listaPorPagar.get(i)).getNumeroSeguroSocial());
                        row.add(((EmpleadoAsalariado) GestionCxP.listaPorPagar.get(i)).getSalarioSemanal());
                        row.add(GestionCxP.listaPorPagar.get(i).obtenerMontoPago());
                        data.add(row);
                    }
                }
                break;
            case 3: //Empleado base mas comision
                break;
            case 4: //Empleado por comision
                break;
            case 5: //Empleado por horas
                
            
        }
        titulos.add("Pago");
        DefaultTableModel modelo = new DefaultTableModel(data,titulos);
        tabla.setModel(modelo);
    }
    
    
}
