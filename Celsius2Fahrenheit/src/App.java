import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Conversor de Grados");
        
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Ingrese los grados Celsius a convertir: ");
        
        // Read the Celsius temperature from user input
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println("Los grados Fahrenheit son: " + fahrenheit);
        
        // Close the scanner
        sc.close();
    }
}
