import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consultaPelicula = new ConsultaPelicula();

        System.out.println("Escriba el numero de pelicula: ");

        try {
            int numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consultaPelicula.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion.");
        }
    }
}
