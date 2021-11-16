
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VentasDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    public String NOSerieVentas (){
        String serie = "";
        String sql = "SELECT max(numero_ventas) FROM ventas";
        try {
                con = cn.getConexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()){
                serie = rs.getString(1);
            }  
            }     
        catch (Exception e) {
       }
       return serie;
    }
    
    
   public String IdVentas (){
       String idv = "";
       String sql = ("SELECT max(Id) FROM ventas");
       
       try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                idv = rs.getString(1);
            }     
       } catch (Exception e) {
       }
       return idv;
   } 
   
   public int GuardarVetas (Ventas v){
       Ventas ventas = new Ventas();
       String sql = "INSERT INTO ventas (cliente_nit, vendedor_cod, numero_ventas, fecha_ventas, monto, estado) VALUES (?, ?, ?, ?, ?, ?)";
       try {
           con = cn.getConexion();
           ps = con.prepareStatement(sql);
           //ps.setInt(1, v.getId());
           ps.setString(1, v.getNitcli());
           ps.setString(2, v.getCodven());
           ps.setString(3, v.getCodven());
           ps.setString(4, v.getFecha());
           ps.setDouble(5, v.getMonto());
           ps.setString(6, v.getEstado()); 
           r = ps.executeUpdate();
       } catch (Exception e) {
           
       }
        return r;
   }
   
   public int GuardarDetalleVentas (DetalleVentas dv){
       String sql = "INSERT INTO detalle_venta (Ventas_IdVentas, Producto_IdProducto, cantidad, precio) VALUES (?, ?, ?, ?)";
       try {
           con = cn.getConexion();
           ps = con.prepareStatement(sql);
           ps.setInt(1, dv.getIdventas());
           ps.setInt(2, dv.getIdproducto());
           ps.setInt(3, dv.getCantidad());
           ps.setDouble(4, dv.getPreventa());
           r = ps.executeUpdate();
       } catch (Exception e) {
           
       }
        return r;
   }
   
    
    
}
