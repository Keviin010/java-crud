# Java CRUD Repository with Interfaces

## Descripción
Este proyecto implementa un repositorio CRUD en Java utilizando interfaces y herencia múltiple entre interfaces, aplicando principios de Programación Orientada a Objetos (POO), clean code, ordenamiento y paginación de datos.

El objetivo principal es demostrar cómo estructurar un repositorio desacoplado, flexible y extensible, siguiendo un enfoque conceptual similar al *Repository Pattern*, ampliamente utilizado en aplicaciones backend y frameworks como Spring.

---

## Conceptos aplicados
- Programación Orientada a Objetos (POO)
- Interfaces en Java
- Herencia múltiple entre interfaces
- Patrón Repository (conceptual)
- CRUD (Create, Read, Update, Delete)
- Ordenamiento de datos mediante `Comparator`
- Paginación de resultados
- Principio de Responsabilidad Única (SRP)
- Código limpio, legible y mantenible

---

## Funcionamiento general
- **CrudRepositorio**: define las operaciones básicas de creación, lectura, actualización y eliminación.
- **OrdenableRepositorio**: agrega la capacidad de ordenar los registros según distintos criterios.
- **PaginableRepositorio**: permite paginar los resultados para manejar colecciones de forma eficiente.
- **ClienteListRepositorio**: implementación concreta que combina múltiples interfaces y gestiona los datos en memoria.
- **EjemploRepositorio**: clase con método `main` que demuestra el uso y comportamiento del repositorio.

---

## Ejemplo de uso

<img width="1028" height="270" alt="p1" src="https://github.com/user-attachments/assets/e71f8552-3245-41a4-8bb8-8e865a33b659" />

---

## Objetivo del proyecto
Proyecto con fines educativos y demostrativos, enfocado en reforzar conceptos intermedios de Java backend y buenas prácticas de diseño orientado a objetos, sirviendo como base conceptual para arquitecturas más complejas y el uso posterior de frameworks como Spring Boot.

---

## Tecnologías utilizadas
- Java
- Colecciones (`List`, `ArrayList`)
- Interfaces
- `Comparator`

---

## Autor
**Kevin Royo**  
Estudiante de Ingeniería de Software  


---

## Licencia
Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más información.
