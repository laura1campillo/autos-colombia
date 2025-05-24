/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoscolombia.autoscolombia1;

/**
 *
 * @author Daniela
 */




import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario);
    }

    public void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
