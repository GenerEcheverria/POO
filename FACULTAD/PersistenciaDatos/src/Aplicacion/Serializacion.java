/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.Persona;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ryzen5
 */
public class Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileOutputStream archivo = new FileOutputStream("ObjetoAlumno.txt");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject("La persona es: ");
            salida.writeObject(new Persona ("Mario","Hugo",20));
            salida.close();
        }
        catch(IOException e){
            System.out.println("Problemas con el archivo");
        }
        
        try{
            FileInputStream file = new FileInputStream("ObjetoAlumno.txt");
            ObjectInputStream archivoEntrada = new ObjectInputStream(file);
            String mensaje = (String)archivoEntrada.readObject();
            Persona unaPersona = (Persona) archivoEntrada.readObject();
            archivoEntrada.close();
            System.out.println(mensaje + unaPersona);
        }
        catch(IOException e2){
            System.out.println("Problemas con el archivo en lectura");
        }
        catch(ClassNotFoundException e3){
            System.out.println("La conversion del tipo de dato no es el que correspone");
        }
    }
    
}
