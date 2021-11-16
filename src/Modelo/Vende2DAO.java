
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Vende2DAO implements CRUD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
     

    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor ven = new Vendedor();
                ven.setId(rs.getInt("Id"));
                ven.setCod(rs.getString("cod_vendedor"));
                ven.setClav(rs.getString("clave"));
                ven.setNom(rs.getString("nombre"));
                ven.setApell(rs.getString("apellido"));
                ven.setTel(rs.getInt("telefono"));
                ven.setCorreo(rs.getString("correo_electronico"));
                ven.setDire(rs.getString("domicilio"));
                lista.add(ven);
            }
        } catch (Exception e) {
        }
        return lista;
        
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO vendedor (cod_vendedor, clave, nombre, apellido, telefono, correo_electronico, domicilio) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE vendedor SET cod_vendedor=?, clave=?, nombre=?, apellido=?, telefono=?, correo_electronico=?, domicilio=? WHERE Id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            r = ps.executeUpdate();
        } catch (Exception e) {
             
        }
        return r;
    }

    @Override
    public void eliminarcli(int ID) {
        int r = 0;
        String sql = "DELETE FROM vendedor WHERE Id=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void eliminarpro(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
