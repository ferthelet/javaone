public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElplan;
    double sumaDeLasEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
        System.out.println("Incluida en el plan: " + incluidoEnElplan);
    }

    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
    }

}
