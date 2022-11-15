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

    public boolean AgregarUsuario(Usuario usuario) {

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String sql = "INSERT INTO usuario(nombreUsuario) VALUES = (?, ?, ?)";
            PreparedStatement pst = connx.prepareCall(sql);
            pst.setString(1, usuario.getNombreUsuario());
            pst.setString(2, usuario.getCorreoElectronico());
            pst.setString(3, usuario.getContrasena());

            pst.executeUpdate();
            pst.close();
            connx.close();

            System.out.println("Usuario agregado Correctamente");
            return true;

        } catch (SQLException e) {

            System.out.println("No se pudo agregar los cambios a la Base de Datos SQL" + e.getMessage());
            return false;
        }

    }

    public List<Receta> MostrarReceta() {

        List<Receta> receta = new ArrayList<>();

        try {
            Conexion conexion = new Conexion();
            Connection connx = conexion.obtenerConexion();

            String queryReceta = "SELECT nombreReceta, ingredienteReceta, descripcion FROM receta ORDER BY nombreReceta";
            PreparedStatement pstReceta = connx.prepareStatement(queryReceta);

            ResultSet res = pstReceta.executeQuery();

            while (res.next()) {
                Receta recetaC = new Receta();
                recetaC.setNombreReceta(res.getString("nombreReceta"));
                recetaC.setIngredienteReceta(res.getString("ingredienteReceta"));
                recetaC.setDescripcion(res.getString("descripcion"));

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
