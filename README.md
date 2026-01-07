# Java CRUD Repository with Interfaces

## Descripción
Este proyecto implementa un repositorio CRUD en Java utilizando interfaces y herencia múltiple entre interfaces. Aplica principios de Programación Orientada a Objetos (POO), clean code, ordenamiento y paginación.

El objetivo es mostrar cómo estructurar un repositorio desacoplado y flexible, siguiendo un enfoque similar al Repository Pattern, comúnmente utilizado en aplicaciones backend y frameworks como Spring.

---

## Conceptos aplicados
- Programación Orientada a Objetos (POO)
- Interfaces en Java
- Herencia múltiple entre interfaces
- Patrón Repository
- CRUD (Create, Read, Update, Delete)
- Ordenamiento de datos
- Paginación
- Principio de responsabilidad única
- Código limpio y mantenible

---

## Funcionamiento general
- **CrudRepositorio**: define las operaciones básicas CRUD.
- **OrdenableRepositorio**: permite ordenar los registros.
- **PaginableRepositorio**: permite paginar los resultados.
- **ClienteListRepositorio**: implementación concreta que combina múltiples interfaces.
- **EjemploRepositorio**: clase con método `main` para probar el funcionamiento del repositorio.

---

## Ejemplo de uso

<img width="1028" height="270" alt="Ejemplo de uso del repositorio" src="https://github.com/user-attachments/assets/41632790-cf78-4faf-a427-06f9f631e621" />

---

## Objetivo del proyecto
Proyecto con fines educativos y demostrativos, enfocado en reforzar conceptos intermedios de Java backend y buenas prácticas de diseño orientado a objetos.

---

## Tecnologías utilizadas
- Java
- Colecciones (`List`, `ArrayList`)
- Interfaces
- `Comparator`

---

## Autor
**Kevin Dair**  
Estudiante de Ingeniería de Software  
Desarrollo Backend

---

## Licencia
Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más información.
