/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hernán
 */
public class Coctel {
    
    //Atributos
    private int idCoctel;
    private String nombreCoctel, descripcionCoctel, palabraClaveCoctel, idCategoriaCoctel;

    //Constructores
    public Coctel() {
    }

    public Coctel(int idCoctel, String nombreCoctel, String descripcionCoctel, String palabraClaveCoctel, String idCategoriaCoctel) {
        this.idCoctel = idCoctel;
        this.nombreCoctel = nombreCoctel;
        this.descripcionCoctel = descripcionCoctel;
        this.palabraClaveCoctel = palabraClaveCoctel;
        this.idCategoriaCoctel = idCategoriaCoctel;
    }
    
    
    //Accesadores y conmutadores
    public int getIdCoctel() {
        return idCoctel;
    }

    public void setIdCoctel(int idCoctel) {
        this.idCoctel = idCoctel;
    }

    public String getNombreCoctel() {
        return nombreCoctel;
    }

    public void setNombreCoctel(String nombreCoctel) {
        this.nombreCoctel = nombreCoctel;
    }

    public String getDescripcionCoctel() {
        return descripcionCoctel;
    }

    public void setDescripcionCoctel(String descripcionCoctel) {
        this.descripcionCoctel = descripcionCoctel;
    }

    public String getPalabraClaveCoctel() {
        return palabraClaveCoctel;
    }

    public void setPalabraClaveCoctel(String palabraClaveCoctel) {
        this.palabraClaveCoctel = palabraClaveCoctel;
    }

    public String getIdCategoriaCoctel() {
        return idCategoriaCoctel;
    }

    public void setIdCategoriaCoctel(String idCategoriaCoctel) {
        this.idCategoriaCoctel = idCategoriaCoctel;
    }
    
    
    //ToString
    @Override
    public String toString() {
        return "Coctel{" + "idCoctel=" + idCoctel + ", nombreCoctel=" + nombreCoctel + ", descripcionCoctel=" + descripcionCoctel + ", palabraClaveCoctel=" + palabraClaveCoctel + ", idCategoriaCoctel=" + idCategoriaCoctel + '}';
    }
    
    
}
