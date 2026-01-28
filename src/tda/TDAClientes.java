package tda;

import model.Cliente;
import java.util.List;

// TDA para la gestión de clientes
public interface TDAClientes {

    // Agrega un cliente al sistema
    boolean agregarCliente(Cliente cliente);

    // Busca un cliente por su nombre
    Cliente buscarPorNombre(String nombre);

    // Busca clientes por su scoring
    List<Cliente> buscarPorScoring(int scoring);

    // Devuelve la cantidad total de clientes
    int cantidadClientes();
}
