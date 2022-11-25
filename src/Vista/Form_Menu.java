/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Juan Figueroa
 */
public class Form_Menu extends javax.swing.JFrame {

    /**
     * Creates new form FormMen
     */
    public Form_Menu() {
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

        jbtn_recetas = new javax.swing.JButton();
        jbtn_cocteles = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jbtm_ensaladas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jbtn_agregar = new javax.swing.JMenuItem();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(797, 681));
        setName("Recetario"); // NOI18N
        setSize(new java.awt.Dimension(797, 681));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_recetas.setForeground(new java.awt.Color(238, 238, 238));
        jbtn_recetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton_recetas.png"))); // NOI18N
        jbtn_recetas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbtn_recetas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn_recetas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_recetas.setRequestFocusEnabled(false);
        jbtn_recetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_recetasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_recetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 310, 190));

        jbtn_cocteles.setForeground(new java.awt.Color(238, 238, 238));
        jbtn_cocteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton_coctel.png"))); // NOI18N
        jbtn_cocteles.setBorder(null);
        jbtn_cocteles.setBorderPainted(false);
        jbtn_cocteles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_cocteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_coctelesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_cocteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 310, 190));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/titulo_v2.png"))); // NOI18N
        jLabel2.setIgnoreRepaint(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 500, 210));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton_postre.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 310, 190));

        jbtm_ensaladas.setForeground(new java.awt.Color(238, 238, 238));
        jbtm_ensaladas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton_ensaladas.png"))); // NOI18N
        jbtm_ensaladas.setBorder(null);
        jbtm_ensaladas.setBorderPainted(false);
        jbtm_ensaladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtm_ensaladasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtm_ensaladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 310, 190));

        jMenu1.setText("Archivo");

        jbtn_agregar.setText("Agregar Receta");
        jbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(jbtn_agregar);

        jMenuItemCategoria.setText("Categoria Receta");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCategoria);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_recetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_recetasActionPerformed
        FormListaReceta receta = new FormListaReceta();
        receta.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jbtn_recetasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FormListaReceta receta = new FormListaReceta();
        receta.setVisible(true);

        receta.Listar_Recetas_Categoria((int) 4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarActionPerformed
        Form_Agregar_Receta receta = new Form_Agregar_Receta();
        receta.setVisible(true);
    }//GEN-LAST:event_jbtn_agregarActionPerformed

    private void jbtm_ensaladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtm_ensaladasActionPerformed
        FormListaReceta receta = new FormListaReceta();
        receta.setVisible(true);

        receta.Listar_Recetas_Categoria((int) 9);
    }//GEN-LAST:event_jbtm_ensaladasActionPerformed

    private void jbtn_coctelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_coctelesActionPerformed
        FormListaReceta receta = new FormListaReceta();
        receta.setVisible(true);

        receta.Listar_Recetas_Categoria((int) 10);
    }//GEN-LAST:event_jbtn_coctelesActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed
        Form_Categoria categoria = new Form_Categoria();
        categoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JButton jbtm_ensaladas;
    private javax.swing.JMenuItem jbtn_agregar;
    private javax.swing.JButton jbtn_cocteles;
    private javax.swing.JButton jbtn_recetas;
    // End of variables declaration//GEN-END:variables
}
