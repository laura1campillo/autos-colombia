/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.autoscolombia.autoscolombia1;

/**
 *
 * @author Daniela
 */
public class AutosColombia1 {

 public static void main(String[] args) {
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.registrarUsuario(new Usuario("Daniela", "daniela123", "Cliente"));
        gestorUsuarios.listarUsuarios();

        GestorCeldas gestorCeldas = new GestorCeldas();
        gestorCeldas.registrarCelda(new Celda("C01", "Libre"));
        gestorCeldas.listarCeldas();
    }
}


