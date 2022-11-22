
package Vista;

/**
 *
 * @author Juan Figueroa
 * @version 13-11-2022
 */
public class FormNuevoCoctel extends javax.swing.JFrame {

    /**
     * Creates new form FormNuevoCoctel
     */
    public FormNuevoCoctel() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_nombreCoctel = new javax.swing.JLabel();
        jtxt_nombreCoctel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_descripcionCoctel = new javax.swing.JTextArea();
        jlbl_descripcionCoctel = new javax.swing.JLabel();
        jlbl_ingredientesCoctel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxt_ingredientesCoctel = new javax.swing.JTextArea();
        jlbl_palabraClaveCoctel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxt_palabraClaveCoctel = new javax.swing.JTextArea();
        jlbl_categoriaCoctel = new javax.swing.JLabel();
        jcb_categoriaCoctel = new javax.swing.JComboBox<>();
        jbtn_guardarCoctel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbl_nombreCoctel.setText("Nombre");

        jtxt_descripcionCoctel.setColumns(20);
        jtxt_descripcionCoctel.setRows(5);
        jScrollPane1.setViewportView(jtxt_descripcionCoctel);

        jlbl_descripcionCoctel.setText("Descripcion");

        jlbl_ingredientesCoctel.setText("Ingredientes");

        jtxt_ingredientesCoctel.setColumns(20);
        jtxt_ingredientesCoctel.setRows(5);
        jScrollPane2.setViewportView(jtxt_ingredientesCoctel);

        jlbl_palabraClaveCoctel.setText("Palabras Claves");

        jtxt_palabraClaveCoctel.setColumns(20);
        jtxt_palabraClaveCoctel.setRows(5);
        jScrollPane3.setViewportView(jtxt_palabraClaveCoctel);

        jlbl_categoriaCoctel.setText("Categoria");

        jcb_categoriaCoctel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_guardarCoctel.setText("Guardar");
        jbtn_guardarCoctel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarCoctelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_categoriaCoctel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbl_descripcionCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbl_nombreCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)
                        .addComponent(jtxt_nombreCoctel)
                        .addComponent(jlbl_ingredientesCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jlbl_palabraClaveCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcb_categoriaCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbtn_guardarCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_nombreCoctel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_nombreCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_descripcionCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbl_ingredientesCoctel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jlbl_palabraClaveCoctel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlbl_categoriaCoctel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_categoriaCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbtn_guardarCoctel)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_guardarCoctelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarCoctelActionPerformed

        
    }//GEN-LAST:event_jbtn_guardarCoctelActionPerformed

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
            java.util.logging.Logger.getLogger(FormNuevoCoctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNuevoCoctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNuevoCoctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevoCoctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNuevoCoctel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtn_guardarCoctel;
    private javax.swing.JComboBox<String> jcb_categoriaCoctel;
    private javax.swing.JLabel jlbl_categoriaCoctel;
    private javax.swing.JLabel jlbl_descripcionCoctel;
    private javax.swing.JLabel jlbl_ingredientesCoctel;
    private javax.swing.JLabel jlbl_nombreCoctel;
    private javax.swing.JLabel jlbl_palabraClaveCoctel;
    private javax.swing.JTextArea jtxt_descripcionCoctel;
    private javax.swing.JTextArea jtxt_ingredientesCoctel;
    private javax.swing.JTextField jtxt_nombreCoctel;
    private javax.swing.JTextArea jtxt_palabraClaveCoctel;
    // End of variables declaration//GEN-END:variables
}
