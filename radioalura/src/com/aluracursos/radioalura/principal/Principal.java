package com.aluracursos.radioalura.principal;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");
        
        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Café Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();            
        }
        
        System.out.println("Total reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total Me gusta: " + miCancion.getTotalDeMeGusta());
        
        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.agregar(miPodcast);
        misFavoritos.agregar(miCancion);
    }
}
