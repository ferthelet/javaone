package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        // peliculas
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El Senior de los Anillos", 2001);
        peliculaDeBruno.evalua(10);

        // series
        Serie casaDragon = new Serie("La casa del dragon", 2022);
        Serie lost = new Serie("Lost", 2000);

        // arraylist
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);
        lista.add(casaDragon);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNombre());
            if (titulo instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println("Clasificacion: " + pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        // Collection sort 2.0
        System.out.println("Lista de artistas: " + listaDeArtistas);
        listaDeArtistas.sort(String::compareToIgnoreCase);
        System.out.println("Lista ordenada de artistas: " + listaDeArtistas);
    }
}
