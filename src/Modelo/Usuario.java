/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hernán
 */
public class Usuario {
    
    //Atributos
    private int idUsuario;
    private String nombreUsuario, correoElectronico, contrasena, nivelPermiso;
    
    
    //Constructores
    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String correoElectronico, String contrasena, String nivelPermiso) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.nivelPermiso = nivelPermiso;
    }
    
    //Conmutadores y accesadores

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(String nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }
    
    
    //TosString
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + ", contrasena=" + contrasena + ", nivelPermiso=" + nivelPermiso + '}';
    }
    
    
    
}
