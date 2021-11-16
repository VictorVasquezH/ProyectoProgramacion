package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class VendedorDAO{

    PreparedStatement ps;
    ResultSet rs;

    Conexion con = new Conexion();
    Connection acceso;

    public EntidadVendedor ValidarVendedor(String codigo, String clave) {
        EntidadVendedor ev = new EntidadVendedor();
        String sql = "SELECT * FROM vendedor WHERE cod_vendedor=? AND clave=?";
        try {
            acceso = con.getConexion();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setCod(rs.getString(1));
                ev.setClav(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setApell(rs.getString(4));
                ev.setTel(rs.getInt(5));
                ev.setCorreo(rs.getString(6));
                ev.setDire(rs.getString(7));
            }
        } catch (Exception e) {
            

        }
        return ev;
    }

 
}
