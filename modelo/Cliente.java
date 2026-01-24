package org.poointerface.modelo;

import java.util.Objects;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellido;
    private static int UltimoId;

    public Cliente() {
        this.id = ++UltimoId;
    }

    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id
                + ", nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        // Corregido: El hashCode debe ser consistente con equals() para funcionar correctamente
        // en estructuras de datos como HashSet o HashMap. Retornar 0 anulaba el beneficio de estas tablas
        return Objects.hash(id);
    }
}
