/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.*;
import com.kingaspx.main.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ojosu
 */
public class Main extends javax.swing.JFrame {

    Connection cConexion;
    ResultSet result;
    java.sql.Statement st;
    private Menu m;
    public static String nocontrol, nombre, apa, ama, semestre, cod;

    
    
    void getConexion() {
        try {
            Class.forName("org.postgresql.Driver");

            cConexion = Login.getcConexion();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Main() {
        getConexion();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    void desconectar() throws SQLException {
        Login.closeConnection();
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
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCerrarSesión = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonScan = new javax.swing.JButton();
        jOpcion = new javax.swing.JComboBox<>();
        jLabelFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 70, 20));

        jLabelTitle.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabelTitle.setText("SISTEMA DE IDENTIFICACIÓN DE ALUMNOS.");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1270, 10));

        jButtonCerrarSesión.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCerrarSesión.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonCerrarSesión.setText("CERRAR SESIÓN");
        jButtonCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesiónActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 40));

        jTextBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jTextBuscar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 360, 40));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_1.png"))); // NOI18N
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 60, 60));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO 100.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 450, 250));

        jButtonAgregar.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAgregar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 160, 40));

        jButtonScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ScanIcon.png"))); // NOI18N
        jButtonScan.setContentAreaFilled(false);
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 60, 60));

        jOpcion.setBackground(new java.awt.Color(0, 153, 153));
        jOpcion.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Docente", "Proveedor", "Carrera", "Departamento" }));
        jOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcionActionPerformed(evt);
            }
        });
        getContentPane().add(jOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 140, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        try {
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            // TODO add your handling code here:
            String sql;
            nombre = nocontrol = apa = ama = semestre = cod = "";
            String opc = jOpcion.getItemAt(jOpcion.getSelectedIndex());

            switch (opc) {
                case "Alumno":
                    st = cConexion.createStatement();
                    sql = "Select * from " + jOpcion.getItemAt(jOpcion.getSelectedIndex()) + " where no_control = '" + jTextBuscar.getText() + "'";
                    result = st.executeQuery(sql);
                    while (result.next()) {
                        nocontrol = result.getString("no_control");

                        nombre = result.getString("nombre");

                        apa = result.getString("ape_pat");

                        ama = result.getString("ape_mat");

                        semestre = result.getString("semestre");

                        cod = result.getString("codcarrera");

                    }
                    Formulario a = new Formulario();
                    a.setVisible(true);
                    this.dispose();
                    break;
                case "Docente":
                    st = cConexion.createStatement();
                    sql = "Select * from " + jOpcion.getItemAt(jOpcion.getSelectedIndex()) + " where no_control = '" + jTextBuscar.getText() + "'";
                    result = st.executeQuery(sql);
                    while (result.next()) {
                        nocontrol = result.getString("no_control");

                        nombre = result.getString("nombre");

                        apa = result.getString("ape_pat");

                        ama = result.getString("ape_mat");

                        cod = result.getString("coddpto");

                    }
                    Docente d = new Docente();
                    d.setVisible(true);
                    this.dispose();
                    break;
                case "Proveedor":
                    st = cConexion.createStatement();
                    sql = "Select * from " + jOpcion.getItemAt(jOpcion.getSelectedIndex()) + " where no_control = '" + jTextBuscar.getText() + "'";
                    result = st.executeQuery(sql);
                    while (result.next()) {
                        nocontrol = result.getString("no_control");

                        nombre = result.getString("nombre");

                        cod = result.getString("coddpto");

                    }
                    Proveedor p = new Proveedor();
                    p.setVisible(true);
                    this.dispose();
                    break;
                case "Carrera":
                    st = cConexion.createStatement();
                    sql = "select * from carrera where codcarrera = '" + jTextBuscar.getText() + "'";
                    result = st.executeQuery(sql);
                    while (result.next()) {
                        cod = result.getString("codcarrera");
                        nombre = result.getString("nombre");
                    }
                    new Carrera().setVisible(true);
                    this.dispose();
                    break;
                case "Departamento":
                    st = cConexion.createStatement();
                    sql = "select * from departamento where coddpto = '" + jTextBuscar.getText() + "'";
                    result = st.executeQuery(sql);
                    while (result.next()) {
                        cod = result.getString("coddpto");
                        nombre = result.getString("nombre");
                    }
                    new Departamento().setVisible(true);
                    this.dispose();
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesiónActionPerformed
        try {
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesiónActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        String opc = jOpcion.getItemAt(jOpcion.getSelectedIndex());

        switch (opc) {
            case "Alumno":
                Formulario a = new Formulario();
                a.setVisible(true);
                this.dispose();
                break;
            case "Docente":
                Docente d = new Docente();
                d.setVisible(true);
                this.dispose();
                break;
            case "Proveedor":
                Proveedor p = new Proveedor();
                p.setVisible(true);
                this.dispose();
                break;
            case "Carrera":
                Carrera c = new Carrera();
                c.setVisible(true);
                this.dispose();
                break;
            case "Departamento":
                Departamento dp = new Departamento();
                dp.setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed
        m = new Menu();
        m.setVisible(true);

    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcionActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCerrarSesión;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JComboBox<String> jOpcion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}