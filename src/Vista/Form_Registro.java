/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Bd.Conexion;
import Controlador.RegistroUsuario;
import Modelo.Usuario;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.awt.Dimension;


/**
 *
 * @author Hernán
 */
public class Form_Registro extends javax.swing.JFrame {
    
    
    /**
     * Creates new form FormRegistro
     */
    public Form_Registro() {
        initComponents();
        
        this.jlbl_email.setVisible(false);
        
        this.setMinimumSize(new Dimension(650, 700));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt_nombreUsuario = new javax.swing.JTextField();
        jlbl_nombre = new javax.swing.JLabel();
        jtxt_correo = new javax.swing.JTextField();
        jlbl_correo = new javax.swing.JLabel();
        jlbl_email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbl_contraseña = new javax.swing.JLabel();
        jlbl_Rcontrasena = new javax.swing.JLabel();
        jpass_contraseña = new javax.swing.JPasswordField();
        jpass_repeatContraseña = new javax.swing.JPasswordField();
        jbtn_cancelar = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_nombreUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxt_nombreUsuario.setActionCommand("<Not Set>");
        jtxt_nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jtxt_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 258, 30));

        jlbl_nombre.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jlbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_nombre.setText("Nombre de usuario:");
        getContentPane().add(jlbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 223, -1, 30));

        jtxt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_correoActionPerformed(evt);
            }
        });
        jtxt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxt_correoKeyReleased(evt);
            }
        });
        getContentPane().add(jtxt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 258, 30));

        jlbl_correo.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jlbl_correo.setText("Correo electronico:");
        getContentPane().add(jlbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jlbl_email.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlbl_email.setForeground(new java.awt.Color(255, 0, 0));
        jlbl_email.setText("Email invalido(*)");
        getContentPane().add(jlbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 410, 45));

        jlbl_contraseña.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jlbl_contraseña.setText("Contraseña:");
        getContentPane().add(jlbl_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jlbl_Rcontrasena.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jlbl_Rcontrasena.setText("Repita Contraseña:");
        getContentPane().add(jlbl_Rcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        getContentPane().add(jpass_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 258, 30));
        getContentPane().add(jpass_repeatContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 258, 30));

        jbtn_cancelar.setText("CANCELAR");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, -1, -1));

        jbtn_guardar.setText("GUARDAR");
        jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro-en-linea.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 130, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarActionPerformed

        String nombreUsuario = this.jtxt_nombreUsuario.getText();
        String correoElectronico = this.jtxt_correo.getText();
        String contrasena = String.valueOf(jpass_contraseña.getPassword());
        String Rcontrasena = String.valueOf(jpass_repeatContraseña.getPassword());

        if (this.jtxt_nombreUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo 'Nombre de usuario' no debe estar vacio", "Registro de usuario", 0);
            this.jtxt_nombreUsuario.requestFocus();
            return;
        }
        if (this.jtxt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo 'Correo electronico' no debe estar vacio", "Registro de usuario", 0);
            this.jtxt_correo.requestFocus();
            return;
        }
        if (!contrasena.equals(Rcontrasena)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales, vuelva a intentar", "Registro de usuario", 0);
            System.out.println(contrasena);
            System.out.println(Rcontrasena);
            return;
        }

        Usuario usuario = new Usuario(nombreUsuario, correoElectronico, contrasena);
        RegistroUsuario reg = new RegistroUsuario();

        if (reg.AgregarUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Registro de usuario exitoso!", "Registro de usuario", 3);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo completar el registro, vuelva a intentar", "Registro de usuario", 0);
        }

    }//GEN-LAST:event_jbtn_guardarActionPerformed

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        FormLogin log = new FormLogin();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jtxt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_correoKeyReleased
        //EL KEY RELEASED ES PARA IR VERIFICANDO A MEDIDA QUE SE VA ESCRIBIENDO EN EL CAMPO DEL EMAIL
        RegistroUsuario reg = new RegistroUsuario();
        if (reg.verificadorCorreo(jtxt_correo.getText())) {
            jlbl_email.setVisible(false);
        }else{
            jlbl_email.setVisible(true);
        }
    }//GEN-LAST:event_jtxt_correoKeyReleased

    private void jtxt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_correoActionPerformed

    private void jtxt_nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_guardar;
    private javax.swing.JLabel jlbl_Rcontrasena;
    private javax.swing.JLabel jlbl_contraseña;
    private javax.swing.JLabel jlbl_correo;
    private javax.swing.JLabel jlbl_email;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JPasswordField jpass_contraseña;
    private javax.swing.JPasswordField jpass_repeatContraseña;
    private javax.swing.JTextField jtxt_correo;
    private javax.swing.JTextField jtxt_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
