package Vista;

import Bd.Conexion;
import javax.swing.JOptionPane;
import Controlador.RegistroUsuario;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author carlosabarca
 */
public class FormLogin extends javax.swing.JFrame {

   Conexion cnx = new Conexion();
    public FormLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt_usuario = new javax.swing.JTextField();
        jpass_contrasena = new javax.swing.JPasswordField();
        jbtn_registro = new javax.swing.JButton();
        jbtn_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbl_leerMas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jtxt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 190, 40));
        getContentPane().add(jpass_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 190, 40));

        jbtn_registro.setText("REGISTRARSE");
        jbtn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registroActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jbtn_ingresar.setText("INGRESAR");
        jbtn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libro (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jlbl_leerMas.setForeground(new java.awt.Color(0, 102, 255));
        jlbl_leerMas.setText("LEER MAS");
        jlbl_leerMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_leerMasMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_leerMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresarActionPerformed
        try{
        String nombreUsuario = this.jtxt_usuario.getText();
        String contrasena = String.valueOf(jpass_contrasena.getPassword());//A ESTO SE LE DENOMINA "CASTING", DONDE ESTO DEVUELVE UN ARREGLO DE CARACTERERES Y ESE ARREGLO SE CONVIERTE EN UN STRING
        RegistroUsuario reg = new RegistroUsuario();
        String queryUser = "SELECT * FROM usuario WHERE nombreUsuario = '"+nombreUsuario+"' AND contrasena = '"+contrasena+"'";
        Statement stm = cnx.obtenerConexion().createStatement();      
        ResultSet rs = stm.executeQuery(queryUser);
        
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Ingreso de usuario exitoso!","Usuario correcto",1);
                Form_Menu menu = new Form_Menu();
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos!","Usuario no valido",0);

            }
        }catch(SQLException e){
            System.out.println("Error al conectar con la base de datos");
        }
    }//GEN-LAST:event_jbtn_ingresarActionPerformed

    private void jbtn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registroActionPerformed
        Form_Registro freg = new Form_Registro();
        freg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtn_registroActionPerformed

    private void jlbl_leerMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_leerMasMouseClicked
        JOptionPane.showMessageDialog(null, "                                                         Bienvenido al recetario Duoc!"+"\n aca encontraras una gran cantidad de recetas exclusivas y podras agregar las tuyas propias."+"\n                               Animate a escribir tus recetas y compartelas con la comunidad.", "Bienvenida al recetario", 3);
    }//GEN-LAST:event_jlbl_leerMasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtn_ingresar;
    private javax.swing.JButton jbtn_registro;
    private javax.swing.JLabel jlbl_leerMas;
    private javax.swing.JPasswordField jpass_contrasena;
    private javax.swing.JTextField jtxt_usuario;
    // End of variables declaration//GEN-END:variables
}
