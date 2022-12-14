package Controlador;

import Bd.Conexion;
import Modelo.Receta;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Hernán
 */
public class RegistroUsuario {

    public boolean AgregarUsuario(Usuario usuario) {

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String query = "INSERT INTO usuario(nombreUsuario, correoElectronico, contrasena) VALUES (?,?,?)";
            PreparedStatement pst = connx.prepareStatement(query);
            pst.setString(1, usuario.getNombreUsuario());
            pst.setString(2, usuario.getCorreoElectronico());
            pst.setString(3, usuario.getContrasena());

            pst.executeUpdate();
            pst.close();
            connx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("No se pudo agregar los cambios a la Base de Datos" + e.getMessage());
            return false;
        }

    }

    public boolean verificadorCorreo(String correo){
        
        Pattern patrones = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patrones.matcher(correo);
        return mat.find();
    }
    
}
