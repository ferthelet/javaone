public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        String tipoPlan = "plus";
        double notaDeLaPelicula = 8.2;

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Pelicula retro");
        }
        if (incluidoEnElPlan && notaDeLaPelicula >= 8) {
            System.out.println("Pelicula recomendada");
        }
        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        }
    }
}
