package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Sentencias extends Conexion{
    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<Integer> precios = new ArrayList<>();
    
    private ArrayList<String> mostrarNombreComuna(ResultSet rs) throws SQLException{
        while (rs.next()){
            nombres.add(rs.getString("Nombre"));
        }
        return nombres;
    }
    
    private ArrayList<Integer> mostrarPrecioEnvio(ResultSet rs) throws SQLException{
        while (rs.next( )){
            precios.add(Integer.valueOf(rs.getString("Precio_envio")));
        }
        return precios;
    }
    
    public ArrayList<String> recuperarNombreComunas(Connection c) throws SQLException{
        String sql = "SELECT * FROM comuna";
        try (PreparedStatement pt = c.prepareStatement(sql)){
            try (ResultSet rs = pt.executeQuery()){
                return this.mostrarNombreComuna(rs);
            }
        } catch(SQLException e){
            throw new SQLException(e);
        }
    }
    
    public ArrayList<Integer> recuperarPrecioEnvio(Connection c) throws SQLException{
        String sql = "SELECT * FROM comuna";
        try (PreparedStatement pt = c.prepareStatement(sql)){
            try (ResultSet rs = pt.executeQuery()){
                return this.mostrarPrecioEnvio(rs);
            }
        } catch(SQLException e){
            throw new SQLException(e);
        }
    }
    
    
}
