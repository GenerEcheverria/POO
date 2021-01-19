/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Aplicacion.GestionCxP;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryzen5
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public FrmInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEmpleado = new javax.swing.JMenu();
        menuIAsalariado = new javax.swing.JMenuItem();
        menuIBase = new javax.swing.JMenuItem();
        menuIComision = new javax.swing.JMenuItem();
        menuIPorHoras = new javax.swing.JMenuItem();
        menuCxP = new javax.swing.JMenu();
        menuIFactura = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        menuItemPagos = new javax.swing.JMenuItem();
        menuISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("Sistema de cuentas por pagar");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/test.jpg"))); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 376, 280));

        menuEmpleado.setText("Empleado");

        menuIAsalariado.setText("Asalariado");
        menuIAsalariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIAsalariadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuIAsalariado);

        menuIBase.setText("Base mas comision");
        menuIBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIBaseActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuIBase);

        menuIComision.setText("Por comision");
        menuIComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIComisionActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuIComision);

        menuIPorHoras.setText("Por horas");
        menuIPorHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIPorHorasActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuIPorHoras);

        jMenuBar1.add(menuEmpleado);

        menuCxP.setText("Cuentas por pagar");

        menuIFactura.setText("Factura");
        menuIFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIFacturaActionPerformed(evt);
            }
        });
        menuCxP.add(menuIFactura);

        jMenuBar1.add(menuCxP);

        menuOpciones.setText("Opciones");

        menuItemPagos.setText("Pagos");
        menuItemPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPagosActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemPagos);

        menuISalir.setText("Salir");
        menuISalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuISalirMouseClicked(evt);
            }
        });
        menuISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuISalirActionPerformed(evt);
            }
        });
        menuOpciones.add(menuISalir);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIAsalariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIAsalariadoActionPerformed
        // TODO add your handling code here:
        new FrmAsalariado().setVisible(true);
    }//GEN-LAST:event_menuIAsalariadoActionPerformed

    private void menuIBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIBaseActionPerformed
        // TODO add your handling code here:
        new FrmBaseMasComision().setVisible(true);
    }//GEN-LAST:event_menuIBaseActionPerformed

    private void menuIComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIComisionActionPerformed
        // TODO add your handling code here:
        new FrmPorComision().setVisible(true);
    }//GEN-LAST:event_menuIComisionActionPerformed

    private void menuIPorHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIPorHorasActionPerformed
        // TODO add your handling code here:
        new FrmPorHoras().setVisible(true);
    }//GEN-LAST:event_menuIPorHorasActionPerformed

    private void menuISalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuISalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuISalirMouseClicked

    private void menuISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuISalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try{
            FileOutputStream archivo =new FileOutputStream("Pagos.txt");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(GestionCxP.listaPorPagar);
            salida.close();
        }
        catch(IOException e1){
            JOptionPane.showMessageDialog(rootPane, "Prpblemas al guardar");
        }
    }//GEN-LAST:event_menuISalirActionPerformed

    private void menuIFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIFacturaActionPerformed
        // TODO add your handling code here:
        new FrmFactura().setVisible(true);
    }//GEN-LAST:event_menuIFacturaActionPerformed

    private void menuItemPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPagosActionPerformed
        // TODO add your handling code here:
        new FrmConsulta().setVisible(true);
    }//GEN-LAST:event_menuItemPagosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu menuCxP;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenuItem menuIAsalariado;
    private javax.swing.JMenuItem menuIBase;
    private javax.swing.JMenuItem menuIComision;
    private javax.swing.JMenuItem menuIFactura;
    private javax.swing.JMenuItem menuIPorHoras;
    private javax.swing.JMenuItem menuISalir;
    private javax.swing.JMenuItem menuItemPagos;
    private javax.swing.JMenu menuOpciones;
    // End of variables declaration//GEN-END:variables
}