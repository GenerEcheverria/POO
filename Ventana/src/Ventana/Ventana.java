
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana (){
        //setSize(500,500);//Tamano x,y
        //setLocation(450,150);//Cambiar la posicion inicial de la ventana
        setBounds(450,150,500,500); //Engloba a setLocation() y setSize()
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        setTitle("uwu");//Titulo de la ventana
        setResizable(true);//Establece si la ventana puede cambiar de tamano
        setMinimumSize(new Dimension(200,200));//Establece tamano minimo de la ventana
        this.getContentPane().setBackground(Color.BLACK);//Color de la ventana
        
        iniciarComponente();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
    }
    
    private void iniciarComponente(){
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        //panel.setBackground(Color.BLUE); //Establecemos el color del panel
        panel.setLayout(null);//Desactiva el diseno por defecto
        this.getContentPane().add(panel);//Agregamos un panel a la ventana
    }
    
    private void colocarEtiquetas(){
        //Etiqueta tipo texto
        JLabel etiqueta = new JLabel("Hola mi pana",SwingConstants.CENTER);
        //etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Centrar la alineacion horizontal del texto
        etiqueta.setOpaque(true); //Permite pintar el fondo de la etiqueta
        etiqueta.setBounds(100,100,200,30);
        etiqueta.setForeground(Color.white); //Color de la letra
        etiqueta.setBackground(Color.BLUE);
        
        etiqueta.setFont(new Font("arial",Font.BOLD,30));//Cambiar fuente de letra (Tipo,estilo,tamano)
        
        panel.add(etiqueta);
        
        //Etiqueta tipo imagen
        //JLabel etiqueta2 = new JLabel(new ImageIcon("Tulio.jpg")); //1
        
        ImageIcon imagen = new ImageIcon("Tulio.jpg"); //2
        //JLabel etiqueta2 = new JLabel(imagen);
        JLabel etiqueta2 = new JLabel();
        
        //JLabel etiqueta2 = new JLabel();
        //etiqueta2.setIcon(new ImageIcon("Tulio.jpg")); //3
        
        etiqueta2.setBounds(80,80,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("Aceptar");
        //boton1.setText("Hola"); //Establecer texto
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true); //Habilitar/Desactivar la funcion del boton
        boton1.setMnemonic('a');//alt+a = presionar el boton
        panel.add(boton1);
    }
}
