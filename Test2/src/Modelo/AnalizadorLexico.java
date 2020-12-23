/*Valeria Gonzalez y Gener Echeverria
  Teoria de la computacion
  Proyecto analizador
  LIS
 */
package Modelo;



import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class AnalizadorLexico {

    public void analizadorLex (Scanner leer)  {
        ArrayList<String> inputTest = new ArrayList();
        List <String> keywords = Arrays.asList("PROGRAMA", "FINPROG", "SI", "ENTONCES", "SINO", "FINSI", "REPITE", "VECES", "FINREP", "IMPRIME", "LEE");
        List <String> operadores = Arrays.asList("+", "-", "*", "/", "<", ">", "==", "=");

        ArrayList<ArrayList<String>> IDS = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> TXT = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> VAL = new ArrayList<ArrayList<String>>();
        String nextLine = null;
        int primeroId = 0;
        int primeroVal = 0;
        int contadorId=0;
        int contadorTxt=0;
        int contadorVal=0;
        int lineas =0;
        EsNumero esVal = new EsNumero();
        OctalADecimal aDecimal = new OctalADecimal();

        try{

            FileWriter tokens = new FileWriter("programa.lex");
            FileWriter tablaSimbolos = new FileWriter("programa.sim");

            while (leer.hasNextLine()) {
                nextLine = leer.nextLine();
                inputTest.add(nextLine);
            }


            for (int i = 0; i < inputTest.size(); i++) {
                lineas++;
                char aux [] ;
                aux = inputTest.get(i).toCharArray();
                if(aux.length==0){
                    continue;
                }

                //******************************
                String cortada = inputTest.get(i);         //LLEVA i
                int a=0;
                int b=0;
                boolean comillas =false;
                for (int j=0;j<cortada.length();j++){
                    if ((cortada.charAt(j)=='"' || cortada.charAt(j)=='”' ||cortada.charAt(j)=='“') && a!=0){ //no entra a este
                        b=j+1;
                        comillas = true;
                        contadorTxt++;
                        break;
                    }
                    if (cortada.charAt(j)=='"'||cortada.charAt(j)=='“'){
                        a=j-1;
                    }
                }
                String cadena = cortada.substring(0,a)+cortada.substring(b);
                String texto ="";
                ArrayList<String> auxTxt = new ArrayList<String>();
                if (comillas){
                    texto = cortada.substring(a+1,b); //quito el espacio en SIM
                    auxTxt.add(texto);
                    if (contadorTxt < 10) {
                        auxTxt.add("TX0" + contadorTxt);
                    } else {
                        auxTxt.add("TX" + contadorTxt);
                    }
                    
                    TXT.add(auxTxt);
                }
                //System.out.println(texto); 
                //*****************************************
                String[] palabras = cadena.split(" "); //original input  //String[] palabras = inputTest.get(i).split(" ");
                for (int k=0; k<palabras.length;k++){
                    if (palabras[k].charAt(0)=='#'){
                        break;
                    }
                    if (!(((palabras[k].charAt(0))>47 && (palabras[k].charAt(0))<58)||operadores.contains(palabras[k])||keywords.contains(palabras[k])||palabras[k].contains("\t"))){
                        if (primeroId==0){
                            ArrayList filas = new ArrayList();
                            contadorId++;
                            primeroId++;
                            if (palabras[k].length()>16){                           //para que solo se guarde los 16 characteres
                                filas.add(palabras[k].substring(0,15));
                            }else {
                                filas.add(palabras[k]);
                            }

                            filas.add("ID0"+contadorId);
                            IDS.add(filas);
                        } else {
                            boolean guardar =true;
                            for (int l=0;l<contadorId;l++){
                                if (palabras[k].equals(IDS.get(l).get(0))){
                                    guardar=false;
                                    break;
                                }
                            }
                            if (guardar){
                                ArrayList filas = new ArrayList();
                                contadorId++;
                                if (palabras[k].length()>16){                           //para que solo se guarde los 16 characteres
                                    filas.add(palabras[k].substring(0,15));
                                }else {
                                    filas.add(palabras[k]);
                                }
                                if (contadorId < 10) {
                                    filas.add("ID0"+contadorId);
                                } else {
                                    filas.add("ID"+contadorId);
                                }
                                IDS.add(filas);
                            }
                        }
                    }
                    if (esVal.isNumeric(palabras[k], lineas)){
                        if (primeroVal==0){
                            ArrayList filas = new ArrayList();
                            contadorVal++;
                            primeroVal++;
                            if (esVal.isNumeric(palabras[k], lineas)){                           //para que solo se guarde los 16 characteres
                                filas.add(palabras[k]);
                                filas.add(""+aDecimal.Decimal(palabras[k]));
                                VAL.add(filas);
                            }

                        } else {
                            boolean guardar =true;
                            for (int l=0;l<contadorVal;l++){
                                if (palabras[k].equals(VAL.get(l).get(0))){
                                    guardar=false;
                                    break;
                                }
                            }
                            if (guardar){
                                ArrayList filas = new ArrayList();
                                contadorVal++;
                                if (esVal.isNumeric(palabras[k], lineas)){                           //para que solo se guarde los 16 characteres
                                    filas.add(palabras[k]);
                                    filas.add(""+aDecimal.Decimal(palabras[k]));
                                    VAL.add(filas);
                                }
                            }
                        }
                    }
                }
            }
            
            
            for (int i = 0; i < inputTest.size(); i++) {
                if (inputTest.get(i).contains("#")) {
                    continue;
                }
                String[] palabras = inputTest.get(i).split(" ");
                
                for (int j = 0; j < palabras.length; j++) {
                    if (esVal.isNumeric(palabras[j], i)) {
                        tokens.write("[val]\n");
                    }
                    for (int c = 0; c < keywords.size(); c++) {
                        if(palabras[j].contains(keywords.get(c))) {
                            tokens.write(keywords.get(c) + "\n");
                        }
                    }
                    for (int curi = 0; curi < operadores.size(); curi++) {
                        if(palabras[j].contains(operadores.get(curi))) {
                            if (operadores.get(curi).equals("=")) {
                                tokens.write(operadores.get(curi) + "\n");
                            } else {
                                tokens.write("[op_ar]\n");
                            }
                           
                        }
                    }
                    for (int k = 0; k < IDS.size(); k++) {
                        if (palabras[j].contains(IDS.get(k).get(0))) {
                            tokens.write("[id] " + IDS.get(k).get(1) + "\n");
                        }
                    }
                    
                }
                for (int p = 0; p < TXT.size(); p++) {
                        if (inputTest.get(i).contains(TXT.get(p).get(0))) {
                            tokens.write("[txt] " + TXT.get(p).get(1) + "\n");
                        }
                }
                
            }

            tablaSimbolos.write("IDS\n");
            for (int i=0;i<IDS.size();i++){
                tablaSimbolos.write(IDS.get(i).get(0)+", "+IDS.get(i).get(1) + "\n");
            }
            
            tablaSimbolos.write("\nTXT\n");
            for (int i=0;i<TXT.size();i++){
                tablaSimbolos.write(TXT.get(i).get(0)+", "+TXT.get(i).get(1)+ "\n");
            }

            tablaSimbolos.write("\nVAL\n");
            for (int i=0;i<VAL.size();i++){
                tablaSimbolos.write(VAL.get(i).get(0)+", "+VAL.get(i).get(1)+ "\n");
            }
            tokens.close();
            tablaSimbolos.close();
        }
        catch (IOException e1){
            System.out.println("No se pudo acceder a los archivos uwu");
        }
    }
}
