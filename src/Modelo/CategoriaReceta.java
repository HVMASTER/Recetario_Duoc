
package Modelo;

/**
 *
 * @author Hernán
 */
public class CategoriaReceta {
    
    //Atributos
    private int idCategoriaReceta;
    private String nombreCategoriaReceta;
    
    //Constructores

    public CategoriaReceta() {
    }

    public CategoriaReceta(int idCategoriaReceta, String nombreCategoriaReceta) {
        this.idCategoriaReceta = idCategoriaReceta;
        this.nombreCategoriaReceta = nombreCategoriaReceta;
    }
    
    public CategoriaReceta(String nombreCategoriaReceta) {
        this.nombreCategoriaReceta = nombreCategoriaReceta;
    }
    
    
    //Accesadores y conmutadores

    public int getIdCategoriaReceta() {
        return idCategoriaReceta;
    }

    public void setIdCategoriaReceta(int idCategoriaReceta) {
        this.idCategoriaReceta = idCategoriaReceta;
    }

    public String getNombreCategoriaReceta() {
        return nombreCategoriaReceta;
    }

    public void setNombreCategoriaReceta(String nombreCategoriaReceta) {
        this.nombreCategoriaReceta = nombreCategoriaReceta;
    }
    
    //ToString

    @Override
    public String toString() {
        return  this.nombreCategoriaReceta;
    }
    
   
    
}
