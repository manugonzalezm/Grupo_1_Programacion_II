package tda;

import model.Accion;

// TDA para el historial de acciones
public interface TDAHistorialAcciones {

    // Registra una nueva acción en el historial
    void registrarAccion(Accion accion);

    // Deshace la última acción realizada
    Accion deshacerUltimaAccion();

    // Indica si hay acciones registradas
    boolean hayAcciones();
}
