package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co = new Cliente ();
    
    public Cliente listarID (String nit){
        Cliente c = new Cliente ();
        String sql = "SELECT* FROM clientes WHERE nit=? ";
        try { 
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nit);
            rs = ps.executeQuery();
            while (rs.next()){
                c.setID(rs.getInt(1));
                c.setNit(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setApell(rs.getString(4));
                c.setDpi(rs.getString(5));
                c.setTel(rs.getInt(6));
                c.setDomici(rs.getString(7));
                c.setCorreoele(rs.getString(8));

            }  
        } catch (Exception e) {
        }
        return c;
    }
    
    
    
    //METODOS DEL MANTENIMIENDO CRUD
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setID(rs.getInt("Id"));
                c.setNit(rs.getString("nit"));
                c.setNom(rs.getString("nombre"));
                c.setApell(rs.getString("apellido"));
                c.setDpi(rs.getString("dpi"));
                c.setTel(rs.getInt("telefono"));
                c.setDomici(rs.getString("domicilio"));
                c.setCorreoele(rs.getString("correo_electronico"));
                c.setEsta(rs.getString("estado"));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO clientes (nit, nombre, apellido, dpi, telefono, domicilio, correo_electronico, estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
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
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE clientes SET nit = ?, nombre=?, apellido=?, dpi=?, telefono=?, domicilio=?, correo_electronico=?, estado=? WHERE Id=?";
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
            ps.setObject(9, o[8]);
            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;

    }

    @Override
    public void eliminarcli(int ID) {
        int r = 0;
        String sql = "DELETE FROM clientes WHERE Id=?";
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
