import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) throws Exception {
        System.out.println("Bievenido al juego de adivinanza!");
        jugarAdivinanzas();
    }

    public static void jugarAdivinanzas() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Genera un número entre 0 y 100
        int intentosMaximos = 5;
        Scanner scanner = new Scanner(System.in);

    }
}