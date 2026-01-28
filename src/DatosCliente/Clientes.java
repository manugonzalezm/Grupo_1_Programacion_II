package DatosCliente;

public class Clientes {
    //* Cada cliente tiene un **nombre** y un **scoring** (un valor que representa su nivel de influencia en la red).
    private String nombre;
    private int scoring;

    public Clientes(String nombre, int scoring) {
        this.nombre = nombre;
        this.scoring = scoring;
    }
    public String getNombre() {
        return nombre;
    }

    public int getScoring() {
        return scoring;
    }
}
