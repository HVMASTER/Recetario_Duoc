package Vista;

import Controlador.RegistroReceta;
import Controlador.RegistroCategoria;
import Modelo.CategoriaReceta;
import Modelo.Receta;
import java.awt.AWTKeyStroke;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Abarca
 */
public class Form_Agregar_Receta extends javax.swing.JFrame {

    public Form_Agregar_Receta() {
        initComponents();
        this.Listar_Categorias();
        this.jButton1.setEnabled(true);
        this.Disabled_Input();
    }

    public void Disabled_Input() {

        this.jBtnEditar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }

    public void Enabled_Input() {
        this.jBtnEditar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);
    }

    public void Limpiar_Input() {
        this.jTxtNombre.setText("");
        this.jTxtTiempo.setText("");
        this.jCmbCategoria.removeAllItems();
        this.jTxtPorciones.setText("");
        this.jTxtPreparacion.setText("");
        this.jTxtIngredientes.setText("");
        this.jLbl_IdReceta.setText("");
        this.Listar_Categorias();
        this.jButton1.setEnabled(true);
        this.Disabled_Input();
    }

    private void Listar_Categorias() {

        int id;
        String nombre;

        RegistroCategoria rg = new RegistroCategoria();
        this.jCmbCategoria.removeAllItems();

        List<CategoriaReceta> lista = rg.MostrarListadoCategoria();

        for (CategoriaReceta categoria : lista) {

            id = categoria.getIdCategoriaReceta();
            nombre = categoria.getNombreCategoriaReceta();

            this.jCmbCategoria.addItem(new CategoriaReceta(id, nombre));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtPorciones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtPreparacion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtIngredientes = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCmbCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jBtnEditar = new javax.swing.JButton();
        jLbl_IdReceta = new javax.swing.JLabel();
        jBtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Tiempo:");

        jLabel3.setText("Porciones:");

        jLabel4.setText("Preparación:");

        jTxtPreparacion.setColumns(20);
        jTxtPreparacion.setLineWrap(true);
        jTxtPreparacion.setRows(5);
        jScrollPane1.setViewportView(jTxtPreparacion);

        jLabel5.setText("Ingredientes:");

        jTxtIngredientes.setColumns(20);
        jTxtIngredientes.setLineWrap(true);
        jTxtIngredientes.setRows(5);
        jScrollPane2.setViewportView(jTxtIngredientes);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setText("REGISTRO DE RECETAS");

        jLabel7.setText("Categoria:");

        jCmbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCmbCategoriaMouseClicked(evt);
            }
        });

        jLabel8.setText("Min.");

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jLbl_IdReceta.setText("  ");

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTxtPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTxtNombre)))
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(173, 173, 173)
                .addComponent(jLbl_IdReceta)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLbl_IdReceta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = this.jTxtNombre.getText();
        int tiempo = Integer.parseInt(this.jTxtTiempo.getText());
        String porciones = this.jTxtPorciones.getText();
        String preparacion = this.jTxtPreparacion.getText();
        String ingredientes = this.jTxtIngredientes.getText();
        int categoria = this.jCmbCategoria.getItemAt(jCmbCategoria.getSelectedIndex()).getIdCategoriaReceta();

        if (this.jTxtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Nombre de receta", "Guardar", 0);
            this.jTxtNombre.requestFocus();
        } else {
            Receta rec = new Receta(nombre, tiempo, porciones, preparacion, ingredientes, categoria);
            RegistroReceta reg = new RegistroReceta();

            if (reg.agregarReceta(rec)) {
                JOptionPane.showMessageDialog(null, "Receta Agregada", "Guardar", 2);
                this.Limpiar_Input();
                this.jTxtNombre.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Receta no Agregada", "Guardar", 0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void CargarReceta(int IdReceta) {
        
        this.jButton1.setEnabled(false);
        this.Enabled_Input();

        RegistroReceta reg = new RegistroReceta();
        Receta pac = reg.buscarRecetaId(IdReceta);
        this.jLbl_IdReceta.setText(String.valueOf(IdReceta));

        this.jTxtNombre.setText(pac.getNombreReceta());
        this.jTxtTiempo.setText(String.valueOf(pac.getTiempo()));
        this.jTxtPorciones.setText(pac.getPorciones());
        
        RegistroCategoria regc = new RegistroCategoria();
        CategoriaReceta cat = regc.buscarCategoriaId(pac.getIdCategoriaReceta());
        this.jCmbCategoria.setSelectedItem(cat.getNombreCategoriaReceta());
  
        this.jTxtPreparacion.setText(pac.getPreparacion());
        this.jTxtIngredientes.setText(pac.getIngredientes());

        this.jTxtNombre.requestFocus();
    }


    private void jCmbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCmbCategoriaMouseClicked
    }//GEN-LAST:event_jCmbCategoriaMouseClicked

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        int buscaIdReceta = Integer.parseInt(this.jLbl_IdReceta.getText());
        String nombre = this.jTxtNombre.getText();
        int tiempo = Integer.parseInt(this.jTxtTiempo.getText());
        String porciones = this.jTxtPorciones.getText();
        String preparacion = this.jTxtPreparacion.getText();
        String ingredientes = this.jTxtIngredientes.getText();
        int categoria = this.jCmbCategoria.getItemAt(jCmbCategoria.getSelectedIndex()).getIdCategoriaReceta();

        RegistroReceta reg = new RegistroReceta();

        if (reg.editarReceta(buscaIdReceta, nombre, tiempo, porciones, preparacion, ingredientes, categoria)) {
            JOptionPane.showMessageDialog(null, "Receta Editada", "Editar Receta", 2);
            this.Limpiar_Input();
            this.Disabled_Input();
        } else {
            JOptionPane.showMessageDialog(null, "Receta no Editada", "Editar Receta", 0);
        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
      
        int IdReceta = Integer.parseInt(this.jLbl_IdReceta.getText());
        RegistroReceta reg = new RegistroReceta();
        
        if (reg.eliminarReceta(IdReceta)) {
            JOptionPane.showMessageDialog(null,"Receta Eliminada","Eliminar Receta",1);
            this.Limpiar_Input();
        }else{
            JOptionPane.showMessageDialog(null,"Error Receta no Eliminada","Eliminar Receta",0);
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Agregar_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Agregar_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Agregar_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Agregar_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Agregar_Receta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<CategoriaReceta> jCmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbl_IdReceta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTxtIngredientes;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPorciones;
    private javax.swing.JTextArea jTxtPreparacion;
    private javax.swing.JTextField jTxtTiempo;
    // End of variables declaration//GEN-END:variables
}
