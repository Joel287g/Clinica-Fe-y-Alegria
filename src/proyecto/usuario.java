package proyecto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class usuario {
    
    private String nombre, apellido, cargo, codigo, asistencia;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private conectarBD cnn;
    
    public usuario(){
        ps = null;
        rs = null;
        cnn = new conectarBD();
    }
    
    //Método agregar usuario
    public int agregarUsuario(){
        int resultado = 0;
        
        try {
            String SQL = "INSERT INTO clinica (nombre, apellido, cargo, codigo, asistencia) VALUES (?, ?, ?, ?, ?)";
            setPs(getCnn().getConnection().prepareStatement(SQL));
            getPs().setString(1, this.nombre);
            getPs().setString(2, this.apellido);
            getPs().setString(3, this.cargo);
            getPs().setString(4, this.codigo);
            getPs().setString(5, this.asistencia);            
            
            resultado = getPs().executeUpdate();
            System.out.println("Resultado = " + resultado);
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro completado");
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al registrar", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            setPs(null);
            getCnn().closeConnection();
        }
        return resultado;
    }
    
    //Método consultar usuario
    public ResultSet consultarUsuario(){
        try {
            String SQL = "SELECT * FROM clinica WHERE codigo=?";
            
            setPs(getCnn().getConnection().prepareStatement(SQL));
            getPs().setString(1, this.codigo);
            setRs(getPs().executeQuery());
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al consultar", JOptionPane.ERROR_MESSAGE);
        }
        return getRs();
    }
    
    //Método listar usuarios
    public ResultSet listarUsuarios(){
        try {
            String SQL = "SELECT * FROM clinica";
            setPs(getCnn().getConnection().prepareStatement(SQL));              
            setRs(getPs().executeQuery());     
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de consulta", JOptionPane.ERROR_MESSAGE);        
        }         
        return getRs();
    }
    
    //Método modificar usuario
    public int modificarUsuario(){
        int resultado = 0;
        
        try {
            String SQL = "UPDATE clinica SET nombre=?, apellido=?, cargo=?, asistencia=? WHERE codigo=?";
            
            setPs(getCnn().getConnection().prepareStatement(SQL));
            getPs().setString(1, this.nombre);
            getPs().setString(2, this.apellido);
            getPs().setString(3, this.cargo);
            getPs().setString(4, this.asistencia);
            getPs().setString(5, this.codigo);
            
            resultado = getPs().executeUpdate();
            System.out.println("Resultado = " + resultado);
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado con exito");
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al modificar", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            setPs(null);
            getCnn().closeConnection();
        }
        return resultado;
    }
    
    //Método eliminar usuario
    public int eliminarUsuario(){
        int resultado = 0;
        try {
            String SQL = "DELETE FROM clinica WHERE codigo=?";
            
            setPs(getCnn().getConnection().prepareStatement(SQL));
            getPs().setString(1, this.codigo);
            resultado = getPs().executeUpdate();
            
            System.out.println("Resultado = " + resultado);
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            setPs(null);
            getCnn().closeConnection();
        }
        return resultado;
    }
    
    //Método cerrar conexión
    public void cerrarConexion(){        
        getCnn().closeConnection();              
    }
        
    //Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }    

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
    
    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public conectarBD getCnn() {
        return cnn;
    }

    public void setCnn(conectarBD cnn) {
        this.cnn = cnn;
    }
}