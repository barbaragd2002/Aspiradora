package Controlador;

import java.util.Random;

import Modelo.Gato;
import Modelo.Habitacion;
import Modelo.Posicion;
import Vista.VistaGato;

public class ControlarGato extends Movible {
    private Gato gato;
    
    public ControlarGato(Gato gato) {
        this.gato = gato;
    }

    @Override
    protected void realizarAccion(Habitacion habitacion, int nuevaX, int nuevaY) {
        if (puedeMoverse(habitacion, nuevaX, nuevaY)) {
            moverGato(nuevaX, nuevaY);
            ensuciarCasilla(habitacion);
        }
    }

    @Override
    protected Posicion getPosicion() {
        return gato.getPosicion();
    }

    private boolean puedeMoverse(Habitacion habitacion, int x, int y) {
        return x >= 0 && x < habitacion.getAncho() && y >= 0 && y < habitacion.getAlto() && !habitacion.getMuebles()[x][y];
    }

    private void moverGato(int nuevaX, int nuevaY) {
        gato.getPosicion().setX(nuevaX);
        gato.getPosicion().setY(nuevaY);
    }

    private void ensuciarCasilla(Habitacion habitacion) {
        int nivelSuciedad = generarNivelSuciedad();
        int posX = gato.getPosicion().getX();
        int posY = gato.getPosicion().getY();

        if (habitacion.getSuperficie()[posX][posY].getNivelSuciedad() < nivelSuciedad) {
            habitacion.getSuperficie()[posX][posY].setNivelSuciedad(nivelSuciedad);
            VistaGato.ensuciarCasilla(posX, posY, nivelSuciedad);
        }
    }

    private int generarNivelSuciedad() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public void realizarAccion(Habitacion habitacion) {
        int posicionActualX = gato.getPosicion().getX();
        int posicionActualY = gato.getPosicion().getY();
    
        Random random = new Random();
        int nuevaX = posicionActualX + random.nextInt(3) - 1;
        int nuevaY = posicionActualY + random.nextInt(3) - 1;
    
        if (puedeMoverse(habitacion, nuevaX, nuevaY)) {
            realizarAccion(habitacion, nuevaX, nuevaY);
        }
    }
}
