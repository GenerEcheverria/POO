/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gener Echeverria
 * LIS POO 
 * 16/12/2020
 */
public class Errores {
    private String clase;
    private String archivo;
    private String metodo;
    private String linea;

    public Errores(String clase, String archivo, String metodo, String linea) {
        this.clase = clase;
        this.archivo = archivo;
        this.metodo = metodo;
        this.linea = linea;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    
}
