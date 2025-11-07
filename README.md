# Memento
# Ejercicio #1 - Editor de texto con deshacer

## Integrantes del Grupo 
- **Sara Sofia Castro Quiroga** - 20231020212  
- **Andres Felipe Rondon Lara** - 20232020005  

---

Objetivo:
Implementar el patrón Memento en un editor de texto simple que permita deshacer operaciones de edición sin exponer los detalles internos del estado del editor.

Requisitos del Editor:

• La clase EditorTexto debe mantener: contenido del texto (String), posición del cursor (int), y formato actual (String: "normal", "negrita", "cursiva").

• Métodos: escribir(String texto), borrar(int numCaracteres), cambiarFormato(String formato), moverCursor(int posicion).

• Debe permitir deshacer las últimas 10 operaciones.

• El memento debe ser inmutable y encapsular completamente el estado.

Nota: Implementar validaciones para no deshacer si no hay historial y no permitir 
borrar más caracteres de los que existen.
