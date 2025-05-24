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

public class GestorCeldas {
    private ArrayList<Celda> celdas = new ArrayList<>();

    public void registrarCelda(Celda celda) {
        celdas.add(celda);
        System.out.println("Celda registrada: " + celda);
    }

    public void listarCeldas() {
        System.out.println("Lista de celdas:");
        for (Celda c : celdas) {
            System.out.println(c);
        }
    }
}
