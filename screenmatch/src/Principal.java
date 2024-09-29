import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElplan(true);

        // con metodo muestraFichaTecnica
        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon =  new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());


        // Pelicula otraPelicula = new Pelicula();
        // otraPelicula.nombre = "Matrix";
        // otraPelicula.fechaDeLanzamiento = 1999;
        // otraPelicula.duracionEnMinutos = 180;
        // otraPelicula.incluidoEnElplan = false;

        // otraPelicula.muestraFichaTecnica();

        // Pruebas 
        // System.out.println("Pruebas");
        // System.out.println("Direccion miPelicula: " + miPelicula);
        // System.out.println("Direccion otraPelicula: " + otraPelicula);
    }
}
