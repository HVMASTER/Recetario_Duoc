/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hernán
 */
public class CategoriaCoctel {
    
    //Atributos
    private int idCategoriaCoctel;
    private String nombreCategoriaCoctel;
    
    
    //Constructores

    public CategoriaCoctel() {
    }

    public CategoriaCoctel(int idCategoriaCoctel, String nombreCategoriaCoctel) {
        this.idCategoriaCoctel = idCategoriaCoctel;
        this.nombreCategoriaCoctel = nombreCategoriaCoctel;
    }
    
    
    //Accesadores y conmutadores 

    public int getIdCategoriaCoctel() {
        return idCategoriaCoctel;
    }

    public void setIdCategoriaCoctel(int idCategoriaCoctel) {
        this.idCategoriaCoctel = idCategoriaCoctel;
    }

    public String getNombreCategoriaCoctel() {
        return nombreCategoriaCoctel;
    }

    public void setNombreCategoriaCoctel(String nombreCategoriaCoctel) {
        this.nombreCategoriaCoctel = nombreCategoriaCoctel;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "CategoriaCoctel{" + "idCategoriaCoctel=" + idCategoriaCoctel + ", nombreCategoriaCoctel=" + nombreCategoriaCoctel + '}';
    }
    
    
}
