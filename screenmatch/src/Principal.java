public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.incluidoEnElplan = true;

        // con metodo muestraFichaTecnica
        miPelicula.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 180;
        otraPelicula.incluidoEnElplan = false;

        otraPelicula.muestraFichaTecnica();

        // Pruebas 
        System.out.println("Pruebas");
        System.out.println("Direccion miPelicula: " + miPelicula);
        System.out.println("Direccion otraPelicula: " + otraPelicula);
    }
}
