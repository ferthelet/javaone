package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class CalculadoraDeTiempo {

    private int tiempoTotal;
    
    public void incluye(Pelicula pelicula) {
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }

    public void incluye(Serie serie) {
        tiempoTotal += serie.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
