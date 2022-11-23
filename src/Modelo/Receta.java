package Modelo;

/**
 *
 * @author Hernán
 */
public class Receta {
    
    //Atributos
    private int idReceta, tiempo, idCategoriaReceta;
    private String nombreReceta, porciones, preparacion, ingredientes;

    public Receta() {
    }

    public Receta(int idReceta, int tiempo, int idCategoriaReceta, String nombreReceta, String porciones, String preparacion, String ingredientes) {
        this.idReceta = idReceta;
        this.tiempo = tiempo;
        this.idCategoriaReceta = idCategoriaReceta;
        this.nombreReceta = nombreReceta;
        this.porciones = porciones;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int timepo) {
        this.tiempo = timepo;
    }

    public int getIdCategoriaReceta() {
        return idCategoriaReceta;
    }

    public void setIdCategoriaReceta(int idCategoriaReceta) {
        this.idCategoriaReceta = idCategoriaReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getPorciones() {
        return porciones;
    }

    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", timepo=" + tiempo + ", idCategoriaReceta=" + idCategoriaReceta + ", nombreReceta=" + nombreReceta + ", porciones=" + porciones + ", preparacion=" + preparacion + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
