
package Paquetes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class eventos extends JFrame{
    private JPanel panel;
    private JTextField cajaTexto;
    private JLabel saludo;
    private JButton boton;
    private JTextArea areaTexto;
    
    public eventos (){
        setBounds(450,300,500,500);
        setLocationRelativeTo(null);
        setTitle("Prueba de eventos");
        this.getContentPane().setBackground(Color.BLACK);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
       //colocarEtiquetas();
        colocarCajaTexto();
        colocarAreaTexto();
        //colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("Bienvenido",SwingConstants.CENTER);
        etiqueta.setBounds(100, 50, 100,30);
        etiqueta.setFont(new Font("Arial",2,20));
        panel.add(etiqueta);
        
    }
    
    private void colocarCajaTexto(){
        cajaTexto = new JTextField("Escribe tu nombre");
        cajaTexto.setBounds(100,100,200,30);
        panel.add(cajaTexto);
        
        eventoDelTeclado();
    }
    
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(50,50,150,300);
        panel.add(areaTexto);
    }
    
    private void colocarBoton(){
        boton = new JButton("Confirmar");
        boton.setBounds(200,150,100,30);
        boton.setBackground(Color.gray);
        boton.setFont(new Font("Arial",0,15));
        panel.add(boton);
        
        //eventoOyenteDeAccion();
        eventoOyenteDeRaton();
        
        /*saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font ("arial",1,40));
        panel.add(saludo);*/
        
    }
    
    private void eventoOyenteDeAccion(){
        //Evento ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
    
    private void eventoOyenteDeRaton(){
        //Oyente de raton
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                areaTexto.append("MouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                areaTexto.append("MousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                areaTexto.append("MouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                areaTexto.append("MouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                areaTexto.append("MouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }
    
    private void eventoDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //areaTexto.append("keyTyped\n");//caracteres unicode
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //areaTexto.append("keyReleased\n");
                if (ke.getKeyChar() == 'a'){
                    areaTexto.append("a\n");
                }
                if (ke.getKeyChar() == ' '){
                    areaTexto.append("Espacio\n");
                }
                if (ke.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
            }
        };
        
        cajaTexto.addKeyListener(eventoTeclado);
    }
}
