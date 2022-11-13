/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        return "CategoriaReceta{" + "idCategoriaReceta=" + idCategoriaReceta + ", nombreCategoriaReceta=" + nombreCategoriaReceta + '}';
    }
    
   
    
}
