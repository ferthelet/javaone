import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Lista de Compras!");
        System.out.println("========================");

        // Crear una app para registrar compras en una tarjeta de credito
        // Menu para registrar compras
        // Exhibir lista de compras ordenadas ascendente por precio

        Scanner scanner = new Scanner(System.in);
        double limiteDeGasto;
        List<Compra> compras = new ArrayList<>();
        
        System.out.println("Escriba el limite de la tarjeta:");
        limiteDeGasto = scanner.nextDouble();
        scanner.nextLine();

        while(true) {
            System.out.println("Escriba la descripcion de la compra:");
            String nombreCompra = scanner.nextLine();

            System.out.println("Escriba el precio de la compra:");
            double precioCompra = scanner.nextDouble();
            scanner.nextLine();

            if (precioCompra <= limiteDeGasto) {
                System.out.println("Compra realizada!");
                System.out.println("========================");
                limiteDeGasto -= precioCompra;
                compras.add(new Compra(nombreCompra, precioCompra));
            } else {
                System.out.println("Saldo insuficiente");
                System.out.println("========================");
            }
            System.out.printf("Limite restante: %.2f\n", limiteDeGasto);
            System.out.println("Escriba 0 para salir o 1 para continuar");
            String opcion = scanner.nextLine();
            if(opcion.equals("0")) {
                break;
            }
        }
    }
}

class Compra {
    private String nombre;
    private double precio;

    // constructor
    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // compareTo
    public int compareTo(Compra otraCompra) {
        return Double.compare(this.precio, otraCompra.precio);
    }

    // toString
    public String toString() {
        return this.nombre + " - $" + this.precio;
    }

}
