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
        int limiteDeGasto;
        List<Compra> compras = new ArrayList<>();

                

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
