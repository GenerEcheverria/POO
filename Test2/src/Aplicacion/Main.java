package Aplicacion;

import Modelo.AnalizadorLexico;
import Modelo.AnalizadorSintactico;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner leer = new Scanner(new File(args[0]));
            AnalizadorLexico anaLex = new AnalizadorLexico();
            anaLex.analizadorLex(leer);
            leer.close();
            AnalizadorSintactico anaSin = new AnalizadorSintactico();
            anaSin.analizadorSint();
            
            leer.close();
        }
        catch (IOException e1){
            System.out.println("No se pudo acceder a los archivos");
        }


    }
}
