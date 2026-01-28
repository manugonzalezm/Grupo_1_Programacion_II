package services;

import model.Cliente;
import tda.TDAClientes;

import java.util.*;

// Implementación concreta del TDAClientes
public class GestorClientes implements TDAClientes {

    // Mapa para buscar clientes por nombre
    private Map<String, Cliente> clientesPorNombre = new HashMap<>();

    // Mapa ordenado para buscar clientes por scoring
    private Map<Integer, List<Cliente>> clientesPorScoring = new TreeMap<>();

    // Agrega un cliente
    @Override
    public boolean agregarCliente(Cliente cliente) {
        if (clientesPorNombre.containsKey(cliente.getNombre())) {
            return false; // ya existe
        }

        clientesPorNombre.put(cliente.getNombre(), cliente);

        // Agrega el cliente según su scoring
        clientesPorScoring
                .computeIfAbsent(cliente.getScoring(), k -> new ArrayList<>())
                .add(cliente);

        return true;
    }

    // Busca cliente por nombre
    @Override
    public Cliente buscarPorNombre(String nombre) {
        return clientesPorNombre.get(nombre);
    }

    // Busca clientes por scoring
    @Override
    public List<Cliente> buscarPorScoring(int scoring) {
        return clientesPorScoring.getOrDefault(scoring, new ArrayList<>());
    }

    // Devuelve la cantidad de clientes
    @Override
    public int cantidadClientes() {
        return clientesPorNombre.size();
    }
}
