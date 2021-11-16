
package Formas;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosForm extends javax.swing.JInternalFrame {
    ProductoDAO dao = new ProductoDAO();
    Producto pro = new Producto();
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    DefaultTableModel moledo = new DefaultTableModel();
    
    public ProductosForm() {
        initComponents();
        listar();
    }

void listar(){
    List<Producto> lista = dao.listar();
    moledo = (DefaultTableModel)tablaprod.getModel();
    Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCodpro();
            ob[2] = lista.get(i).getNompro();
            ob[3] = lista.get(i).getDespro();
            ob[4] = lista.get(i).getPrecio();
            ob[5] = lista.get(i).getExispro();
            moledo.addRow(ob);
        }
        tablaprod.setModel(moledo);
    
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codpro = new javax.swing.JTextField();
        nompro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descrip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        existen = new javax.swing.JTextField();
        idid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprod = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnagregarproducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnactualizarproducto = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        limpiarprdo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Productos");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel1.setText("Codigo del Producto :");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel2.setText("Nombre del Producto :");

        codpro.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        nompro.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel3.setText("Descripcion :");

        descrip.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel4.setText("Precio :");

        precio.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel9.setText("Existencias :");

        existen.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N

        idid.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel10.setText("Id Producto :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descrip))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(existen, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(codpro, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nompro)))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(idid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nompro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(descrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(existen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaprod.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tablaprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo Producto", "Nombre", "Descripcion", "Precio", "Existencia"
            }
        ));
        tablaprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaprodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaprod);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo-producto.png"))); // NOI18N

        btnagregarproducto.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btnagregarproducto.setText("Agregar.");
        btnagregarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproductoActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseno-de-producto.png"))); // NOI18N

        btnactualizarproducto.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btnactualizarproducto.setText("Actualizar.");
        btnactualizarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarproductoActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btneliminar.setText("Eliminar.");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar-del-carrito.png"))); // NOI18N

        limpiarprdo.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        limpiarprdo.setText("Nuevo.");
        limpiarprdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarprdoActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnagregarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnactualizarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiarprdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnactualizarproducto))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnagregarproducto)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarprdo)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproductoActionPerformed
        agregarproducto();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnagregarproductoActionPerformed

    private void btnactualizarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarproductoActionPerformed
        modificarproducto();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnactualizarproductoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminarproducto();
         limpiartabla();
        listar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void limpiarprdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarprdoActionPerformed
        limpiar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_limpiarprdoActionPerformed

    private void tablaprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaprodMouseClicked
        int fila = tablaprod.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            int id = Integer.parseInt(tablaprod.getValueAt(fila, 0).toString());
            String codigoprod = tablaprod.getValueAt(fila, 1).toString();
            String nombreprdo = tablaprod.getValueAt(fila, 2).toString();
            String descripprod = tablaprod.getValueAt(fila, 3).toString();
            String precioprod = tablaprod.getValueAt(fila, 4).toString();
            String existenprod = tablaprod.getValueAt(fila, 5).toString();
            codpro.setText(codigoprod);
            nompro.setText(nombreprdo);
            descrip.setText(descripprod);
            precio.setText(precioprod);
            existen.setText(existenprod);
        }
    }//GEN-LAST:event_tablaprodMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void agregarproducto(){
        String codigopro = codpro.getText();
        String nombrepro = nompro.getText();
        String descrippro = descrip.getText();
        String preciopro = precio.getText();
        String exispro = existen.getText();
        Object[] ob = new Object[5];
        ob[0] = codigopro;
        ob[1] = nombrepro;
        ob[2] = descrippro;
        ob[3] = preciopro;
        ob[4] = exispro;
        dao.add(ob);
        
    }
    
    void modificarproducto (){
        int fila = tablaprod.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
        int id =  Integer.parseInt(idid.getText());
        String codigopro = codpro.getText();
        String nombrepro = nompro.getText();
        String descrippro = descrip.getText();
        String preciopro = precio.getText();
        String exispro = existen.getText();
        Object[] obj = new Object [6];
        obj[0] = codigopro;
        obj[1] = nombrepro;
        obj[2] = descrippro;
        obj[3] = preciopro;
        obj[4] = exispro;
        obj[5] = id;
        dao.actualizar(obj);
        }
      
    }
    
    void eliminarproducto (){
        int fila = tablaprod.getSelectedRow();
        int ID = Integer.parseInt(tablaprod.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            dao.eliminarpro(ID);
        }
    }
    
    void limpiar (){
        idid.setText("");
        codpro.setText("");
        nompro.setText("");
        descrip.setText("");
        precio.setText("");
        existen.setText("");
    }
    
    void limpiartabla(){
        for (int i = 0; i < moledo.getRowCount(); i++) {
            moledo.removeRow(i);
            i = i - 1;
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarproducto;
    private javax.swing.JButton btnagregarproducto;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField codpro;
    private javax.swing.JTextField descrip;
    private javax.swing.JTextField existen;
    private javax.swing.JTextField idid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarprdo;
    private javax.swing.JTextField nompro;
    private javax.swing.JTextField precio;
    private javax.swing.JTable tablaprod;
    // End of variables declaration//GEN-END:variables
}
