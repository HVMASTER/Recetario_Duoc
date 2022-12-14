package Controlador;

import Bd.Conexion;
import Modelo.Receta;
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
public class RegistroReceta {

    public boolean agregarReceta(Receta receta) {
        try {

            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "INSERT INTO receta(nombreReceta,tiempo,porciones,preparacion,ingredientes,idCategoriaReceta) values(?,?,?,?,?,?)";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setString(1, receta.getNombreReceta());
            stmt.setInt(2, receta.getTiempo());
            stmt.setString(3, receta.getPorciones());
            stmt.setString(4, receta.getPreparacion());
            stmt.setString(5, receta.getIngredientes());
            stmt.setInt(6, receta.getIdCategoriaReceta());

            stmt.executeUpdate();
            stmt.close();
            conx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error de SQL : " + e.getMessage());
            return false;
        }

    }

        public boolean eliminarReceta(int idReceta)
    {
        try {
            
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();
            
            String query = "DELETE FROM receta WHERE idReceta = ?";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setInt(1,idReceta);
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error de SQL de Borrar datos tabla: " + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean editarReceta(int BuscaIdReceta, String NewNombreReceta, int NewTiempo, String NewPorciones, String NewPreparacion, String NewIngredientes, int NewCategoria) {
        try {

            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "UPDATE receta set nombreReceta=?, tiempo=? ,porciones=? ,preparacion=? ,ingredientes=? ,idCategoriaReceta=? where idReceta = ? ";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setInt(7, BuscaIdReceta);
            stmt.setString(1, NewNombreReceta);
            stmt.setInt(2, NewTiempo);
            stmt.setString(3, NewPorciones);
            stmt.setString(4, NewPreparacion);
            stmt.setString(5, NewIngredientes);
            stmt.setInt(6, NewCategoria);

            stmt.executeUpdate();
            stmt.close();
            conx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error de SQL : " + e.getMessage());
            return false;
        }

    }

    public List<Receta> MostrarListadoRecetas() {

        List<Receta> receta = new ArrayList<>();

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String queryReceta = "SELECT idReceta, nombreReceta, tiempo, porciones, preparacion, ingredientes, idCategoriaReceta FROM receta ORDER BY nombreReceta";
            PreparedStatement pstReceta = connx.prepareStatement(queryReceta);

            ResultSet res = pstReceta.executeQuery();

            while (res.next()) {
                Receta recetaC = new Receta();
                recetaC.setIdReceta(res.getInt("idReceta"));
                recetaC.setNombreReceta(res.getString("nombreReceta"));
                recetaC.setTiempo(res.getInt("tiempo"));
                recetaC.setPorciones(res.getString("porciones"));
                recetaC.setIdCategoriaReceta(res.getInt("idCategoriaReceta"));

                receta.add(recetaC);
            }

            res.close();
            pstReceta.close();
            connx.close();

        } catch (SQLException e) {

            System.out.println("No se pudieron tomar los datos desde la Base de Datos SQL");
        }

        return receta;
    }

    public Receta buscarRecetaId(int id) {

        Receta data = new Receta();

        try {

            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "SELECT * FROM receta where idReceta = ?";
            PreparedStatement stmt = conx.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet respuesta = stmt.executeQuery();

            if (respuesta.next()) {

                data.setNombreReceta(respuesta.getString("NombreReceta"));
                data.setTiempo(respuesta.getInt("Tiempo"));
                data.setPorciones(respuesta.getString("Porciones"));
                data.setPreparacion(respuesta.getString("Preparacion"));
                data.setIngredientes(respuesta.getString("Ingredientes"));
                data.setIdCategoriaReceta(respuesta.getInt("IdCategoriaReceta"));

            }

            respuesta.close();
            stmt.close();
            conx.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL de Consultar datos tabla Receta por nombre : " + e.getMessage());

        }
        System.out.println(data);
        return data;

    }

    public List<Receta> MostrarListadoRecetasCategoria(int idCategoria) {

        List<Receta> receta = new ArrayList<>();

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String queryReceta = "SELECT idReceta, nombreReceta, tiempo, porciones, preparacion, ingredientes FROM receta where idCategoriaReceta = ? ORDER BY nombreReceta";
            PreparedStatement pstReceta = connx.prepareStatement(queryReceta);
            pstReceta.setInt(1, idCategoria);
            ResultSet res = pstReceta.executeQuery();


            while (res.next()) {
                Receta recetaC = new Receta();
                recetaC.setIdReceta(res.getInt("idReceta"));
                recetaC.setNombreReceta(res.getString("nombreReceta"));
                recetaC.setTiempo(res.getInt("tiempo"));
                recetaC.setPorciones(res.getString("porciones"));
                recetaC.setIdCategoriaReceta(idCategoria);

                receta.add(recetaC);
            }

            res.close();
            pstReceta.close();
            connx.close();

        } catch (SQLException e) {

            System.out.println("No se pudieron tomar los datos desde la Base de Datos SQL");
        }

        return receta;
    }
}
