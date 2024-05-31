package Modelo;

public class Azulejo {
    private int nivelSuciedad;

    public Azulejo(int nivelSuciedad) {
        setNivelSuciedad(nivelSuciedad);
    }

    public int getNivelSuciedad() {
        return nivelSuciedad;
    }

    public void setNivelSuciedad(int nivelSuciedad) {
        if (nivelSuciedad < 0) {
            this.nivelSuciedad = 0;
        } else if (nivelSuciedad > 100) {
            this.nivelSuciedad = 100;
        } else {
            this.nivelSuciedad = nivelSuciedad;
        }
    }

    public void limpiar() {
        setNivelSuciedad(0);
    }

    public void ensuciar(int cantidad) {
        setNivelSuciedad(getNivelSuciedad() + cantidad);
    }
}
