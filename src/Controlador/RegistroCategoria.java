package Controlador;

import Bd.Conexion;
import Modelo.CategoriaReceta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Abarca
 */
public class RegistroCategoria {
    
    public boolean agregarCategoria(CategoriaReceta categoria)
    {
        try {
            
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();
            
            String query = "INSERT INTO categoria(nombreCategoria) values(?)";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setString(1,categoria.getNombreCategoriaReceta());
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error de SQL : " + e.getMessage());
            return false;
        }
        
    }

    public boolean editarCategoria(int BuscaIdCategoria, String NewNombreCategoria)
    {
        try {
            
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();
            
            String query = "UPDATE categoria set nombreCategoriaReceta=? where idCategoriaReceta = ? ";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setInt(2,BuscaIdCategoria);
            stmt.setString(1, NewNombreCategoria);
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error de SQL : " + e.getMessage());
            return false;
        }
        
    }
    
    public List<CategoriaReceta> MostrarListadoCategoria() {

        List<CategoriaReceta> categoria = new ArrayList<>();

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String queryReceta = "SELECT idCategoriaReceta, nombreCategoriaReceta FROM receta ORDER BY nombreCategoriaReceta";
            PreparedStatement pstReceta = connx.prepareStatement(queryReceta);

            ResultSet res = pstReceta.executeQuery();

            while (res.next()) {
                CategoriaReceta cat = new CategoriaReceta();
                cat.setIdCategoriaReceta(res.getInt("idCategoriaReceta"));
                cat.setNombreCategoriaReceta(res.getString("nombreCategoriaReceta"));

                categoria.add(cat);
            }

            res.close();
            pstReceta.close();
            connx.close();

        } catch (SQLException e) {

            System.out.println("No se pudieron tomar los datos desde la Base de Datos SQL");
        }

        return categoria;
    }
}
