package org.poointerface;

import org.poointerface.modelo.Cliente;
import org.poointerface.repositorio.*;

import java.util.List;

public class AppRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteLisRepositorio();
        repo.crear(new Cliente("Luis","Ramos"));
        repo.crear(new Cliente("Carlos","Gomez"));
        repo.crear(new Cliente("Mateo","Petro"));
        repo.crear(new Cliente("Kevin","Cuesta"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== Paginable =====");

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 3);
        paginable.forEach(cliente -> System.out.println(cliente));

        System.out.println("===== Ordenar =====");
        List<Cliente> ClientesOrdenAsc =((OrdenableRepositorio)repo).
                                        listar("nombre", Direccion.ASC);

        for (Cliente client: ClientesOrdenAsc){
            System.out.println(client);
        }

        System.out.println("===== Editar =====");
        Cliente beaActualizar = new Cliente("Bea","Manga");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);


        /*System.out.println("===== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);*/



    }
}
