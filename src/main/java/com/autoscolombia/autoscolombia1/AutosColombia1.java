package com.autoscolombia.autoscolombia1;

public class AutosColombia1 {

    public static void main(String[] args) {
        // Inicializar gestores
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        GestorCeldas gestorCeldas = new GestorCeldas();
        GestorPagos gestorPagos = new GestorPagos();

        // Registrar usuario y celda
        Usuario usuario = new Usuario("Daniela", "daniela123", "Cliente");
        gestorUsuarios.registrarUsuario(usuario);
        gestorUsuarios.listarUsuarios();

        gestorCeldas.registrarCelda(new Celda("C01", "Libre"));
        gestorCeldas.listarCeldas();

        // Gestión de pagos
        System.out.println("--- Gestión de Pagos ---");

        if (!gestorPagos.usuarioHaPagadoEsteMes(usuario)) {
            gestorPagos.registrarPago(usuario, 150000); // valor mensualidad
        } else {
            System.out.println(" El usuario ya ha pagado este mes");
        }

        gestorPagos.mostrarPagos();
    }
}
