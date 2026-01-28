package services;

import model.Accion;
import tda.TDAHistorialAcciones;

import java.util.Stack;

// Implementación del historial de acciones usando una pila
public class HistorialAcciones implements TDAHistorialAcciones {

    // Pila de acciones
    private Stack<Accion> acciones = new Stack<>();

    // Registra una acción
    @Override
    public void registrarAccion(Accion accion) {
        acciones.push(accion);
    }

    // Deshace la última acción
    @Override
    public Accion deshacerUltimaAccion() {
        if (acciones.isEmpty()) {
            return null;
        }
        return acciones.pop();
    }

    // Verifica si hay acciones
    @Override
    public boolean hayAcciones() {
        return !acciones.isEmpty();
    }
}
