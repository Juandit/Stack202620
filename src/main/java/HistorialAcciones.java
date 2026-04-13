import java.util.Stack;

public class HistorialAcciones {

    private Stack<String> historial;

    public HistorialAcciones() {
        historial = new Stack<>();
    }

    public boolean registrarAccion(String accion) {
        if(accion== null || accion.trim().isEmpty()){
            return false;
        }
        historial.push(accion);
        return true;
    }

    public String obtenerUltimaAccion() {
        if (estaVacio()){
            return "No existio una ultima accion!!";
        }
        return historial.peek();
    }

    public String deshacerAccion() {
        if(estaVacio()){
            return "No existe nada por deshacer";
        }
        return historial.pop();
    }

    public int obtenerCantidadAcciones() {
        return historial.size();
    }

    public boolean estaVacio() {
        return historial.isEmpty();
    }


    public String mostrarHistorial() {
        if (estaVacio()){
            return "Historial Vacio";
        }

        return  historial.toString();
    }
}
