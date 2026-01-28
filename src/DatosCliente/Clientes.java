package DatosCliente;

public class Clientes {
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
