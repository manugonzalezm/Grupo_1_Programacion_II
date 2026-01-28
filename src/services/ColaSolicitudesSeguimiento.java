package services;

import model.SolicitudSeguimiento;
import tda.TDASolicitudesSeguimiento;

import java.util.LinkedList;
import java.util.Queue;

// Implementación de la cola de solicitudes de seguimiento
public class ColaSolicitudesSeguimiento implements TDASolicitudesSeguimiento {

    // Cola de solicitudes
    private Queue<SolicitudSeguimiento> solicitudes = new LinkedList<>();

    // Agrega una solicitud a la cola
    @Override
    public void agregarSolicitud(SolicitudSeguimiento solicitud) {
        solicitudes.add(solicitud);
    }

    // Procesa la siguiente solicitud
    @Override
    public SolicitudSeguimiento procesarSolicitud() {
        return solicitudes.poll();
    }

    // Verifica si hay solicitudes pendientes
    @Override
    public boolean haySolicitudes() {
        return !solicitudes.isEmpty();
    }
}
