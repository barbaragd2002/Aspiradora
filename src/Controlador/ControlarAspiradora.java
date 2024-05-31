package Controlador;

import Modelo.Aspiradora;
import Modelo.Habitacion;
import Modelo.Posicion;
import Vista.VistaAspiradora;

public class ControlarAspiradora extends Movible {

    private Aspiradora aspiradora;

    public ControlarAspiradora(Aspiradora aspiradora) {
        this.aspiradora = aspiradora;
    }

    @Override
    protected void realizarAccion(Habitacion habitacion, int nuevaX, int nuevaY) {
        Posicion posicionActual = aspiradora.getPosicion();
        if (puedeMoverse(habitacion, nuevaX, nuevaY) && !aspiradora.getBateria().estaDescargada()) {
            moverAspiradora(nuevaX, nuevaY);
            limpiarCasilla(habitacion, posicionActual);
            aspiradora.getBateria().descargar();
            aspiradora.getCapacidadBasura().incrementar();

            if (aspiradora.getCapacidadBasura().estaLlena()) {
                vaciarBasura();
            }

            VistaAspiradora.nivelDeBateria(aspiradora.getBateria().getNivelBateria());
            aspiradora.setPasosRealizados(aspiradora.getPasosRealizados() + 1);
        } else if (aspiradora.getBateria().estaDescargada()) {
            VistaAspiradora.bateriaAgotada();
            aspiradora.getBateria().recargar();
        }
    }

    private boolean puedeMoverse(Habitacion habitacion, int x, int y) {
        return x >= 0 && x < habitacion.getAncho() && y >= 0 && y < habitacion.getAlto() && !habitacion.getMuebles()[x][y];
    }

    private void moverAspiradora(int nuevaX, int nuevaY) {
        aspiradora.getPosicion().setX(nuevaX);
        aspiradora.getPosicion().setY(nuevaY);
    }

    private void limpiarCasilla(Habitacion habitacion, Posicion posicion) {
        int nivelSuciedad = habitacion.getSuperficie()[posicion.getX()][posicion.getY()].getNivelSuciedad();
        if (nivelSuciedad > 0) {
            habitacion.getSuperficie()[posicion.getX()][posicion.getY()].setNivelSuciedad(0);
            aspiradora.setLimpiezaRealizada(aspiradora.getLimpiezaRealizada() + 1);
            VistaAspiradora.limpiarCasilla(posicion.getX(), posicion.getY());
        }
    }

    private void vaciarBasura() {
        VistaAspiradora.bolsaDeBasuraLlena();
        aspiradora.getCapacidadBasura().vaciar();
        VistaAspiradora.bolsaDeBasuraVaciada();
    }

    @Override
    protected Posicion getPosicion() {
        return aspiradora.getPosicion();
    }

    public void realizarAccion(Habitacion habitacion) {
        
        Posicion posicionActual = aspiradora.getPosicion();
        
        int nuevaX = posicionActual.getX() + (int) (Math.random() * 3) - 1;
        int nuevaY = posicionActual.getY() + (int) (Math.random() * 3) - 1;
        
        realizarAccion(habitacion, nuevaX, nuevaY);
    }
}
