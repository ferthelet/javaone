import java.util.Scanner;

public class AplicacionBancaria {
    private static double saldo = 1599.0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            mostrarMenu();
            System.out.println("Por favor, ingrese un número válido.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Operaciones Bancarias ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Depositar");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void consultarSaldo() {
        System.out.printf("Su saldo actual es: $%.2f\n", saldo);
    }

    public static void retirar() {
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();

        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.printf("Retiro exitoso. Su nuevo saldo es: $%.2f\n", saldo);
        }
    }

    public static void depositar() {
        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidad = scanner.nextDouble();

        saldo += cantidad;
        System.out.printf("Depósito exitoso. Su nuevo saldo es: $%.2f\n", saldo);
    }

    
}
