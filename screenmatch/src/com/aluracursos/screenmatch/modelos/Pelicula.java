package com.aluracursos.screenmatch.modelos;
public class Pelicula {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElplan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    // getters and setters
    public int getTotalDeEvaluaciones() {
        return totalDeEvaluaciones;
    }
    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    // setters y getters usando right click -> Source Action
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public boolean isIncluidoEnElplan() {
        return incluidoEnElplan;
    }
    public void setIncluidoEnElplan(boolean incluidoEnElplan) {
        this.incluidoEnElplan = incluidoEnElplan;
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
