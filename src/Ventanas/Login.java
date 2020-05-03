package Ventanas;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    private  String user = "";
    private  String pass = "";
    boolean status;
    private static Connection cConexion;
    
    public static Connection getcConexion(){
        return cConexion;
    }
    
    public static void closeConnection(){
        try {
            cConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        jButtonSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(java.awt.SystemColor.activeCaption);
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 130));

        Contraseña.setBackground(new java.awt.Color(204, 204, 204));
        Contraseña.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 270, 40));

        Usuario.setBackground(new java.awt.Color(204, 204, 204));
        Usuario.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 270, 40));

        jButtonSesion.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(204, 204, 204));
        jButtonSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar_1.png"))); // NOI18N
        jButtonSesion.setBorder(null);
        jButtonSesion.setBorderPainted(false);
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 160, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA LT2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabelFondo.setForeground(java.awt.SystemColor.control);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SIA fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
            
         status = true;
            user = Usuario.getText();
            pass = Contraseña.getText();
            String sUrl = "jdbc:postgresql://localhost:5433/SIA";  // sUrl de conexión
            String sUsr = Usuario.getText(); // Usuario
            String sPwd = Contraseña.getText();  // Contraseña
            try {
                Class.forName("org.postgresql.Driver");
                cConexion = DriverManager.getConnection(sUrl, sUsr, sPwd);
        }catch(org.postgresql.util.PSQLException e){
            new Invalido().setVisible(true);
            System.out.println(e.getMessage());
            status=false;
        }
            catch (SQLException e) {
            System.out.println("Error:" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro el driver");
            dispose();}
        if(status){
        Main m = new Main();
        m.setVisible(true);
        dispose();
        }
        
        status= true;
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
