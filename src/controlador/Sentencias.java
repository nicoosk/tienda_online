package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sentencias extends Conexion{
    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<Integer> precios = new ArrayList<>();
    ArrayList<Long> numTarjeta = new ArrayList<>();
    ArrayList<Integer> cvv = new ArrayList<>();
    ArrayList<String> fechaVencimiento = new ArrayList<>();
    int count = 0;
    
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
    
    public void insertarDatosUsuario(Connection c, String nombre, String apellido, String rut, String correo, String direccion, int numeroTelefono){
        String sql = "INSERT INTO usuario(Id, Nombre, apellido, rut, direccion, correo, telefono) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement ps = c.prepareStatement(sql)){
            ps.setInt(1, this.generarId());
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, rut);
            ps.setString(5, direccion);
            ps.setString(6, correo);
            ps.setInt(7, numeroTelefono);
            ps.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        
    }
    
    public ArrayList<Long> recuperarNumTarjeta(Connection c){
        String sql = "SELECT * FROM tarjeta;";
        try (PreparedStatement ps = c.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            this.guardarNumTarjeta(rs);
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return numTarjeta;
    }
    
    public ArrayList<String> recuperarFechaVen(Connection c){
        String sql = "SELECT * FROM tarjeta;";
        try (PreparedStatement ps = c.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            this.guardarFechaVen(rs);
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return fechaVencimiento;
    }
    
    public ArrayList<Integer> recuperarCvv(Connection c){
        String sql = "SELECT * FROM tarjeta;";
        try (PreparedStatement ps = c.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            this.guardarCvv(rs);
        } catch(SQLException e){
            System.out.println("Error: " + e);
        }
        return cvv;
    }
    
    private ArrayList<Long> guardarNumTarjeta(ResultSet rs) throws SQLException{
        while (rs.next()){
            try {
                numTarjeta.add(rs.getLong("numero"));
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);;
            }
        }
        return numTarjeta;
    }
    
    private ArrayList<String> guardarFechaVen(ResultSet rs) throws SQLException{
        while(rs.next()){
            fechaVencimiento.add(rs.getString("fecha_vencimiento"));
        }
        return fechaVencimiento;
    }
    
    private ArrayList<Integer> guardarCvv(ResultSet rs) throws SQLException{
        while (rs.next()){
            cvv.add(rs.getInt("cvv"));
        }
        return cvv;
    }
    
    private int generarId(){
        return count + 1;
    }
}
