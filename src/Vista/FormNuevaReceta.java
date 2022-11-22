package Vista;

import Modelo.Receta;

/**
 *
 * @author Juan Figueroa
 * @version 13-11-2022
 */
public class FormNuevaReceta extends javax.swing.JFrame {

    /**
     * Creates new form FormNuevaReceta
     */
    public FormNuevaReceta() {
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

        jlbl_nombreReceta = new javax.swing.JLabel();
        jtxt_nombreReceta = new javax.swing.JTextField();
        jlbl_descripcionReceta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_descripcionReceta = new javax.swing.JTextArea();
        jlbl_ingredientesReceta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxt_ingredientesReceta = new javax.swing.JTextArea();
        jlbl_palabraClaveReceta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxt_palabraClaveReceta = new javax.swing.JTextArea();
        jlbl_categoriaReceta = new javax.swing.JLabel();
        jcb_categoriaReceta = new javax.swing.JComboBox<>();
        jbtn_guardarReceta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbl_nombreReceta.setText("Nombre");

        jlbl_descripcionReceta.setText("Descripcion");

        jtxt_descripcionReceta.setColumns(20);
        jtxt_descripcionReceta.setRows(5);
        jScrollPane1.setViewportView(jtxt_descripcionReceta);

        jlbl_ingredientesReceta.setText("Ingredientes");

        jtxt_ingredientesReceta.setColumns(20);
        jtxt_ingredientesReceta.setRows(5);
        jScrollPane2.setViewportView(jtxt_ingredientesReceta);

        jlbl_palabraClaveReceta.setText("Palabras Claves");

        jtxt_palabraClaveReceta.setColumns(20);
        jtxt_palabraClaveReceta.setRows(5);
        jScrollPane3.setViewportView(jtxt_palabraClaveReceta);

        jlbl_categoriaReceta.setText("Categoria");

        jcb_categoriaReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_guardarReceta.setText("Guardar");
        jbtn_guardarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarRecetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_categoriaReceta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbl_descripcionReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbl_nombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)
                        .addComponent(jtxt_nombreReceta)
                        .addComponent(jlbl_ingredientesReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jlbl_palabraClaveReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcb_categoriaReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbtn_guardarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_nombreReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_nombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_descripcionReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlbl_ingredientesReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_palabraClaveReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlbl_categoriaReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_categoriaReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbtn_guardarReceta)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_guardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarRecetaActionPerformed
        
        String nombreReceta = this.jtxt_nombreReceta.getText();
        String descripcion = this.jtxt_descripcionReceta.getText();
        

        Receta rec = new Receta();

    }//GEN-LAST:event_jbtn_guardarRecetaActionPerformed

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
            java.util.logging.Logger.getLogger(FormNuevaReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNuevaReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNuevaReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevaReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNuevaReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtn_guardarReceta;
    private javax.swing.JComboBox<String> jcb_categoriaReceta;
    private javax.swing.JLabel jlbl_categoriaReceta;
    private javax.swing.JLabel jlbl_descripcionReceta;
    private javax.swing.JLabel jlbl_ingredientesReceta;
    private javax.swing.JLabel jlbl_nombreReceta;
    private javax.swing.JLabel jlbl_palabraClaveReceta;
    private javax.swing.JTextArea jtxt_descripcionReceta;
    private javax.swing.JTextArea jtxt_ingredientesReceta;
    private javax.swing.JTextField jtxt_nombreReceta;
    private javax.swing.JTextArea jtxt_palabraClaveReceta;
    // End of variables declaration//GEN-END:variables
}
