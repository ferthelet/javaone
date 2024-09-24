import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a a la pelicula Matrix");
            nota = teclado.nextDouble();    
            mediaEvaluaciones += nota;
            totalEvaluaciones++;
        }
        System.out.println("La media de evaluaciones para la pelicula Matrix: " + mediaEvaluaciones / 3);
    }
}
