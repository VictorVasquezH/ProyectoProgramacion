
package Formas;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.DetalleVentas;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Ventas;
import Modelo.VentasDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasForm extends javax.swing.JInternalFrame {
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    VentasDAO vdao = new VentasDAO();
    Ventas v = new Ventas ();
    DetalleVentas dv = new DetalleVentas ();
    Cliente cliente =  new Cliente();
    
    // Producto p = new Producto();
     //String codpro;
    double totalpagar;
    double prepro;
    int cant;
    int idp;
    DefaultTableModel modelo = new DefaultTableModel();

    public VentasForm() {
        initComponents();
        Calendar calendar = new GregorianCalendar();
        fecha.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));   
        GenerarSerie();
        
    }
    
 
    
    void GenerarSerie(){
        String serie = vdao.NOSerieVentas();
        if (serie=="") {
            txt1.setText("0000001");
        } else {
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txt1.setText("000000" + increment);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtnitcliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnomcliente = new javax.swing.JTextField();
        btnbuscarcliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtcodproducto = new javax.swing.JTextField();
        btnbuscarproducto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtnomproducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        fecha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnomvendedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnagregarproducto = new javax.swing.JButton();
        txtapellidocliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtexist = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txttotalpagar = new javax.swing.JTextField();
        btbrealizarventa = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel17.setText("jLabel17");

        setTitle("Sistema Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"ELECTRO MAXE\"");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel2.setText("VENTA DE PRODUCTOS TECOLOGICOS.");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel3.setText("TEL: 2458 - 3520");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("NO. FACTURA :");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usb.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estereo.png"))); // NOI18N

        txt1.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(669, 669, 669)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setText("NIT Cliente :");

        txtnitcliente.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel8.setText("Nombre Cliente :");

        txtnomcliente.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        btnbuscarcliente.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscarcliente.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        btnbuscarcliente.setText("Buscar");
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel9.setText("COD Producto :");

        txtcodproducto.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        txtcodproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodproductoActionPerformed(evt);
            }
        });

        btnbuscarproducto.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscarproducto.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        btnbuscarproducto.setText("Buscar");
        btnbuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarproductoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel10.setText("Nombre Producto :");

        txtnomproducto.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel11.setText("Precio :");

        txtprecio.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel12.setText("Descripcion :");

        txtdescripcion.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel13.setText("Cantidad :");

        cantidad.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        fecha.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel14.setText("Vendedor :");

        txtnomvendedor.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras (1).png"))); // NOI18N

        btnagregarproducto.setBackground(new java.awt.Color(204, 204, 204));
        btnagregarproducto.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        btnagregarproducto.setText("Agregar Producto.");
        btnagregarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproductoActionPerformed(evt);
            }
        });

        txtapellidocliente.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel18.setText("Existencia :");

        txtexist.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnitcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnomproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellidocliente))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnomvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnagregarproducto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtexist, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnitcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarcliente)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcodproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarproducto)
                            .addComponent(jLabel10)
                            .addComponent(txtnomproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtexist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtnomvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TablaDetalle.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Orden", "Codigo del Producto", "Nombre del Producto", "Cantidad", "Precio Unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jLabel16.setText("Total a Pagar :");

        txttotalpagar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N

        btbrealizarventa.setFont(new java.awt.Font("Courier New", 0, 30)); // NOI18N
        btbrealizarventa.setText("REALIZAR VENTA.");
        btbrealizarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbrealizarventaActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Courier New", 0, 30)); // NOI18N
        btncancelar.setText("CANCELAR.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar)
                .addGap(26, 26, 26)
                .addComponent(btbrealizarventa)
                .addGap(86, 86, 86)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btbrealizarventa)
                    .addComponent(btncancelar))
                .addContainerGap(21, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1506, 1506, 1506)
                        .addComponent(jButton1)
                        .addGap(23, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    void BuscarCliente (){
        int r = 0;
        String cod = txtnitcliente.getText();
        if ( txtnitcliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"DEBE DE INGRESAR UN NUMERO DE NIT");        
        } else {
            cliente = cdao.listarID(cod);
            if (cliente.getNit()!=null) {
                txtnomcliente.setText(cliente.getNom());
                txtapellidocliente.setText(cliente.getApell());
                txtcodproducto.requestFocus();
            } else{
                JOptionPane.showConfirmDialog(this, "CLIENTE NO REGISTRADO, DESEA CREAR UN NUEVO REGISTRO");
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    MenuPrin.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }        
        }   
    }
    
    private void btnbuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarproductoActionPerformed
       BuscarProducto();
    }//GEN-LAST:event_btnbuscarproductoActionPerformed

    void BuscarProducto (){
        String codigopro = txtcodproducto.getText();
        if ( txtcodproducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"DEBE DE INGRESAR EL CODIGO DEL PRODUCTO");   
        } else {
            Producto producto = pdao.listarID(codigopro);
            if (producto.getCodpro()!=null) {
                txtnomproducto.setText(producto.getNompro());
                txtprecio.setText(producto.getPrecio());
                txtdescripcion.setText(producto.getDespro()); 
                txtexist.setText(""+producto.getExispro());
            } else {
                JOptionPane.showMessageDialog(this, "EL CODIGO DEL PRODUCTO ESTA MAL INGRESADO");
                 txtcodproducto.requestFocus();
            }    
        }       
    }
    
    
    
    
    
    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void btnagregarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproductoActionPerformed
        AgregarProducto ();
    }//GEN-LAST:event_btnagregarproductoActionPerformed

    void AgregarProducto (){
        double total;
        int item = 0;
        modelo = (DefaultTableModel)TablaDetalle.getModel();
        item = item + 1;
        String codpro = txtcodproducto.getText();
        String nomprodu = txtnomproducto.getText();
        prepro = Double.parseDouble(txtprecio.getText());
        cant = Integer.parseInt(cantidad.getValue().toString());
        int exis = Integer.parseInt(txtexist.getText());
        
        total = cant * prepro;
        ArrayList lista = new ArrayList();
        if (exis > 0) {
            lista.add(item);
            lista.add(codpro);
            lista.add(nomprodu);
            lista.add(cant);
            lista.add(prepro);
            lista.add(total);
            Object [] ob = new Object [6];
            ob[0] = lista.get (0);
            ob[1] = lista.get (1);
            ob[2] = lista.get (2);
            ob[3] = lista.get (3);
            ob[4] = lista.get (4);
            ob[5] = lista.get (5);
            modelo.addRow(ob);
            TablaDetalle.setModel(modelo);
            CalcularTotal ();
        }
        else {
            JOptionPane.showMessageDialog(this, "NO HAY EXISTENCIAS DEL PRODUCTO INGRESADO");
        }
    }
    
    void CalcularTotal (){
        totalpagar = 0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            prepro = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            totalpagar = totalpagar + (cant * prepro);
        }
        txttotalpagar.setText(""+totalpagar);
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btbrealizarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbrealizarventaActionPerformed
        if (txttotalpagar.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "INGRESE UNA PRODUCTOS A LA FACTURA.");
        } else {
            GuardarVentas();
            GuardarDetalle();
            ActualizarExistencia();
            JOptionPane.showMessageDialog(this, "VENTA REALIZADA CORRECTAMENTE.");
            limpiarTabla();
            nuevaVenta();
            GenerarSerie();
        }
                
    }//GEN-LAST:event_btbrealizarventaActionPerformed

    private void txtcodproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodproductoActionPerformed
    
    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount() ; i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    void nuevaVenta(){
        txtnitcliente.setText("");
        txtcodproducto.setText("");
        txtprecio.setText("");       
        cantidad.setValue(0);       
        fecha.setText("");       
        txtnomvendedor.setText(""); 
        txtdescripcion.setText("");       
        txtnomcliente.setText("");       
        txtapellidocliente.setText("");
        txt1.setText("");       
        txttotalpagar.setText("");     
        txtnomproducto.setText("");
        txtexist.setText("");
    }
    
    
    void ActualizarExistencia (){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            String idp = TablaDetalle.getValueAt(i, 1).toString(); 
            int cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            pr = pdao.listarID(idp);
            int sa = pr.getExispro() - cant;
            pdao.ActualizarExistencia(sa, idp);
            
            
        }
    }
    
    
    
    
    void GuardarVentas(){
        String idv = "1";
        String idc = cliente.getNit();
        String serie = txt1.getText();
        String fechaventa = fecha.getText();
        double monto = totalpagar;
        String estado = "1";
        
        v.setNitcli(idc);  
        v.setCodven(idv);
        v.setNoventa(serie);
        v.setFecha(fechaventa);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVetas(v);
        
    }
    
    void GuardarDetalle(){
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdventas(idve);
            dv.setIdproducto(idp);
            dv.setCantidad(cant);
            dv.setPreventa(pre);
            vdao.GuardarDetalleVentas(dv);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btbrealizarventa;
    private javax.swing.JButton btnagregarproducto;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btnbuscarproducto;
    private javax.swing.JButton btncancelar;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txtapellidocliente;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtexist;
    private javax.swing.JTextField txtnitcliente;
    private javax.swing.JTextField txtnomcliente;
    private javax.swing.JTextField txtnomproducto;
    private javax.swing.JTextField txtnomvendedor;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotalpagar;
    // End of variables declaration//GEN-END:variables
}
