/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoscolombia.autoscolombia1;

/**
 *
 * @author Daniela
 */

public class Usuario {
    private String nombre;
    private String usuario;
    private String rol;

    public Usuario(String nombre, String usuario, String rol) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.rol = rol;
    }

    public String getNombre() { return nombre; }
    public String getUsuario() { return usuario; }
    public String getRol() { return rol; }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Usuario: " + usuario + " | Rol: " + rol;
    }
}
