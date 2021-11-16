
package Formas;

import Modelo.Conexion;
import Modelo.Producto;
import Modelo.Vende2DAO;
import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VendedorForm extends javax.swing.JInternalFrame {
    Vende2DAO dao = new Vende2DAO();
    Vendedor pro = new Vendedor();
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    DefaultTableModel modelos = new DefaultTableModel();
    public VendedorForm() {
        initComponents();
        listar();
    }
    
    void listar(){
    List<Vendedor> lista = dao.listar();
    modelos = (DefaultTableModel)tablavendedor.getModel();
    Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getCod();
            ob[2] = lista.get(i).getClav();
            ob[3] = lista.get(i).getNom();
            ob[4] = lista.get(i).getApell();
            ob[5] = lista.get(i).getTel();
            ob[6] = lista.get(i).getCorreo();
            ob[7] = lista.get(i).getDire();
            
            modelos.addRow(ob);
        }
        tablavendedor.setModel(modelos);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomven = new javax.swing.JTextField();
        apellven = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        correoven = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telven = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        codven = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contraven = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        domiven = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confiven = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablavendedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnagregarvendedor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnactualizarvendedor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btneliminarvendedor = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        limpiartodo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Vendedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel1.setText("Apellidos del Vendedor :");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel2.setText("Nombres del Vendedor :");

        nomven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        apellven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel3.setText("Correo Electronico :");

        correoven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel4.setText("Numero de Telefono :");

        telven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel5.setText("Codigo del Vendedor :");

        codven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel6.setText("Contraseña Vendedor :");

        contraven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel7.setText("Domicilio :");

        domiven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 25)); // NOI18N
        jLabel8.setText("Confirmar Id :");

        confiven.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomven, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(correoven, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellven, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(telven))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(codven, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(contraven)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(domiven, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confiven, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(apellven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(correoven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(codven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(contraven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(domiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(confiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablavendedor.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        tablavendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo Vendedor", "Contraseña", "Nombre", "Apellido", "Telefono", "Correo Electronico", "Domicilio"
            }
        ));
        tablavendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablavendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablavendedor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vendedor.png"))); // NOI18N

        btnagregarvendedor.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btnagregarvendedor.setText("Agregar.");
        btnagregarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarvendedorActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vendedor (1).png"))); // NOI18N

        btnactualizarvendedor.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btnactualizarvendedor.setText("Actualizar.");
        btnactualizarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarvendedorActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar-amigo.png"))); // NOI18N

        btneliminarvendedor.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        btneliminarvendedor.setText("Eliminar.");
        btneliminarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarvendedorActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png"))); // NOI18N

        limpiartodo.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        limpiartodo.setText("Nuevo.");
        limpiartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiartodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnagregarvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnactualizarvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminarvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiartodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnactualizarvendedor))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnagregarvendedor)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminarvendedor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiartodo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarvendedorActionPerformed
        agregarvendedor();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnagregarvendedorActionPerformed

    private void btnactualizarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarvendedorActionPerformed
        modificarvendedor();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnactualizarvendedorActionPerformed

    private void btneliminarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarvendedorActionPerformed
         eliminarvendedor();
         limpiartabla();
        listar();
    }//GEN-LAST:event_btneliminarvendedorActionPerformed

    private void limpiartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiartodoActionPerformed
         limpiar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_limpiartodoActionPerformed

    private void tablavendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablavendedorMouseClicked
        int fila = tablavendedor.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            int id = Integer.parseInt(tablavendedor.getValueAt(fila, 0).toString());
            String codvendedor = tablavendedor.getValueAt(fila, 1).toString();
            String clavevendedor = tablavendedor.getValueAt(fila, 2).toString();
            String nombrevendedor = tablavendedor.getValueAt(fila, 3).toString();
            String apellidovendedor = tablavendedor.getValueAt(fila, 4).toString();
            String telefono = tablavendedor.getValueAt(fila, 5).toString();
            String correovendedor = tablavendedor.getValueAt(fila, 6).toString();
            String domicilio = tablavendedor.getValueAt(fila, 7).toString();
            codven.setText(codvendedor);
            contraven.setText(clavevendedor);
            nomven.setText(nombrevendedor);
            apellven.setText(apellidovendedor);
            telven.setText(telefono);
            correoven.setText(correovendedor);
            domiven.setText(domicilio);
        }
           
    }//GEN-LAST:event_tablavendedorMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void agregarvendedor(){
        String codvendedor = codven.getText();
        String clavevendedor = contraven.getText();
        String nombrevendedor = nomven.getText();
        String apellidovendedor = apellven.getText();
        String telefono = telven.getText();
        String correovendedor = correoven.getText();
        String domicilio = domiven.getText();
        Object[] ob = new Object[7];
        ob[0] = codvendedor;
        ob[1] = clavevendedor;
        ob[2] = nombrevendedor;
        ob[3] = apellidovendedor;
        ob[4] = telefono;
        ob[5] = correovendedor;
        ob[6] = domicilio;
        dao.add(ob);
    }
    void modificarvendedor (){
        int fila = tablavendedor.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
        int id =  Integer.parseInt(confiven.getText());
        String codvendedor = codven.getText();
        String clavevendedor = contraven.getText();
        String nombrevendedor = nomven.getText();
        String apellidovendedor = apellven.getText();
        String telefono = telven.getText();
        String correovendedor = correoven.getText();
        String domicilio = domiven.getText();
        Object[] obj = new Object [8];
        obj[0] = codvendedor;
        obj[1] = clavevendedor;
        obj[2] = nombrevendedor;
        obj[3] = apellidovendedor;
        obj[4] = telefono;
        obj[5] = correovendedor;
        obj[6] = domicilio;
        obj[7] = id;
        dao.actualizar(obj);
        }
    }
    
    
    void eliminarvendedor (){
        int fila = tablavendedor.getSelectedRow();
        int ID = Integer.parseInt(tablavendedor.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            dao.eliminarcli(ID);
        }
    }
    
    void limpiar (){
        confiven.setText("");
        codven.setText("");
        contraven.setText("");
        nomven.setText("");
        apellven.setText("");
        telven.setText("");
        correoven.setText("");
        domiven.setText("");
    }
    
       void limpiartabla(){
        for (int i = 0; i < modelos.getRowCount(); i++) {
            modelos.removeRow(i);
            i = i - 1;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellven;
    private javax.swing.JButton btnactualizarvendedor;
    private javax.swing.JButton btnagregarvendedor;
    private javax.swing.JButton btneliminarvendedor;
    private javax.swing.JTextField codven;
    private javax.swing.JTextField confiven;
    private javax.swing.JTextField contraven;
    private javax.swing.JTextField correoven;
    private javax.swing.JTextField domiven;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton limpiartodo;
    private javax.swing.JTextField nomven;
    private javax.swing.JTable tablavendedor;
    private javax.swing.JTextField telven;
    // End of variables declaration//GEN-END:variables
}
