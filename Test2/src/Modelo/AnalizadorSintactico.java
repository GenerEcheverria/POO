package Modelo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnalizadorSintactico {
    public void analizadorSint (){
        try {
            ArrayList <Token> tokenList = new ArrayList<>();
            String nextLine;
            
            Scanner lex = new Scanner(new File("programa.lex"));
            //Scanner lex = new Scanner(new File("test.lex"));
            while (lex.hasNextLine()) {
                nextLine = lex.nextLine();
                Token token = new Token(nextLine);
                tokenList.add(token);
            }
            
            int aux;
            if (!tokenList.get(0).getStr().equals("PROGRAMA")) {
                System.out.println("No pueden haber elementos antes de PROGRAMA.");
                System.exit(0);
            }
            
            for (int i = 0; i < tokenList.size(); i++) {
                aux = 0;
                if (tokenList.get(i).getStr().contains("PROGRAMA")) {
                    for (int j = i + 1; j < tokenList.size(); j++) {
                        aux++;
                        if (tokenList.get(j).getStr().equals("FINPROG") && !tokenList.get(j).isBandera()) {
                            if (j != tokenList.size()-1) {
                                System.out.println("El programa debe terminar en FINPROG.");
                                System.exit(0);
                            } else {
                                tokenList.get(i).setBandera(true);
                                tokenList.get(j).setBandera(true);
                                break;
                            }
                        }
                    }
                    if (tokenList.get(i).isBandera()) {
                        if (tokenList.get(i+1).getStr().contains("[id]")) {
                            SENTS(tokenList, i+2, aux);
                        } else {
                            System.out.println("No se encuentra el identificador en la línea " + (i+1));            //Linea del .lex
                            System.exit(0);
                        }
                        
                    } else {
                        System.out.println("No se encontró FINPROG, línea " + i);               //Linea del .lex
                        System.exit(0);
                    }
                }
                if (tokenList.get(i).getStr().contains("FINPROG")) {
                    if (!tokenList.get(i).isBandera()) {
                        System.out.println("No contiene PROGRAMA, linea " + i);                 //Linea del .lex
                        System.exit(0);
                    }
                }
            }
            System.out.println("\nCOMPILACIÓN EXITOSA");
            lex.close();

        }
        catch (IOException e1){
            System.out.println("No se pudo acceder a los archivos");
        }
    }
    
    public void SENTS (ArrayList <Token> tokenList, int inicio, int fin) {
        List <String> keywords = Arrays.asList("SI", "REPITE", "IMPRIME", "LEE");
        for (int i = inicio; i < fin; i++) {
            if (tokenList.get(i).getStr().contains("[id]")&&!tokenList.get(i).isBandera()) {
                tokenList.get(i).setBandera(true);
                if (tokenList.get(i + 1).getStr().contains("=") ) {
                    tokenList.get(i+1).setBandera(true);
                    if ((((tokenList.get(i + 2).getStr().contains("[id]") || tokenList.get(i + 2).getStr().contains("[val]")) && tokenList.get(i+3).getStr().contains("[op_ar]") && (tokenList.get(i + 4).getStr().contains("[id]") || tokenList.get(i + 4).getStr().contains("[val]")) ))){
                        tokenList.get(i+2).setBandera(true);
                        tokenList.get(i+3).setBandera(true);
                        tokenList.get(i+4).setBandera(true);
                        continue;
                    }
                    if ((tokenList.get(i + 2).getStr().contains("[id]") || tokenList.get(i + 2).getStr().contains("[val]"))){
                        tokenList.get(i+2).setBandera(true);
                        continue;
                    }
                    System.out.println("Error: Identificador no igualado");
                    System.exit(0);
                } else {
                    System.out.println("Error no hay símbolo de asignación. " + i);
                    System.exit(0);
                }

            }
            //****************************REPITE***************
            int aux=0, checar = 0;
            if (tokenList.get(i).getStr().equals("REPITE")) {
                for (int j=i+1;j<tokenList.size();j++){
                    if (tokenList.get(j).getStr().equals("FINREP") && checar == 0){
                        tokenList.get(j).setBandera(true);
                        tokenList.get(i).setBandera(true);
                        aux = j;
                        break;
                    }
                    if (tokenList.get(j).getStr().equals("FINREP") && checar != 0) {
                        checar--;
                    }
                    if (tokenList.get(j).getStr().equals("REPITE")) {
                        checar++;
                    }
                }
                if (tokenList.get(i).isBandera()){
                    if(ELEM(tokenList.get(i+1).getStr()) && tokenList.get(i+2).getStr().equals("VECES")){
                        tokenList.get(i).setBandera(true);
                        tokenList.get(i+1).setBandera(true);
                        tokenList.get(i+2).setBandera(true);
                        if (tokenList.get(i+3).getStr().equals("FINREP")) {
                            System.out.println("No hay sentencias entre VECES y FINREP. " + i);
                            System.exit(0);
                        } else {
                            SENTS(tokenList, i+2, aux);
                        }
                        continue;
                    }
                    else {
                       System.out.println("Error. No se localizó una variable o un VECES " + i);
                       System.exit(0);
                    }
                }
            }
            if (tokenList.get(i).getStr().equals("FINREP") && !tokenList.get(i).isBandera()) {
                System.out.println("Error, un FINREP de más " + i);
                System.exit(0);
            }
            //****************************SI********************************
            if (tokenList.get(i).getStr().equals("SI")){
                if (COMPARA(tokenList, i + 1)) {
                    tokenList.get(i).setBandera(true);
                    tokenList.get(i+1).setBandera(true);
                    tokenList.get(i+2).setBandera(true);
                    tokenList.get(i+3).setBandera(true);
                    if (tokenList.get(i+4).getStr().equals("ENTONCES")) {
                        tokenList.get(i+4).setBandera(true);
                        checar = 0;
                        for (int uwu = i+5; uwu < tokenList.size(); uwu++) {
                            if (tokenList.get(uwu).getStr().equals("FINSI") && checar == 0) {
                                aux = uwu;
                                tokenList.get(uwu).setBandera(true);
                                break;
                            } else if (tokenList.get(uwu).getStr().equals("FINSI") && checar != 0) {
                                checar--;
                            }
                            if (tokenList.get(uwu).getStr().equals("SI")) {
                                checar++;
                            }
                        }
                    } else {
                        System.out.println("No hay un ENTONCES " + i);
                        System.exit(0);
                    }
                }
                if (tokenList.get(i).isBandera()) {
                    checar = 0;
                    for (int unu = i+4; unu < tokenList.size(); unu++) {
                        if (tokenList.get(unu).getStr().equals("SINO") && checar == 0) {
                            tokenList.get(unu).setBandera(true);
                            if ((unu - 1) == (i+4) || (unu + 1) == aux ) {
                                System.out.println("No hay sentencias entre SINO y FINSI o entre ENTONCES y SINO " + i);
                                System.exit(0);
                            } else {
                                SENTS(tokenList, i+4, unu);
                                SENTS(tokenList, unu+1, aux);
                            }
                            continue;
                        }
                    }
                }
                if (tokenList.get(i).isBandera()) {
                    if (COMPARA(tokenList, i+1) && tokenList.get(i+4).getStr().equals("ENTONCES")) {
                        if (tokenList.get(i+5).getStr().equals("FINSI")) {
                            System.out.println("No hay sentencias entre ENTONCES y FINSI " + i);
                            System.exit(0);
                        } else {
                            SENTS(tokenList, i+4 , aux);
                        }
                        continue;
                    } else {
                        System.out.println("Error comparando elementos " + i);
                        System.exit(0);
                    }
                }
            }

            //**************************************************************
            if (tokenList.get(i).getStr().contains("IMPRIME")) {
                if(!(tokenList.get(i+1).getStr().contains("[id]") || tokenList.get(i+1).getStr().contains("[val]") || tokenList.get(i+1).getStr().contains("[txt]"))) {
                    System.out.println("Error IMPRIME.");
                    System.exit(0);
                } else {
                    tokenList.get(i).setBandera(true);
                    tokenList.get(i+1).setBandera(true);
                }
            }
            if (tokenList.get(i).getStr().contains("LEE")) {
                if (!tokenList.get(i+1).getStr().contains("[id]")) {
                    System.out.println("Error LEE. " + i);
                    System.exit(0);
                } else {
                    tokenList.get(i).setBandera(true);
                    tokenList.get(i+1).setBandera(true);
                }
            }
            if (!tokenList.get(i).isBandera()) {
                System.out.println("Error, un " + tokenList.get(i).getStr() + " extra "+i);
                System.exit(0);
            }
        }
    }

    public boolean ELEM (String str) {
        if (str.contains("[id]") || str.equals("[val]")) {
            return true;
        }
        System.out.println(str + " no es elemento.");
        System.exit(0);
        return false;
    }

    
    public boolean COMPARA (ArrayList <Token> tokenList, int x) {
        if (tokenList.get(x).getStr().contains("[id]") && tokenList.get(x+1).getStr().equals("[op_rel]") && ELEM(tokenList.get(x+2).getStr())) {
            return true;
        }
        System.out.println("Error en atributos de compara. " + x);
        System.exit(0);
        return false;
    }
}