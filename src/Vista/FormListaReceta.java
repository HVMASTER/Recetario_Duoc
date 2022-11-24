package Vista;

import Controlador.RegistroReceta;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_list_recetas = new javax.swing.JTable();
        jbtn_listarReceta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_mostrarRe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jbtn_listarReceta.setText("Listar");
        jbtn_listarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarRecetaActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_listarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_listarReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jbtn_mostrarRe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Listar_Recetas() {

        int id, tiempo, categoria;
        String nombre, porciones;

        RegistroReceta rg = new RegistroReceta();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_list_recetas.getModel();

        modelo.setRowCount(0);

        List<Receta> lista = rg.MostrarListadoRecetas();

        for (Receta receta : lista) {

            id = receta.getIdReceta();
            nombre = receta.getNombreReceta();
            tiempo = receta.getTiempo();
            porciones = receta.getPorciones();
            categoria = receta.getIdCategoriaReceta();

            modelo.addRow(new Object[]{id, nombre, tiempo, porciones, categoria});
        }

    }
    private void jbtn_listarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarRecetaActionPerformed
        this.Listar_Recetas();
    }//GEN-LAST:event_jbtn_listarRecetaActionPerformed

    private void jbtn_mostrarReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mostrarReActionPerformed

        int fila = this.jtbl_list_recetas.getSelectedRow();
        Object idReceta = this.jtbl_list_recetas.getValueAt(fila, 0);
        Object nombreReceta = this.jtbl_list_recetas.getValueAt(fila, 1);
        System.out.println("Fila Seleccionada: " + fila);

        Form_Mostrar_Receta fmostrar = new Form_Mostrar_Receta();
        fmostrar.setVisible(true);


    }//GEN-LAST:event_jbtn_mostrarReActionPerformed

    private void jtbl_list_recetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_list_recetasMouseClicked
        this.jbtn_mostrarRe.setEnabled(true);

    }//GEN-LAST:event_jtbl_list_recetasMouseClicked

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
    private javax.swing.JButton jbtn_listarReceta;
    private javax.swing.JButton jbtn_mostrarRe;
    private javax.swing.JTable jtbl_list_recetas;
    // End of variables declaration//GEN-END:variables
}
