package tda;

import model.SolicitudSeguimiento;

// TDA para manejar solicitudes de seguimiento
public interface TDASolicitudesSeguimiento {

    // Agrega una solicitud a la cola
    void agregarSolicitud(SolicitudSeguimiento solicitud);

    // Procesa la siguiente solicitud en orden
    SolicitudSeguimiento procesarSolicitud();

    // Indica si hay solicitudes pendientes
    boolean haySolicitudes();
}
