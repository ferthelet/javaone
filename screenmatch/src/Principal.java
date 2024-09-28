public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.incluidoEnElplan = true;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + miPelicula.duracionEnMinutos);
        System.out.println("Esta incluida en el plan: " + miPelicula.incluidoEnElplan);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 180;
        otraPelicula.incluidoEnElplan = false;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + otraPelicula.duracionEnMinutos);
        System.out.println("Esta incluida en el plan: " + otraPelicula.incluidoEnElplan);
    }
}
