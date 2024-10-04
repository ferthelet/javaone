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
                limiteDeGasto -= precioCompra;
                compras.add(new Compra(nombreCompra, precioCompra));
                System.out.printf("Limite restante: %.2f\n", limiteDeGasto);
                System.out.println("========================");
            }
        }
    }
}

class Compra {
    private String nombre;
    private double precio;

    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
