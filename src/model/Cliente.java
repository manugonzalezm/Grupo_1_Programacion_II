package model;

// Representa a un cliente de la red social
public class Cliente {

    // Nombre del cliente
    private String nombre;

    // Scoring o nivel de influencia del cliente
    private int scoring;

    // Constructor del cliente
    public Cliente(String nombre, int scoring) {
        this.nombre = nombre;
        this.scoring = scoring;
    }

    // Devuelve el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Devuelve el scoring del cliente
    public int getScoring() {
        return scoring;
    }
}
