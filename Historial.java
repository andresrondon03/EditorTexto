import java.util.LinkedList;

public class Historial {
    private LinkedList<EditorMemento> historial = new LinkedList<>();

    public void guardarEstado(EditorMemento memento) {
        if (historial.size() == 10) {
            historial.removeFirst(); // elimina el más antiguo
        }
        historial.addLast(memento);
    }

    public EditorMemento deshacer() {
        if (historial.isEmpty()) {
            System.out.println("No hay estados para deshacer.");
            return null;
        }
        return historial.removeLast();
    }

    public int tamaño() {
        return historial.size();
    }
}
