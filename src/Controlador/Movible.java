package Controlador;

import java.util.Random;

import Modelo.Habitacion;
import Modelo.Posicion;

public abstract class Movible {
    public void mover(Habitacion habitacion) {
        Random random = new Random();

        int dx = random.nextInt(3) - 1;
        int dy = random.nextInt(3) - 1;

        int nuevaX = getPosicion().getX() + dx;
        int nuevaY = getPosicion().getY() + dy;

        if (esPosicionValida(habitacion, nuevaX, nuevaY)) {
            realizarAccion(habitacion, nuevaX, nuevaY);
        }
    }

    private boolean esPosicionValida(Habitacion habitacion, int x, int y) {
        return x >= 0 && x < habitacion.getDimension().getAncho() &&
               y >= 0 && y < habitacion.getDimension().getLargo();
    }

    protected abstract void realizarAccion(Habitacion habitacion, int nuevaX, int nuevaY);

    protected abstract Posicion getPosicion();
}
