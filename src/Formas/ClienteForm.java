package Formas;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteForm extends javax.swing.JInternalFrame {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    ClienteDAO dao = new ClienteDAO();
    Cliente cl = new Cliente();
    DefaultTableModel modelo = new DefaultTableModel();

    public ClienteForm() {
        initComponents();
        listar();
    }

    void listar() {
        List<Cliente> lista = dao.listar();
        modelo = (DefaultTableModel) TABLA.getModel();
        Object[] ob = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getID();
            ob[1] = lista.get(i).getNit();
            ob[2] = lista.get(i).getNom();
            ob[3] = lista.get(i).getApell();
            ob[4] = lista.get(i).getDpi();
            ob[5] = lista.get(i).getTel();
            ob[6] = lista.get(i).getDomici();
            ob[7] = lista.get(i).getCorreoele();
            ob[8] = lista.get(i).getEsta();
            modelo.addRow(ob);
        }
        TABLA.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Dpi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        txtdpi = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtapell = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtdomi = new javax.swing.JTextField();
        comboxesta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        confinit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JLabel();
        btnAGREGAR = new javax.swing.JButton();
        btnACTUALIZAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnNUEVVO = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Clientes");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel1.setText("NIT:");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel3.setText("Apellidos:");

        Dpi.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        Dpi.setText("DPI:");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel4.setText("Numero de Telefono:");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel6.setText("Correo Electronico:");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel7.setText("Direccion de Domicilio:");

        txtnit.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txtdpi.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txtnom.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txtapell.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txttel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txtcorreo.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        txtdomi.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        comboxesta.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        comboxesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Activo", "Inactivo" }));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 23)); // NOI18N
        jLabel8.setText("Confirmar Id del Cliente :");

        confinit.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confinit, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxesta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtdomi))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtcorreo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Dpi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Dpi)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confinit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TABLA.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "NIT", "Nombre", "Apellido", "DPI", "Telefono", "Domicilio", "Correo Electronico", "Estado"
            }
        ));
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);
        if (TABLA.getColumnModel().getColumnCount() > 0) {
            TABLA.getColumnModel().getColumn(0).setHeaderValue("Id");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-usuario.png"))); // NOI18N

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png"))); // NOI18N

        btnAGREGAR.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        btnAGREGAR.setText("AGREGAR");
        btnAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARActionPerformed(evt);
            }
        });

        btnACTUALIZAR.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        btnACTUALIZAR.setText("ACTUALIZAR");
        btnACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARActionPerformed(evt);
            }
        });

        btnELIMINAR.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        btnNUEVVO.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        btnNUEVVO.setText("NUEVO");
        btnNUEVVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVVOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAGREGAR)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(21, 21, 21)))
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnACTUALIZAR)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnActualizar)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnELIMINAR)
                        .addGap(104, 104, 104)
                        .addComponent(btnNUEVVO))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(10, 10, 10)))
                .addGap(155, 155, 155))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAGREGAR)
                    .addComponent(btnACTUALIZAR)
                    .addComponent(btnELIMINAR)
                    .addComponent(btnNUEVVO))
                .addContainerGap(26, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        actualizare();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        eliminarcli();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnELIMINARActionPerformed

    private void btnNUEVVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVVOActionPerformed
        nuevo();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnNUEVVOActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        int fila = TABLA.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            int id = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
            String nit = TABLA.getValueAt(fila, 1).toString();
            String nom = TABLA.getValueAt(fila,2).toString();
            String apell = TABLA.getValueAt(fila, 3).toString();
            String dpi = TABLA.getValueAt(fila, 4).toString();
            String tel = TABLA.getValueAt(fila, 5).toString();
            String domici = TABLA.getValueAt(fila, 6).toString();
            String corre = TABLA.getValueAt(fila, 7).toString();
            String estad = TABLA.getValueAt(fila, 8).toString();
           txtnit.setText(nit);
            txtnom.setText(nom);
            txtdpi.setText(dpi);
            txtapell.setText(apell);
            txttel.setText(tel);
            txtdomi.setText(domici);
            txtcorreo.setText(corre);
            comboxesta.setSelectedItem(estad);

        }
    }//GEN-LAST:event_TABLAMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void agregar() {
        String nit = txtnit.getText();
        String nom = txtnom.getText();
        String apell = txtapell.getText();
        String dpi = txtdpi.getText();
        String tel = txttel.getText();
        String domici = txtdomi.getText();
        String corre = txtcorreo.getText();
        String estad = comboxesta.getSelectedItem().toString();
        Object[] ob = new Object[8];
        ob[0] = nit;
        ob[1] = nom;
        ob[2] = apell;
        ob[3] = dpi;
        ob[4] = tel;
        ob[5] = domici;
        ob[6] = corre;
        ob[7] = estad;
        dao.add(ob);
    }

    void actualizare() {
       int fila = TABLA.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
        int id =  Integer.parseInt(confinit.getText());
        String nit = txtnit.getText();
        String nom = txtnom.getText();
        String apell = txtapell.getText();
        String dpi = txtdpi.getText();
        String tel = txttel.getText();
        String domici = txtdomi.getText();
        String corre = txtcorreo.getText();
        String estad = comboxesta.getSelectedItem().toString();
        Object[] obj = new Object[9];
        obj[0] = nit;
        obj[1] = nom;
        obj[2] = apell;
        obj[3] = dpi;
        obj[4] = tel;
        obj[5] = domici;
        obj[6] = corre;
        obj[7] = estad;
        obj[8] = id;
        dao.actualizar(obj);
        }
    }

    void eliminarcli() {
        int fila = TABLA.getSelectedRow();
        int ID = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBE DE SELECCIONAR UNA FILA.");
        } else {
            dao.eliminarcli(ID);
        }

    }

    void nuevo() {
        txtnit.setText("");
        txtnom.setText("");
        txtapell.setText("");
        txtdpi.setText("");
        txttel.setText("");
        txtdomi.setText("");
        txtcorreo.setText("");
        confinit.setText("");
        comboxesta.setSelectedItem(0);
        txtnit.requestFocus();

    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dpi;
    public javax.swing.JTable TABLA;
    private javax.swing.JButton btnACTUALIZAR;
    public javax.swing.JButton btnAGREGAR;
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JButton btnNUEVVO;
    private javax.swing.JLabel btnNuevo;
    public javax.swing.JComboBox<String> comboxesta;
    private javax.swing.JTextField confinit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtapell;
    public javax.swing.JTextField txtcorreo;
    public javax.swing.JTextField txtdomi;
    public javax.swing.JTextField txtdpi;
    public javax.swing.JTextField txtnit;
    public javax.swing.JTextField txtnom;
    public javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
