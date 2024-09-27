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

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar un número entre 0 y 100.");

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("\nIntento " + intento + ": Ingresa tu número: ");
            
            int adivinanza = Integer.parseInt(scanner.nextLine());

            if (adivinanza < 0 || adivinanza > 100) {
                System.out.println("El número debe estar entre 0 y 100.");
                intento--;
                continue;
            }

            if (adivinanza == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
                return;
            }

            if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        System.out.println("\n¡Se acabaron los intentos! \nEl número secreto era " + numeroSecreto + ".");
        scanner.close();

    }
}