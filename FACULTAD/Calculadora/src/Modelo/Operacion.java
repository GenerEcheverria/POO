/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Aplicacion.Inicio;

/**
 *
 * @author Gener Echeverria
 * LIS POO 
 * 16/12/2020
 */
public class Operacion {
    private String cadenaOperacion;
    private float operando1;
    private float operando2;
    private String operador="";
    


    public Operacion(String cadenaOperacion) {
        this.cadenaOperacion = cadenaOperacion;
    }

    public String getCadenaOperacion() {
        return cadenaOperacion;
    }

    public void setCadenaOperacion(String cadenaOperacion) {
        this.cadenaOperacion = cadenaOperacion;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    
    
    public String dividirString (){
        try{
            int i;
            //2//2
            for (i=0;i<getCadenaOperacion().length();i++){
                String lugarOperador = Character.toString(getCadenaOperacion().charAt(i));
                if((lugarOperador.equals("+")&&i!=0)||(lugarOperador.equals("-")&&i!=0)||(lugarOperador.equals("*")&&i!=0)||(lugarOperador.equals("/")&&i!=0)||(lugarOperador.equals("%")&&i!=0)){
                    setOperador(lugarOperador);
                    break;
                }
            }
            if (!getCadenaOperacion().equals("")){
                setOperando1(Float.parseFloat(getCadenaOperacion().substring(0,i)));
            }
            if (!getOperador().equals("")){
                setOperando2(Float.parseFloat(getCadenaOperacion().substring(i+1,getCadenaOperacion().length())));
            }
            return resultado();
        }
        catch (NumberFormatException excep2){
            System.out.println(excep2.getMessage());
            StackTraceElement[] lista1 = excep2.getStackTrace();
            Errores unError = new Errores(lista1[0].getClassName(),lista1[0].getFileName(),lista1[0].getMethodName(),String.valueOf(lista1[0].getLineNumber()));
            Inicio.listaErrores.add(unError);
            return "Sintax ERROR";
        }
        
       
    }
    
    public String resultado(){
        try {
            if (getOperando1()==0&&getOperador().equals("")){
                return "";
            }else {
                switch (getOperador()){
                    case "+": return String.valueOf(getOperando1() + getOperando2());
                    case "-": return String.valueOf(getOperando1() - getOperando2());
                    case "*": return String.valueOf(getOperando1() * getOperando2());
                    case "/": 
                        if (getOperando2()==0){
                            throw new DivisionEntreCero("Division entre cero"); 
                        }
                        
                        return String.valueOf(getOperando1() / getOperando2());
                    case "%": return String.valueOf((getOperando1()*.01) *  getOperando2());
                    default : return String.valueOf((getOperando1()));
                }
            }
        }
        catch(DivisionEntreCero excep1){
            System.out.println(excep1.getMessage());
            StackTraceElement[] lista1 = excep1.getStackTrace();
            Errores unError = new Errores(lista1[0].getClassName(),lista1[0].getFileName(),lista1[0].getMethodName(),String.valueOf(lista1[0].getLineNumber()));
            Inicio.listaErrores.add(unError);
            return "Math ERROR";
        }
        
    }
}