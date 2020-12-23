
package Aplicacion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author generEcheverria
 */
public class FlujoConWriter {
    public static void main (String [] args) throws IOException{
        
        String nombreArchivo = "prueba.txt";
        try{
            FileWriter escribir = new FileWriter(nombreArchivo);
            /*for (char c = 'a';c<'z';c++){
                escribir.write(c);
            }*/
            escribir.write("hola\n");
            escribir.write("adios\n");
            escribir.close();
        }
        catch(IOException e){
            System.out.println("Imposible abrir el archivo para escribir uwu");
        }
        FileReader leer;
        int c;
        char [] nombres = new char [19];
        try{
            leer = new FileReader(nombreArchivo);
            c = leer.read(nombres);
            while(c!=-1){
                System.out.println(c);
                c = leer.read();
            }
        }
        catch(IOException e2){
            System.out.println("Imposible abrir el archivo para leer uwu");
        }
    }
}
