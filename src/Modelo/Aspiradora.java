package Modelo;

public class Aspiradora {
    private int pasosRealizados;
    private int limpiezaRealizada;
    private final CapacidadBasura capacidadBasura;
    private final Bateria bateria;
    private final Posicion posicion;

    public Aspiradora(Bateria bateria, int capacidadBasura) {
        this.posicion = new Posicion(0, 0);
        this.bateria = bateria;
        this.capacidadBasura = new CapacidadBasura(Math.max(capacidadBasura, 0));
        this.pasosRealizados = 0;
        this.limpiezaRealizada = 0;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getPasosRealizados() {
        return pasosRealizados;
    }

    public int getLimpiezaRealizada() {
        return limpiezaRealizada;
    }

    public CapacidadBasura getCapacidadBasura() {
        return capacidadBasura;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setPasosRealizados(int pasosRealizados) {
        this.pasosRealizados = pasosRealizados;
    }
    
    public void setLimpiezaRealizada(int limpiezaRealizada) {
        this.limpiezaRealizada = limpiezaRealizada;
    }
 
}
