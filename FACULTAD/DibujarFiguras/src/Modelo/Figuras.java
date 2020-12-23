/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Inicio;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author valey
 */
public class Figuras {
    //Método para dibujar una linea
    public static void lineas(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.BLUE);
        g.drawLine(x1, y1, x2, y2);
    }
    
    public static void rectangulos(Graphics g, int x1, int y1, int width, int height) {
        g.setColor(Color.RED);
        g.drawRect(x1, y1, width, height);
    }
    
}
