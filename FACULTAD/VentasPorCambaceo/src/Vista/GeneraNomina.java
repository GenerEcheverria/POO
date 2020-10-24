/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;

public class GeneraNomina {
    public static void main(String[] args){
        EmpleadoPorComision empleado1 = new EmpleadoPorComision("Mario","Paredes","123434",12,12);
        System.out.println(empleado1.toString() +empleado1.sueldo());
        
        EmpleadoBaseMasComisionH empleado2 = new EmpleadoBaseMasComisionH("Jose","Paredes","64364324",12.5,12.5,12.6);
        System.out.println(empleado2.toString()+", " + empleado2.sueldo());
    }
}
