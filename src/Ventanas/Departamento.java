/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.Main.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ojosu
 */
public class Departamento extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    Connection cConexion;  // La conexión
    Statement st;
    
    void cargar() {
        nombretxt.setText(nombre);
        coddptotxt.setText(cod);
    }

    public Departamento() {
        try {
            Class.forName("org.postgresql.Driver");

            cConexion = Login.getcConexion();
        } catch (Exception e) {

        }
        initComponents();
        this.setLocationRelativeTo(null);
        cargar();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelNocontrol = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        coddptotxt = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(153, 255, 153));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 70, 20));

        jLabelTitle.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabelTitle.setText("FORMULARIO - DEPARTAMENTO");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelNocontrol.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelNocontrol.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNocontrol.setText("CODDPTO");
        getContentPane().add(jLabelNocontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setText("NOMBRE :");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        nombretxt.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 330, -1));

        coddptotxt.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(coddptotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 330, -1));

        jButtonGuardar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonGuardar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jButtondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete Icon.png"))); // NOI18N
        jButtondelete.setContentAreaFilled(false);
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 70, 70));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            // TODO add your handling code here:
            String sql = "select agregarDepartamento('" + coddptotxt.getText() + "','" + nombretxt.getText() + "')";
            st = cConexion.createStatement();
            st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        try {
            // TODO add your handling code here:
            String sql = "delete from departamento where coddpto = '" + coddptotxt.getText() + "'";
            st = cConexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtondeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Departamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField coddptotxt;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNocontrol;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}