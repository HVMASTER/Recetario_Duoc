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
    private int idUsuario, nivelPermiso;
    private String nombreUsuario, correoElectronico, contrasena;

    public Usuario() {
    }

    public Usuario(int idUsuario, int nivelPermiso, String nombreUsuario, String correoElectronico, String contrasena) {
        this.idUsuario = idUsuario;
        this.nivelPermiso = nivelPermiso;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nivelPermiso=" + nivelPermiso + ", nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + ", contrasena=" + contrasena + '}';
    }

}
