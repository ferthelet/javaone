import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;

public class ConsultaPelicula {
    
    Pelicula buscaPelicula(int numeroDePelicula) {
        URI = "https://swapi.dev/api/films/" + numeroDePelicula;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URI))
                .build();

    }
}
