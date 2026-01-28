package model;

import java.time.LocalDateTime;

// Representa una acción realizada en el sistema
public class Accion {

    // Tipo de acción (ej: "agregar cliente", "seguir cliente")
    private String tipo;

    // Detalle de la acción
    private String detalle;

    // Fecha y hora en la que ocurrió la acción
    private LocalDateTime fechaHora;

    // Constructor de la acción
    public Accion(String tipo, String detalle) {
        this.tipo = tipo;
        this.detalle = detalle;
        this.fechaHora = LocalDateTime.now(); // se guarda el momento actual
    }

    // Devuelve el tipo de acción
    public String getTipo() {
        return tipo;
    }

    // Devuelve el detalle de la acción
    public String getDetalle() {
        return detalle;
    }

    // Devuelve la fecha y hora de la acción
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
