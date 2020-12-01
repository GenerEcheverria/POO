/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ryzen5
 */
public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana() throws IOException{
        setBounds(450,150,500,500); //Engloba a setLocation() y setSize()
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        setTitle("uwu");//Titulo de la ventana
        setResizable(true);//Establece si la ventana puede cambiar de tamano
        setMinimumSize(new Dimension(200,200));//Establece tamano minimo de la ventana
        this.getContentPane().setBackground(Color.BLACK);//Color de la ventana
        
        iniciarComponente();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponente() throws IOException{
        colocarPaneles();
       
        colocarBotones();
       
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        //panel.setBackground(Color.BLUE); //Establecemos el color del panel
        panel.setLayout(null);//Desactiva el diseno por defecto
        this.getContentPane().add(panel);//Agregamos un panel a la ventana
    }
    
    private void colocarPanel() throws IOException{
        
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
        item Item = new item ("casco");
        ImageIcon imagen = new ImageIcon(Item.getImage()); //2
        //JLabel etiqueta2 = new JLabel(imagen);
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80,80,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones() throws IOException{
       
        
        //Boton de imagen
        item Item = new item ("casco");
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,100);
        boton2.setBackground(Color.gray); //Color de fondo del boton
        ImageIcon play = new ImageIcon(Item.getImage());
        boton2.setIcon(new ImageIcon(play.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
    }
}
