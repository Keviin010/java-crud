package org.poointerface.repositorio;

import org.poointerface.modelo.Cliente;

import java.util.List;

/*  Se agrega el tipo generico <T> para que la interfaz pueda ser utilizada  con cualquier clase de modelo, 
siguiendo el patrón Repository en este casooo
 */
public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar (Integer id);
}
