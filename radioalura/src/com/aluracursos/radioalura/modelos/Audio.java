package com.aluracursos.radioalura.modelos;

public class Audio {

    private String titulo;
    private int totalReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    // getters y setters
    public void meGusta() {
        this.totalDeMeGusta++;
    }
    public void reproduce() {
        this.totalReproducciones++;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalReproducciones() {
        return totalReproducciones;
    }
    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }
    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }
    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }
    public int getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}

