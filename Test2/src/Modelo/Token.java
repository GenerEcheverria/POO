/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author valey
 */
public class Token {
    private String str;
    private boolean bandera = false;

    public Token(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
}
