public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (notaDeLaPelicula + 6.0 + 9.0) / 3;
        System.out.println(media);¡

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: %s
                """.formatted(fechaDeLanzamiento);
        System.out.println(sinopsis);

        int clasificacion = (int) Math.round(media / 2);
        System.out.println(clasificacion);

    }
}
