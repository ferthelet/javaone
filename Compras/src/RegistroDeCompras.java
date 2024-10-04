import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class RegistroDeCompras {
    public static void main(String[] args) {
        System.out.println("Hello, Lista de Compras!");
        System.out.println("========================");

        Scanner scanner = new Scanner(System.in);
        double limiteDeGasto;
        List<Compra> compras = new ArrayList<>();

        System.out.print("Escriba el limite de la tarjeta: ");
        limiteDeGasto = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        while (true) {
            System.out.print("Escriba la descripcion de la compra: ");
            String nombreCompra = scanner.nextLine();

            System.out.print("Escriba el precio de la compra: ");
            double precioCompra = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (precioCompra <= limiteDeGasto) {
                System.out.println("Compra realizada!");
                System.out.println("***********");
                limiteDeGasto -= precioCompra;
                compras.add(new Compra(nombreCompra, precioCompra));
                System.out.printf("Limite restante: %.2f\n", limiteDeGasto);
            } else {
                System.out.println("Saldo insuficiente.");
                System.out.println("***********");
            }

            System.out.print("Escriba 0 para salir o 1 para continuar: ");
            String choice = scanner.nextLine();
            if (!choice.equals("0")) {
                break;
            }
        }

        Collections.sort(compras);
        System.out.println("\nCompras realizadas: ");
        for (Compra compra : compras) {
            System.out.printf("%s: %.2f\n", compra.nombre, compra.precio);
        }

        scanner.close();
    }
}

class Compra implements Comparable<Compra> {
    String nombre;
    double precio;

    Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.compare(this.precio, otraCompra.precio);
    }
}