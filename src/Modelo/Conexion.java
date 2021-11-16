package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    static Connection con = null;

    public static Connection getConexion() {

        String url = "jdbc:sqlserver://proyectoprogra.database.windows.net:1433;databaseName=ProyectoVentas;user=AdministradorVenta";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        try {
            con = DriverManager.getConnection(url, "AdministradorVenta", "Abc12345");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

    Connection Conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}