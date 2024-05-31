package Modelo;

public class Dimension {
    private final int largo;
    private final int ancho;

    public Dimension(int largo, int ancho) {
        if (largo <= 0 || ancho <= 0) {
            throw new IllegalArgumentException("Las dimensiones deben ser valores positivos.");
        }
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }
}
