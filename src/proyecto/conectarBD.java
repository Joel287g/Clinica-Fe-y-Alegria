package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectarBD {
    
    public static Connection cnn;
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER ="root";
    private static final String PASSWORD = "";
    private static final String DBNAME = "clinicafeyalegria";
    private static final String URL = "jdbc:mysql://localhost:3306/"+DBNAME+"?useSSL=false&serverTimezone=GMT-4";           
    
    public conectarBD() {
        cnn = null;
    }
    
    public Connection getConnection(){
        try {
            cnn = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Se estableció la conexión a la base de datos", "Base de Datos", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al Conectar a la base de datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }       
        return cnn;
    }
    
    public void closeConnection(){
        try {
            cnn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al cerrar la base de datos", JOptionPane.ERROR_MESSAGE);
        }        
    }    
}