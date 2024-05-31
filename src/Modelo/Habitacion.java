package Modelo;

import java.util.Random;

public class Habitacion {
    private Azulejo[][] superficie;
    private boolean[][] muebles;
    private Dimension dimension;
    private Posicion estacionRecarga;

    public Habitacion(Dimension dimension) {
        this.dimension = dimension;
        this.superficie = new Azulejo[dimension.getAncho()][dimension.getLargo()];
        this.muebles = new boolean[dimension.getAncho()][dimension.getLargo()];
        this.estacionRecarga = new Posicion(10, 10);

        Random rand = new Random();
        generarSuperficie(dimension.getAncho(), dimension.getLargo(), rand.nextInt(20) + 20);
        generarMuebles();
    }

    public Azulejo[][] getSuperficie() {
        return superficie;
    }

    public boolean[][] getMuebles() {
        return muebles;
    }

    public Dimension getDimension() {
        return dimension;
    }

    private void generarMuebles() {
        int numMuebles = dimension.getAncho() * dimension.getLargo() / 10; 
        Random rand = new Random();

        for (int i = 0; i < numMuebles; i++) {
            int x = rand.nextInt(dimension.getAncho());
            int y = rand.nextInt(dimension.getLargo());
            muebles[x][y] = true;
        }
    }

    private void generarSuperficie(int ancho, int largo, int porcentajeSuciedad) {
        Random rand = new Random();

        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                superficie[i][j] = new Azulejo(0);
            }
        }

        int totalAzulejos = ancho * largo;
        int azulejosSucios = (int) (totalAzulejos * porcentajeSuciedad / 100.0);

        for (int i = 0; i < azulejosSucios; i++) {
            int x, y;
            do {
                x = rand.nextInt(ancho);
                y = rand.nextInt(largo);
            } while (superficie[x][y].getNivelSuciedad() != 0);
            superficie[x][y] = new Azulejo(rand.nextInt(4) + 1);
        }
    }

    public int getAncho() {
        return dimension.getAncho();
    }
    
    public int getAlto() {
        return dimension.getLargo();
    }
}

