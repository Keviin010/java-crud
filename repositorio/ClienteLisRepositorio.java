package org.poointerface.repositorio;

import org.poointerface.modelo.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClienteLisRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteLisRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        // Uso de Stream API para una busqueda mas funcional y clara
        return dataSource.stream()
                .filter(cli -> cli.getId() != null && cli.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente clie = this.porId(cliente.getId());
        if (clie != null) {
            clie.setNombre(cliente.getNombre());
            clie.setApellido(cliente.getApellido());
        }
    }

    @Override
    public void eliminar(Integer id) {
        Cliente clie = this.porId(id);
        if (clie != null) {
            this.dataSource.remove(clie);
        }
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        // Se reemplaza la clase anonima por una expresinn lammbda para mejorar la legibilidad
        dataSource.sort((a, b) -> {
            int resultado = 0;
            String c = (campo == null) ? "" : campo.toLowerCase();
            switch (c) {
                case "id" ->
                    resultado = a.getId().compareTo(b.getId());
                case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
                case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
            }
            return direccion == Direccion.ASC ? resultado : -resultado;
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        // Validar límites y devolver copia de sublista
        if (desde < 0) desde = 0;
        if (hasta > dataSource.size()) hasta = dataSource.size();
        if (desde > hasta) return Collections.emptyList();

        return new ArrayList<>(dataSource.subList(desde, hasta));
    }

}
