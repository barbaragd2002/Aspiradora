package Vista;

public class VistaAspiradora {
    public static void bolsaDeBasuraLlena() {
        System.out.println("La bolsa de basura está llena");
    }

    public static void bolsaDeBasuraVaciada() {
        System.out.println("La bolsa de basura ha sido vaciada");
    }

    public static void nivelDeBateria(int nivel) {
        System.out.println("Nivel de batería de la aspiradora: " + nivel);
    }

    public static void bateriaAgotada() {
        System.err.println("La aspiradora no se puede mover porque la batería agotad");
    }

    public static void limpiarCasilla(int x, int y) {
        System.out.println("La aspiradora ha limpiado la casilla en las coordenadas: (" + x + ", " + y + ")");
    }
}
