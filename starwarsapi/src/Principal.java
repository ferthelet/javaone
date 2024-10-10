public class Principal {
    public static void main(String[] args) throws Exception {

        ConsultaPelicula consultaPelicula = new ConsultaPelicula();
        Pelicula pelicula = consultaPelicula.buscaPelicula(1);

        System.out.println(pelicula);
        
    }
}
