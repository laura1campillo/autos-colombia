package com.autoscolombia.autoscolombia1;

import java.time.LocalDate;

public class Pago {
    private Usuario usuario;
    private LocalDate fechaPago;
    private double monto;

    public Pago(Usuario usuario, LocalDate fechaPago, double monto) {
        this.usuario = usuario;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public boolean esPagoDelMesActual() {
        LocalDate ahora = LocalDate.now();
        return fechaPago.getMonth() == ahora.getMonth() && fechaPago.getYear() == ahora.getYear();
    }
}
