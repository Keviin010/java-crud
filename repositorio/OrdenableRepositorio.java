package org.poointerface.repositorio;

import org.poointerface.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion direccion );
}
