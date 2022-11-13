package Controlador;

import Bd.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Hernán
 */
public class RegistroUsuario {
    
    public boolean AgregarNuevoUsuario(Usuario usuario){
        
      try{    
        Conexion conexion = new Conexion();
        Connection connx = conexion.obtenerConexion();
        
        String queryNombreUsuario = "INSERT INTO usuario(nombreUsuario) VALUES = (?)";
        PreparedStatement pstNomUser = connx.prepareStatement(queryNombreUsuario);
               
        String queryCorreoElectronico = "INSERT INTO usuario(correoElectronico) VALUES = (?)";
        PreparedStatement pstCorreo = connx.prepareStatement(queryCorreoElectronico);
        
        String queryContraseña = "INSERT INTO usuario(contraseña) VALUES = (?)";
        PreparedStatement pstContraseña = connx.prepareStatement(queryContraseña);
        
        pstNomUser.executeUpdate();
        pstNomUser.close();
        
        pstCorreo.executeUpdate();
        pstCorreo.close();
        
        pstContraseña.executeUpdate();
        pstContraseña.close();
        
        connx.close();
        System.out.println("Usuario agregado Correctamente");
        return true;
               
      }catch(SQLException exception){
          
          System.out.println("No se pudo agregar los cambios a la Base de Datos SQL");
          return false; 
      }
    
    }
    
}
