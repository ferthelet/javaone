package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class PrincipalConListas {
    public static void main(String[] args) {

        // peliculas
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        var peliculaDeBruno = new Pelicula("El Senior de los Anillos", 2001);

        // series
        Serie casaDragon = new Serie("La casa del dragon", 2022);
        Serie lost = new Serie("Lost", 2000);

    }

}
