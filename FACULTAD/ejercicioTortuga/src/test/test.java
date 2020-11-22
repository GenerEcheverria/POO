/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import galapagos.Turtle;
import galapagos.TurtleDrawingWindow;
import java.awt.Color;

/**
 *
 * @author Jesus Estrella
 */
public class test
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //crear tortugas
        Turtle                winky, tinky, pinky;
        TurtleDrawingWindow   playground;
        
        int      size, turn;
        
        
        playground = new TurtleDrawingWindow( );
        playground.setVisible( true );
        
        //mostrar trotugas
        
        winky   = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        tinky   = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        pinky   = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        playground.add(winky);
        playground.add(tinky);
        playground.add(pinky);
        
        //Colores de torturgas
        winky.bodyColor( Color.blue );
        tinky.bodyColor( Color.yellow );
        pinky.bodyColor( Color.red );
        
        //Colores de trazos
        winky.penColor(Color.BLUE);
        tinky.penColor(Color.YELLOW);
        pinky.penColor(Color.RED);
    
        
        size     = 50;          
        turn     = 90;            
       
        //Ruta de winky
        winky.pause( );
        winky.move(size);
        winky.turn(120);
        winky.move(size);
        winky.turn(120);
        winky.move(size);
        //Ruta de tinky
        tinky.pause( );
        tinky.turn(180);
        tinky.move(size);
        tinky.turn(-120);
        tinky.move(size);
        tinky.turn(-120);
        tinky.move(size);
        
        //Ruta y posicion de pinky
        pinky.pause();
        pinky.jumpTo(1,44);
        pinky.move(25);
        pinky.turn(120);
        pinky.move(size);
        pinky.turn(120);
        pinky.move(size);
        pinky.turn(120);
        pinky.move(27);
        pinky.jumpTo(0,0);
        
        //Se mueven juntas
        winky.start( );
        tinky.start( );
        pinky.start( );
       
        
    }
    
}
