import java.util.ArrayList;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElplan(true);

        // con metodo muestraFichaTecnica
        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();

        Serie lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la serie: " + lost.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        // otra pelicula
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElplan(false);

        otraPelicula.muestraFichaTecnica();
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        System.out.println(episodio.getNombre());
        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El Senior de los Anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println(listaDePeliculas);
        System.out.println(listaDePeliculas.size());
        System.out.println(listaDePeliculas.get(0).getNombre());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

        // Pruebas
        // System.out.println("Pruebas");
        // System.out.println("Direccion miPelicula: " + miPelicula);
        // System.out.println("Direccion otraPelicula: " + otraPelicula);
    }
}
