import Controlador.ControlarHabitacion;
import Vista.Consola;

public class Main {

    public static void main(String[] args) {
        Consola consola = new Consola();
        int largo = consola.obtenerLargo();
        int ancho = consola.obtenerAncho();
        int capacidadBasura = consola.obtenerCapacidadBasura();

        ControlarHabitacion controlar = new ControlarHabitacion(largo, ancho, capacidadBasura);
        controlar.start();
        consola.cerrarScanner();
    }
}
