package Vista;

import Controlador.RegistroCategoria;
import Controlador.RegistroReceta;
import Modelo.CategoriaReceta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Abarca
 */
public class Form_Categoria extends javax.swing.JFrame {

    /**
     * Creates new form Form_Categoria
     */
    public Form_Categoria() {
        initComponents();
        Listar_Categoria();
    }

    private void Listar_Categoria() {

        int id;
        String nombre;

        RegistroCategoria rg = new RegistroCategoria();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_list_categorias.getModel();

        modelo.setRowCount(0);

        List<CategoriaReceta> lista = rg.MostrarListadoCategoria();

        for (CategoriaReceta categoria : lista) {

            id = categoria.getIdCategoriaReceta();
            nombre = categoria.getNombreCategoriaReceta();

            modelo.addRow(new Object[]{id, nombre});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombreCategoria = new javax.swing.JTextField();
        jBtnAgregarCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_list_categorias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Categoria:");

        jBtnAgregarCategoria.setText("Agregar Categoria");
        jBtnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarCategoriaActionPerformed(evt);
            }
        });

        jtbl_list_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_list_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_list_categoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_list_categorias);
        if (jtbl_list_categorias.getColumnModel().getColumnCount() > 0) {
            jtbl_list_categorias.getColumnModel().getColumn(0).setMinWidth(100);
            jtbl_list_categorias.getColumnModel().getColumn(1).setMinWidth(400);
        }

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categorias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAgregarCategoria))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBtnAgregarCategoria))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbl_list_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_list_categoriasMouseClicked

    }//GEN-LAST:event_jtbl_list_categoriasMouseClicked

    private void jBtnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarCategoriaActionPerformed
        String nombre = this.jTxtNombreCategoria.getText();

        if (this.jTxtNombreCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Nombre", "Guardar", 0);
            this.jTxtNombreCategoria.requestFocus();
        } else {
            CategoriaReceta rec = new CategoriaReceta(nombre);
            RegistroCategoria reg = new RegistroCategoria();

            if (reg.agregarCategoria(rec)) {
                JOptionPane.showMessageDialog(null, "Categoria Agregada", "Guardar", 2);
                this.jTxtNombreCategoria.setText("");
                this.jTxtNombreCategoria.requestFocus();
                this.Listar_Categoria();
            } else {
                JOptionPane.showMessageDialog(null, "Categoria no Agregada", "Guardar", 0);
            }
        }
    }//GEN-LAST:event_jBtnAgregarCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtNombreCategoria;
    private javax.swing.JTable jtbl_list_categorias;
    // End of variables declaration//GEN-END:variables
}
