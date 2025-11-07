public class EditorMemento {
    private final String contenido;
    private final int posicionCursor;
    private final String formato;

    public EditorMemento(String contenido, int posicionCursor, String formato) {
        this.contenido = contenido;
        this.posicionCursor = posicionCursor;
        this.formato = formato;
    }

    public String getContenido() {
        return contenido;
    }

    public int getPosicionCursor() {
        return posicionCursor;
    }

    public String getFormato() {
        return formato;
    }
}