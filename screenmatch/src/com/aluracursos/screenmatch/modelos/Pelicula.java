package com.aluracursos.screenmatch.modelos;
public class Pelicula {

    public String nombre;
    public int fechaDeLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnElplan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    // getters and setters
    public int getTotalDeEvaluaciones() {
        return totalDeEvaluaciones;
    }
    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
        System.out.println("Incluida en el plan: " + incluidoEnElplan);
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

}
