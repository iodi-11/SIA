/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.Main.*;
import com.chillyfacts.com.QR_Generate;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ojosu
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    Connection cConexion;  // La conexión
    java.sql.Statement st;
    
    
    void cargar(){
        apemattxt.setText(Main.ama);apepattxt.setText(Main.apa);codcarreratxt.setText(Main.cod);nocontroltxt.setText(Main.nocontrol);nombretxt.setText(Main.nombre);semestretxt.setText(Main.semestre);
        nombre=nocontrol=apa=ama=semestre=cod="";
    }
    
    public Formulario() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            Class.forName("org.postgresql.Driver");
            
            cConexion = Login.getcConexion();
        } catch (Exception e) {
        }
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
        jLabelApePat = new javax.swing.JLabel();
        jLabelApeMat = new javax.swing.JLabel();
        jLabelSemestre = new javax.swing.JLabel();
        jLabelCarrera = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        apepattxt = new javax.swing.JTextField();
        apemattxt = new javax.swing.JTextField();
        semestretxt = new javax.swing.JTextField();
        codcarreratxt = new javax.swing.JTextField();
        nocontroltxt = new javax.swing.JTextField();
        jButtonGenerarQR = new javax.swing.JButton();
        jLabelQR = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1630, 670));
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
        jLabelTitle.setText("FORMULARIO - ALUMNO");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelNocontrol.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelNocontrol.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNocontrol.setText("NO. CONTROL :");
        getContentPane().add(jLabelNocontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setText("NOMBRE :");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabelApePat.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelApePat.setForeground(new java.awt.Color(51, 51, 51));
        jLabelApePat.setText("APELLIDO PATERNO :");
        getContentPane().add(jLabelApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabelApeMat.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelApeMat.setForeground(new java.awt.Color(51, 51, 51));
        jLabelApeMat.setText("APELLIDO MATERNO :");
        getContentPane().add(jLabelApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabelSemestre.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelSemestre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelSemestre.setText("SEMESTRE :");
        getContentPane().add(jLabelSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabelCarrera.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabelCarrera.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCarrera.setText("CODCARRERA :");
        getContentPane().add(jLabelCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        nombretxt.setBackground(new java.awt.Color(204, 204, 204));
        nombretxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 330, -1));

        apepattxt.setBackground(new java.awt.Color(204, 204, 204));
        apepattxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        apepattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apepattxtActionPerformed(evt);
            }
        });
        getContentPane().add(apepattxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 330, -1));

        apemattxt.setBackground(new java.awt.Color(204, 204, 204));
        apemattxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        apemattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apemattxtActionPerformed(evt);
            }
        });
        getContentPane().add(apemattxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 330, -1));

        semestretxt.setBackground(new java.awt.Color(204, 204, 204));
        semestretxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        semestretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestretxtActionPerformed(evt);
            }
        });
        getContentPane().add(semestretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 330, -1));

        codcarreratxt.setBackground(new java.awt.Color(204, 204, 204));
        codcarreratxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        codcarreratxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codcarreratxtActionPerformed(evt);
            }
        });
        getContentPane().add(codcarreratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 330, -1));

        nocontroltxt.setBackground(new java.awt.Color(204, 204, 204));
        nocontroltxt.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        nocontroltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nocontroltxtActionPerformed(evt);
            }
        });
        getContentPane().add(nocontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 330, -1));

        jButtonGenerarQR.setBackground(new java.awt.Color(153, 255, 153));
        jButtonGenerarQR.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonGenerarQR.setText("GENERAR");
        jButtonGenerarQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarQRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jLabelQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIAPrueba1.png"))); // NOI18N
        getContentPane().add(jLabelQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonGuardar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, -1));

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete Icon.png"))); // NOI18N
        jButtonDelete.setContentAreaFilled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 60, 60));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        new Main().setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGenerarQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarQRActionPerformed
        QR_Generate g = new QR_Generate();
        g.setNo_control(nocontroltxt.getText());
        g.generate();
    }//GEN-LAST:event_jButtonGenerarQRActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new Main().setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void semestretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestretxtActionPerformed

    private void apepattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apepattxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apepattxtActionPerformed

    private void apemattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apemattxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apemattxtActionPerformed

    private void codcarreratxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codcarreratxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codcarreratxtActionPerformed

    private void nocontroltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nocontroltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nocontroltxtActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql="select agregarAlumno('"+nocontroltxt.getText()+"','"+nombretxt.getText()+"','"+apepattxt.getText()+"','"+apemattxt.getText()+"',"+semestretxt.getText()+",'"+codcarreratxt.getText()+"')";
            st = cConexion.createStatement();
            st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql = "delete from alumno where no_control = '"+nocontroltxt.getText()+"'";
            st = cConexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apemattxt;
    private javax.swing.JTextField apepattxt;
    private javax.swing.JTextField codcarreratxt;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonGenerarQR;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelApeMat;
    private javax.swing.JLabel jLabelApePat;
    private javax.swing.JLabel jLabelCarrera;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNocontrol;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelQR;
    private javax.swing.JLabel jLabelSemestre;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField nocontroltxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField semestretxt;
    // End of variables declaration//GEN-END:variables
}
