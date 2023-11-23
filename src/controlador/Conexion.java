package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    Connection c;
    String url, user, pass;

    public Conexion() {
    }

    public Conexion(String url) {
        this.url = url;
    }

    public Conexion(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Conexion(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public Connection getConnection() throws SQLException {
        try {
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error conectando a la base de datos: " + e);
            c.close();
            System.out.println("Conexión " + c.getMetaData().getConnection() + " cerrada.");
        }
        return c;
    }

    public Connection getConnection(String url) throws SQLException {
        try {
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error conectando a la base de datos: " + e);
            c.close();
            System.out.println("Conexión " + c.getMetaData().getConnection() + " cerrada.");
        }
        return c;
    }

    public Connection getConnection(String user, String pass) throws SQLException {
        try {
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error conectando a la base de datos: " + e);
            c.close();
            System.out.println("Conexión " + c.getMetaData().getConnection() + " cerrada.");
        }
        return c;
    }

    public Connection getConnection(String url, String user, String pass) throws SQLException {
        try {
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error conectando a la base de datos: " + e);
            c.close();
//            System.out.println("Conexión " + c.getMetaData().getConnection() + " cerrada.");
        }
        return c;
    }

}
