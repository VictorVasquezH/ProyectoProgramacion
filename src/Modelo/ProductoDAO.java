package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Producto listarID (String codpro){
        
        Producto p = new Producto();
        String sql = ("SELECT* FROM productos WHERE codproducto=?");
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString (1, codpro);
            rs = ps.executeQuery();
            while (rs.next()){
               p.setId(rs.getInt(1));
               p.setCodpro(rs.getString(2));
               p.setNompro(rs.getString(3));
               p.setDespro(rs.getString(4));
               p.setPrecio(rs.getString(5));
               p.setExispro(rs.getInt(6));
            }      
        } catch (Exception e){
        }
        return p;
    }
    
    
    public int ActualizarExistencia (int cant, String idp){
        int r = 0;
        String sql = "UPDATE productos SET existencia WHERE codproducto=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, idp);
            ps.executeQuery();
            
        } catch (Exception e) {
        }
        return r;
    }
    
    //************ MANTENIMIENTO CRUD ************//
    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("Id"));
                p.setCodpro(rs.getString("codproducto"));
                p.setNompro(rs.getString("nombre"));
                p.setDespro(rs.getString("descripcion"));
                p.setPrecio(rs.getString("precio"));
                p.setExispro(rs.getInt("existencia"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO productos (codproducto, nombre, descripcion, precio, existencia) VALUES(?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o){
        int r = 0;
        String sql = "UPDATE productos SET codproducto=?, nombre=?, descripcion=?, precio=?, existencia=? WHERE Id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
             
        }
        return r;
    }

    @Override
    public void eliminarpro(int ID) {
          int r = 0;
        String sql = "DELETE FROM productos WHERE Id=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void eliminarcli(int nit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
