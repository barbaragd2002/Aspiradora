package Modelo;

public class Gato {
    private Posicion posicion;

    public Gato(int x, int y) {
        this.posicion = new Posicion(x, y);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void mover(int nuevaX, int nuevaY) {
        posicion.setX(nuevaX);
        posicion.setY(nuevaY);
    }
}

