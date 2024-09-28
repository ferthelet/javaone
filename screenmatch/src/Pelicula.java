public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElplan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
        System.out.println("Incluida en el plan: " + incluidoEnElplan);
    }

    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

}
