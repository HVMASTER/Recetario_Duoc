package Vista;

import Controlador.RegistroCategoria;
import Controlador.RegistroReceta;
import Modelo.CategoriaReceta;
import Modelo.Receta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Figueroa
 * @version 13-11-2022
 */
public class FormListaReceta extends javax.swing.JFrame {

    public FormListaReceta() {
        initComponents();
        this.Listar_Recetas();
        this.jbtn_mostrarRe.setEnabled(false);
        this.jbtn_EditarReceta.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_list_recetas = new javax.swing.JTable();
        jbtn_EditarReceta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_mostrarRe = new javax.swing.JButton();
        jbtn_listarReceta1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Listado de Recetas"); // NOI18N

        jtbl_list_recetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tiempo", "Porciones", "Categoria"
            }
        ));
        jtbl_list_recetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_list_recetasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_list_recetas);

        jbtn_EditarReceta.setText("Editar Receta");
        jbtn_EditarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_EditarRecetaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("LISTADO DE RECETAS");

        jbtn_mostrarRe.setText("Mostrar Receta");
        jbtn_mostrarRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_mostrarReActionPerformed(evt);
            }
        });

        jbtn_listarReceta1.setText("Listar");
        jbtn_listarReceta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarReceta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jbtn_listarReceta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_EditarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_mostrarRe, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_listarReceta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn_mostrarRe, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_EditarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Listar_Recetas() {

        int id, tiempo;
        String nombre, porciones, categoria;

        RegistroReceta rg = new RegistroReceta();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_list_recetas.getModel();

        modelo.setRowCount(0);

        List<Receta> lista = rg.MostrarListadoRecetas();

        for (Receta receta : lista) {

            id = receta.getIdReceta();
            nombre = receta.getNombreReceta();
            tiempo = receta.getTiempo();
            porciones = receta.getPorciones();
            
            RegistroCategoria regc = new RegistroCategoria();
            CategoriaReceta cat = regc.buscarCategoriaId(receta.getIdCategoriaReceta());
            
            categoria = cat.getNombreCategoriaReceta();

            modelo.addRow(new Object[]{id, nombre, tiempo, porciones, categoria});
        }

    }
    
    
    public void Listar_Recetas_Categoria(int idCategoria) {

        int id, tiempo;
        String nombre, porciones, categoria;

        RegistroReceta rg = new RegistroReceta();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_list_recetas.getModel();

        modelo.setRowCount(0);

        List<Receta> lista = rg.MostrarListadoRecetasCategoria(idCategoria);

        for (Receta receta : lista) {

            id = receta.getIdReceta();
            nombre = receta.getNombreReceta();
            tiempo = receta.getTiempo();
            porciones = receta.getPorciones();
            RegistroCategoria regc = new RegistroCategoria();
            CategoriaReceta cat = regc.buscarCategoriaId(receta.getIdCategoriaReceta());
            
            categoria = cat.getNombreCategoriaReceta();

            modelo.addRow(new Object[]{id, nombre, tiempo, porciones, categoria});
        }

    }
    
    private void jbtn_EditarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EditarRecetaActionPerformed
        
        int fila = this.jtbl_list_recetas.getSelectedRow();
        Object idReceta = this.jtbl_list_recetas.getValueAt(fila, 0);
        dispose();
        Form_Agregar_Receta feditar = new Form_Agregar_Receta();
        feditar.setVisible(true);
        
        feditar.CargarReceta((int) idReceta);

    }//GEN-LAST:event_jbtn_EditarRecetaActionPerformed

    private void jbtn_mostrarReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mostrarReActionPerformed

        int fila = this.jtbl_list_recetas.getSelectedRow();
        Object idReceta = this.jtbl_list_recetas.getValueAt(fila, 0);

        Form_Mostrar_Receta fmostrar = new Form_Mostrar_Receta();
        fmostrar.setVisible(true);
        
        fmostrar.MostarReceta((int) idReceta);

    }//GEN-LAST:event_jbtn_mostrarReActionPerformed

    private void jtbl_list_recetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_list_recetasMouseClicked
        this.jbtn_mostrarRe.setEnabled(true);
        this.jbtn_EditarReceta.setEnabled(true);

    }//GEN-LAST:event_jtbl_list_recetasMouseClicked

    private void jbtn_listarReceta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarReceta1ActionPerformed
        this.Listar_Recetas();
    }//GEN-LAST:event_jbtn_listarReceta1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListaReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_EditarReceta;
    private javax.swing.JButton jbtn_listarReceta1;
    private javax.swing.JButton jbtn_mostrarRe;
    private javax.swing.JTable jtbl_list_recetas;
    // End of variables declaration//GEN-END:variables
}
