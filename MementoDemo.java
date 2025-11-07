public class MementoDemo {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        System.out.println("=== DEMO PATRÓN MEMENTO ===\n");

        // Estado inicial
        editor.mostrarEstado();

        // Escribir texto
        editor.escribir("Hola");
        editor.mostrarEstado();

        // Guardar primer estado
        historial.guardarEstado(editor.guardar());

        // Cambiar formato
        editor.cambiarFormato("negrita");
        editor.mostrarEstado();
        historial.guardarEstado(editor.guardar());

        // Escribir más texto
        editor.escribir(" Mundo");
        editor.mostrarEstado();
        historial.guardarEstado(editor.guardar());

        // Mover cursor a mitad del texto
        editor.moverCursor(4);
        editor.mostrarEstado();
        historial.guardarEstado(editor.guardar());

        // Borrar algunos caracteres
        editor.borrar(3);
        editor.mostrarEstado();
        historial.guardarEstado(editor.guardar());

        // Cambiar formato a cursiva y escribir algo más
        editor.cambiarFormato("cursiva");
        editor.escribir(" de nuevo");
        editor.mostrarEstado();
        historial.guardarEstado(editor.guardar());

        // Mostrar tamaño actual del historial
        System.out.println("Historial actual: " + historial.tamaño() + " estados guardados\n");

        // Restaurar (simulando CTRL+Z)
        System.out.println("--- Presionando CTRL+Z ---");
        EditorMemento estadoPrevio = historial.deshacer();
        if (estadoPrevio != null) {
            editor.restaurar(estadoPrevio);
            editor.mostrarEstado();
        }

        // Restaurar de nuevo
        System.out.println("--- Presionando CTRL+Z otra vez ---");
        estadoPrevio = historial.deshacer();
        if (estadoPrevio != null) {
            editor.restaurar(estadoPrevio);
            editor.mostrarEstado();
        }

        // Intentar borrar más de lo que hay (validación)
        System.out.println("--- Probando validación de borrado ---");
        editor.borrar(50);
        editor.mostrarEstado();

        // Intentar mover el cursor fuera de rango (validación)
        System.out.println("--- Probando validación de cursor ---");
        editor.moverCursor(-5);
        editor.moverCursor(999);
        editor.mostrarEstado();

        System.out.println("=== FIN DE LA DEMO ===");
    }
}
