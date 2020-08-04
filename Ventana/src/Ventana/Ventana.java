
package Ventana;

import javax.swing.JFrame;


public class Ventana extends JFrame{
    public Ventana (){
        //setSize(500,500);//Tamano x,y
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
        //setLocation(450,150);//Cambiar la posicion inicial de la ventana
        setBounds(450,150,500,500); //Engloba a setLocation() y setSize()
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        setTitle("uwu");//Titulo de la ventana
    }
    
}
