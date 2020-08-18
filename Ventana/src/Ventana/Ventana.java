
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
        //colocarBotones();
        //colocarRadioBotones();
        //colocarCajasDeTexto();
        //colocarAreaTexto();
        colocarListaDesplegable();
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
        //Boton de texto
        JButton boton1 = new JButton("Aceptar");
        //boton1.setText("Hola"); //Establecer texto
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true); //Habilitar/Desactivar la funcion del boton
        boton1.setMnemonic('a');//alt+a = presionar el boton
        boton1.setForeground(Color.blue);//Color de la letra del boton
        boton1.setFont(new Font("times new roman",Font.BOLD,13));//Fuente de la letra del boton
        
        panel.add(boton1);
        
        //Boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,100);
        boton2.setBackground(Color.gray); //Color de fondo del boton
        ImageIcon play = new ImageIcon("play.png");
        boton2.setIcon(new ImageIcon(play.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton ("Opcion 1", true);
        radioBoton1.setBounds(100,100,100,50);
        radioBoton1.setEnabled(false);//Activar/Desactivar boton
        radioBoton1.setText("Suculencia");
        radioBoton1.setFont(new Font("Arial",2,20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton ("Opcion 2", false);
        radioBoton2.setBounds(100,150,100,50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton ("Opcion 3", false);
        radioBoton3.setBounds(100,200,100,50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup ();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(100,100,100,20);
        cajaTexto.setText("Hola");
        panel.add(cajaTexto);
        
        System.out.println("El mensaje es: " + cajaTexto.getText());
    }
    
    private void colocarAreaTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(100,100,200,200);
        areaTexto.setText("Escriba el texto aqui..");
        areaTexto.append("\nEscribe mas aqui..");//Agrega mas texto
        areaTexto.setEditable(false);//Activa/Desactiva edicion de la caja de texto
        
        System.out.println("El texto es: " + areaTexto.getText());
        panel.add(areaTexto);
    }
    
    private void colocarListaDesplegable(){
        String [] paises = {"Mexico", "Colombia", "Argentina"};
        JComboBox listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(20,20,100,30);
        listaDesplegable.addItem("Chile");
        listaDesplegable.setSelectedItem("Chile");
        panel.add(listaDesplegable);
        
    }
}
