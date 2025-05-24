/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoscolombia.autoscolombia1;

/**
 *
 * @author Daniela
 */


public class Celda {
    private String codigo;
    private String estado; // Libre, Ocupada, Reservada

    public Celda(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return "Celda: " + codigo + " | Estado: " + estado;
    }
}
