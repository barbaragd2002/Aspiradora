package Vista;

import java.util.Scanner;

public class Consola {

    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int obtenerLargo() {
        System.out.println("largo de la habitación:");
        return scanner.nextInt();
    }

    public static int obtenerAncho() {
        System.out.println("ancho de la habitación:");
        return scanner.nextInt();
    }

    public static int obtenerCapacidadBasura() {
        System.out.println("capacidad de basura de la aspiradora:");
        return scanner.nextInt();
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
