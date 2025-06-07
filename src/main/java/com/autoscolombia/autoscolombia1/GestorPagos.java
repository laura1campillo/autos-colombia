package com.autoscolombia.autoscolombia1;

import java.util.ArrayList;
import java.util.List;

public class GestorPagos {
    private List<Pago> pagos;

    public GestorPagos() {
        this.pagos = new ArrayList<>();
    }

    public void registrarPago(Usuario usuario, double monto) {
        Pago nuevoPago = new Pago(usuario, java.time.LocalDate.now(), monto);
        pagos.add(nuevoPago);
        System.out.println("Pago registrado para " + usuario.getNombre());
    }

    public boolean usuarioHaPagadoEsteMes(Usuario usuario) {
        for (Pago pago : pagos) {
            if (pago.getUsuario().equals(usuario) && pago.esPagoDelMesActual()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarPagos() {
        System.out.println("Lista de pagos registrados:");
        for (Pago pago : pagos) {
            System.out.println("Usuario: " + pago.getUsuario().getNombre() +
                               " | Fecha: " + pago.getFechaPago() +
                               " | Monto: $" + pago.getMonto());
        }
    }
}
