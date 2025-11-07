public class EditorTexto {
    private String contenido;
    private int posicionCursor;
    private String formato;

    public EditorTexto() {
        this.contenido = "";
        this.posicionCursor = 0;
        this.formato = "normal";
    }

    // Método para escribir texto
    public void escribir(String texto) {
        contenido += texto;
        posicionCursor = contenido.length();
        System.out.println("Escribiendo: " + texto);
    }

    // Método para borrar 
    public void borrar(int numCaracteres) {
        if (numCaracteres > contenido.length()) {
            System.out.println("No puedes borrar más caracteres de los que existen.");
            return;
        }
        contenido = contenido.substring(0, contenido.length() - numCaracteres);
        posicionCursor = contenido.length();
        System.out.println("Borrando los últimos " + numCaracteres + " caracteres.");
    }

    // Método para cambiar el formato
    public void cambiarFormato(String formato) {
        this.formato = formato;
        System.out.println("Formato cambiado a: " + formato);
    }
    
    // Método para mover el cursor
    public void moverCursor(int posicion) {
        if (posicion < 0 || posicion > contenido.length()) {
            System.out.println("Posición fuera de rango.");
            return;
        }
        this.posicionCursor = posicion;
        System.out.println("Cursor movido a posición: " + posicion);
    }

    // CREA un memento con el estado actual
    public EditorMemento guardar() {
        System.out.println("Guardando estado...");
        return new EditorMemento(contenido, posicionCursor, formato);
    }

    // RESTAURA el estado desde un memento
    public void restaurar(EditorMemento memento) {
        this.contenido = memento.getContenido();
        this.posicionCursor = memento.getPosicionCursor();
        this.formato = memento.getFormato();
        System.out.println("Estado restaurado");
    }

    public void mostrarEstado() {
        System.out.println("\nEstado del editor");
        System.out.println("Contenido: " + contenido);
        System.out.println("Cursor en: " + posicionCursor);
        System.out.println("Formato: " + formato + "\n");
    }
}
