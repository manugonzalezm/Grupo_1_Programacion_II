package model;

// Representa una solicitud de seguimiento entre dos clientes
public class SolicitudSeguimiento {

    // Cliente que solicita seguir a otro
    private String solicitante;

    // Cliente que va a ser seguido
    private String solicitado;

    // Constructor de la solicitud
    public SolicitudSeguimiento(String solicitante, String solicitado) {
        this.solicitante = solicitante;
        this.solicitado = solicitado;
    }

    // Devuelve quién solicita el seguimiento
    public String getSolicitante() {
        return solicitante;
    }

    // Devuelve a quién se quiere seguir
    public String getSolicitado() {
        return solicitado;
    }
}

