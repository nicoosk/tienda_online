package pruebas;

import vista.*;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Principal {
    
    public static void main(String[] args) {
        new Menu().setVisible(true);
        
        try {
            Connection c = new Conexion("jdbc:mysql://localhost:3306/prueba1?zeroDateTimeBehavior=CONVERT_TO_NULL","root","").getConnection();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
