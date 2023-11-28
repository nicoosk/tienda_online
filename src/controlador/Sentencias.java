package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sentencias extends Conexion{
    
    public void mostrarComunas(ResultSet rs) throws SQLException{
        while (rs.next()){
            System.out.println(rs.getString("Nombre"));
            System.out.println(rs.getString("Precio_envio"));
        }
        
    }
    
    public void recuperarComunas(Connection c) throws SQLException{
        String sql = "SELECT * FROM comuna";
        try (PreparedStatement pt = c.prepareStatement(sql)){
            try (ResultSet rs = pt.executeQuery()){
                this.mostrarComunas(rs);
            }
        } catch(SQLException e){
            throw new SQLException(e);
        }
    }
    
    
}
