public class Principal {
    public static void main(String[] args) {
        ConsultaPelicula consultaPelicula = new ConsultaPelicula();

        try {
            Pelicula pelicula = consultaPelicula.buscaPelicula(1);
            System.out.println(pelicula);
        } catch (RuntimeException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion.");
        }
    }
}
