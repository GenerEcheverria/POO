/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Aplicacion.Inicio;
import Modelo.Errores;
import Modelo.Operacion;

/**
 *
 * @author Gener Echeverria
 * LIS POO 
 * 16/12/2020
 */
public class FrmCalculadora extends javax.swing.JFrame {
    
    
    public FrmCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mostrarOperaciones = new javax.swing.JLabel();
        mostrarResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSeis = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnClearOne = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnErrores = new javax.swing.JMenu();
        btnTbErrores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setName("Calculadora"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 48, 51));

        mostrarOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        mostrarOperaciones.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        mostrarOperaciones.setForeground(new java.awt.Color(238, 237, 237));
        mostrarOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        mostrarResultado.setBackground(new java.awt.Color(255, 255, 255));
        mostrarResultado.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        mostrarResultado.setForeground(new java.awt.Color(238, 237, 237));
        mostrarResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(mostrarOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(mostrarOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 110));

        jPanel2.setBackground(new java.awt.Color(32, 33, 36));

        btnSeis.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(238, 237, 237));
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorderPainted(false);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeisMouseClicked(evt);
            }
        });

        btnCuatro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(238, 237, 237));
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setBorderPainted(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuatroMouseClicked(evt);
            }
        });

        btnUno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(238, 237, 237));
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnUno.setText("1");
        btnUno.setBorderPainted(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnoMouseClicked(evt);
            }
        });

        btnNueve.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(238, 237, 237));
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnNueve.setText("9");
        btnNueve.setToolTipText("");
        btnNueve.setBorderPainted(false);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNueveMouseClicked(evt);
            }
        });

        btnCero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(238, 237, 237));
        btnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnCero.setText("0");
        btnCero.setBorderPainted(false);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCeroMouseClicked(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(238, 237, 237));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorderPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(238, 237, 237));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorderPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestaMouseClicked(evt);
            }
        });

        btnClearOne.setFont(new java.awt.Font("Dialog", 0, 23)); // NOI18N
        btnClearOne.setForeground(new java.awt.Color(238, 237, 237));
        btnClearOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnClearOne.setText("←");
        btnClearOne.setBorderPainted(false);
        btnClearOne.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClearOne.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnClearOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearOneMouseClicked(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(238, 237, 237));
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorderPainted(false);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCincoMouseClicked(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(238, 237, 237));
        btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnMultiplicar.setText("X");
        btnMultiplicar.setBorderPainted(false);
        btnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseClicked(evt);
            }
        });

        btnOcho.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(238, 237, 237));
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnOcho.setText("8");
        btnOcho.setBorderPainted(false);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOchoMouseClicked(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(238, 237, 237));
        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnDividir.setText("/");
        btnDividir.setBorderPainted(false);
        btnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDividirMouseClicked(evt);
            }
        });

        btnDos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(238, 237, 237));
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnDos.setText("2");
        btnDos.setBorderPainted(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDosMouseClicked(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(238, 237, 237));
        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnTres.setText("3");
        btnTres.setBorderPainted(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTresMouseClicked(evt);
            }
        });

        btnSiete.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(238, 237, 237));
        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnSiete.setText("7");
        btnSiete.setBorderPainted(false);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSieteMouseClicked(evt);
            }
        });

        btnPorcentaje.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(238, 237, 237));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorderPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnPorcentaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPorcentajeMouseClicked(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(238, 237, 237));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorderPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumaMouseClicked(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(238, 237, 237));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/black.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorderPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPuntoMouseClicked(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(238, 237, 237));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/blue.png"))); // NOI18N
        btnClear.setText("C");
        btnClear.setBorderPainted(false);
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnImage/gray.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnClearOne, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearOne, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 350));

        btnErrores.setBackground(new java.awt.Color(45, 48, 51));
        btnErrores.setText("Errores");
        btnErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErroresActionPerformed(evt);
            }
        });

        btnTbErrores.setText("Consulta de errores");
        btnTbErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTbErroresActionPerformed(evt);
            }
        });
        btnErrores.add(btnTbErrores);

        jMenuBar1.add(btnErrores);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnoMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"1");
        btnIgual.doClick();
    }//GEN-LAST:event_btnUnoMouseClicked

    private void btnDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDosMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"2");
        btnIgual.doClick();
    }//GEN-LAST:event_btnDosMouseClicked

    private void btnTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTresMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"3");
        btnIgual.doClick();
    }//GEN-LAST:event_btnTresMouseClicked

    private void btnCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuatroMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"4");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCuatroMouseClicked

    private void btnCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCincoMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"5");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCincoMouseClicked

    private void btnSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeisMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"6");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSeisMouseClicked

    private void btnSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSieteMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"7");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSieteMouseClicked

    private void btnOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOchoMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"8");
        btnIgual.doClick();
    }//GEN-LAST:event_btnOchoMouseClicked

    private void btnNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNueveMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"9");
        btnIgual.doClick();
    }//GEN-LAST:event_btnNueveMouseClicked

    private void btnPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+".");
        btnIgual.doClick();
    }//GEN-LAST:event_btnPuntoMouseClicked

    private void btnClearOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearOneMouseClicked
        // TODO add your handling code here:
        String texto = "";
        if (mostrarOperaciones.getText().length()>0){
            texto = mostrarOperaciones.getText().substring(0, mostrarOperaciones.getText().length()-1);
        }
        mostrarOperaciones.setText(texto);
        mostrarResultado.setText("");
        //btnIgual.doClick();
    }//GEN-LAST:event_btnClearOneMouseClicked

    private void btnSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumaMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"+");
    }//GEN-LAST:event_btnSumaMouseClicked

    private void btnRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaMouseClicked
        // TODO add your handling code here:
        
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"-");
        
    }//GEN-LAST:event_btnRestaMouseClicked

    private void btnMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseClicked
        // TODO add your handling code here:
        
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"*");
        
        
    }//GEN-LAST:event_btnMultiplicarMouseClicked

    private void btnDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseClicked
        // TODO add your handling code here:
        
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"/");
       
    }//GEN-LAST:event_btnDividirMouseClicked

    private void btnPorcentajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorcentajeMouseClicked
        // TODO add your handling code here:
        
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"%");
        
    }//GEN-LAST:event_btnPorcentajeMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText("");
        this.mostrarResultado.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnCeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCeroMouseClicked
        // TODO add your handling code here:
        this.mostrarOperaciones.setText(mostrarOperaciones.getText()+"0");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCeroMouseClicked

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        Operacion operacion = new Operacion(mostrarOperaciones.getText());

        
        this.mostrarResultado.setText(operacion.dividirString());
        
        
       //TEST ERRORES TABLA 
      // Errores unError = new Errores("1", "1", "1", "1");
       //Inicio.listaErrores.add(unError);
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErroresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnErroresActionPerformed

    private void btnTbErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTbErroresActionPerformed
        // TODO add your handling code here:
        FrmTbErrores frmTbErrores = new FrmTbErrores();
        frmTbErrores.setVisible(true);
    }//GEN-LAST:event_btnTbErroresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearOne;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JMenu btnErrores;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenuItem btnTbErrores;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrarOperaciones;
    private javax.swing.JLabel mostrarResultado;
    // End of variables declaration//GEN-END:variables
}
