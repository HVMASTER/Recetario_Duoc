/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hernán
 */
public class Receta {
    
    //Atributos
    private int idReceta;
    private String nombreReceta, descripcion, palabraClave, idCategoriaReceta,ingredienteReceta;
    
    
    //Constructores

    public Receta() {
    }

    public Receta(int idReceta, String nombreReceta, String descripcion, String palabraClave, String idCategoriaReceta, String ingredienteReceta) {
        this.idReceta = idReceta;
        this.nombreReceta = nombreReceta;
        this.descripcion = descripcion;
        this.palabraClave = palabraClave;
        this.idCategoriaReceta = idCategoriaReceta;
        this.ingredienteReceta = ingredienteReceta;
    }
    
    //Conmutadores y accesadores
    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public String getIdCategoriaReceta() {
        return idCategoriaReceta;
    }

    public void setIdCategoriaReceta(String idCategoriaReceta) {
        this.idCategoriaReceta = idCategoriaReceta;
    }

    public String getIngredienteReceta() {
        return ingredienteReceta;
    }

    public void setIngredienteReceta(String ingredienteReceta) {
        this.ingredienteReceta = ingredienteReceta;
    }
   
    
    //ToString
    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", nombreReceta=" + nombreReceta + ", descripcion=" + descripcion + ", palabraClave=" + palabraClave + ", idCategoriaReceta=" + idCategoriaReceta + ", ingredienteReceta=" + ingredienteReceta + '}';
    }
    
    
}
