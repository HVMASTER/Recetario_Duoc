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
    
    public List<Receta> MostrarReceta(){
        
        List<Receta> receta = new ArrayList<>();
        
        try{
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String queryReceta = "SELECT nombreReceta, ingredienteReceta, descripcion FROM receta ORDER BY nombreReceta";
            PreparedStatement pstReceta = connx.prepareStatement(queryReceta);

            ResultSet res = pstReceta.executeQuery();

            while(res.next()){
                Receta recetaC = new Receta();
                recetaC.setNombreReceta(res.getString("nombreReceta"));
                recetaC.setIngredienteReceta(res.getString("ingredienteReceta"));
                recetaC.setDescripcion(res.getString("descripcion"));

                receta.add(recetaC);    
            }

            res.close();
            pstReceta.close();
            connx.close();
            
        }catch(SQLException e){
            
            System.out.println("No se pudieron tomar los datos desde la Base de Datos SQL");   
        }
        
        return receta;
    }
    
    /*
    public boolean ingresoUsuario(Usuario usuario){
        
        try{         
        Conexion conexion = new Conexion();
        Connection connx = conexion.obtenerConexion();
     
        String queryIngreso = "SELECT nombreUsuario, contraseña FROM usuario WHERE nombreUsuario = ? AND contraseña = ?";
        PreparedStatement pstIngreso = connx.prepareStatement(queryIngreso);
        
        pstIngreso.executeUpdate();
        ResultSet rs = pstIngreso.executeQuery(queryIngreso); //DEVUELVE EL RESULTADO DE UNA CONSULTA
        
        
        
        rs.close();
        pstIngreso.close(); 
        connx.close();
        System.out.println("Ingreso de usuario correcto!");
        return true;
        }catch(SQLException e){
            System.out.println("No se pudo ingresar al menu, usuario o contraseña incorrecta");
          return false;           
                }
    }
    **/
    
    
    
    
}
