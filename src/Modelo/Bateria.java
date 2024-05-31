package Modelo;

public class Bateria {

    private static final int CAPACIDAD_MAXIMA = 100;
    private int nivelBateria;

    public Bateria() {
        this.nivelBateria = CAPACIDAD_MAXIMA;
    }

    public void descargar() {
        if (nivelBateria > 0) {
            nivelBateria--;
        }
    }

    public void recargar() {
        nivelBateria = CAPACIDAD_MAXIMA;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean estaDescargada() {
        return nivelBateria <= 0;
    }
}
