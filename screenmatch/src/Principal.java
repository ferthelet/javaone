import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;

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
