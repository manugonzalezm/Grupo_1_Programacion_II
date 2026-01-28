package app;

import model.Cliente;
import model.Accion;
import model.SolicitudSeguimiento;
import services.GestorClientes;
import services.HistorialAcciones;
import services.ColaSolicitudesSeguimiento;

public class Main {

    public static void main(String[] args) {

        // ====== GESTIÓN DE CLIENTES ======

        // Creamos el gestor de clientes
        GestorClientes gestorClientes = new GestorClientes();

        // Creamos algunos clientes
        Cliente c1 = new Cliente("Alice", 95);
        Cliente c2 = new Cliente("Bob", 88);
        Cliente c3 = new Cliente("Charlie", 80);

        // Agregamos clientes al sistema
        gestorClientes.agregarCliente(c1);
        gestorClientes.agregarCliente(c2);
        gestorClientes.agregarCliente(c3);

        // Buscamos un cliente por nombre
        System.out.println("Buscar por nombre Alice:");
        System.out.println(gestorClientes.buscarPorNombre("Alice"));

        // Buscamos clientes por scoring
        System.out.println("\nBuscar por scoring 88:");
        System.out.println(gestorClientes.buscarPorScoring(88));

        // ====== HISTORIAL DE ACCIONES ======

        // Creamos el historial de acciones
        HistorialAcciones historial = new HistorialAcciones();

        // Registramos acciones
        historial.registrarAccion(new Accion("Agregar cliente", "Alice"));
        historial.registrarAccion(new Accion("Agregar cliente", "Bob"));

        // Deshacemos la última acción
        System.out.println("\nDeshacer última acción:");
        System.out.println(historial.deshacerUltimaAccion().getDetalle());

        // ====== SOLICITUDES DE SEGUIMIENTO ======

        // Creamos la cola de solicitudes
        ColaSolicitudesSeguimiento cola = new ColaSolicitudesSeguimiento();

        // Agregamos solicitudes
        cola.agregarSolicitud(new SolicitudSeguimiento("Alice", "Bob"));
        cola.agregarSolicitud(new SolicitudSeguimiento("Charlie", "Alice"));

        // Procesamos solicitudes en orden
        System.out.println("\nProcesar solicitudes:");
        while (cola.haySolicitudes()) {
            SolicitudSeguimiento s = cola.procesarSolicitud();
            System.out.println(s.getSolicitante() + " quiere seguir a " + s.getSolicitado());
        }
    }
}
