/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author gener_000
 */
public class EstudioAnimales {
    public static void main (String[] args){
        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
        listaAnimales.add(new Aguila("Pepe", 5, 120));
        listaAnimales.add(new Conejo("Roger", 20, 50));
        listaAnimales.add(new Serpiente("Snaky",3));
        listaAnimales.add(new Conejo("Bugs",50,90));
    
        for (int i = 0; i<listaAnimales.size();i++){
            if (listaAnimales.get(i) instanceof Conejo){
             Conejo unConejo =(Conejo) listaAnimales.get(i);
                unConejo.setLargoOrejas(2*unConejo.getLargoOrejas());
                
            }
               System.out.println(listaAnimales.get(i)+", se mueve "+listaAnimales.get(i).mover());
        }
    }
    
}
