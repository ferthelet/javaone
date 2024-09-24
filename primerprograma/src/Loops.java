import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a a la pelicula Matrix");
            double notaDeLaPelicula = teclado.nextDouble();
            mediaEvaluaciones += notaDeLaPelicula;
        }
        System.out.println(mediaEvaluaciones / 3);

        // while loop
        // int j = 0;
        // while (j < 5) {
        //     System.out.println("While loop iteration: " + j);
        //     j++;
        // }

        // // do-while loop
        // int k = 0;
        // do {
        //     System.out.println("Do-while loop iteration: " + k);
        //     k++;
        // } while (k < 5);
    }

}
