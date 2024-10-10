import com.google.gson.Gson;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URI;

public class ConsultaPelicula {

    Pelicula buscaPelicula(int numeroDePelicula) {
        URI direccionUri = URI.create("https://swapi.dev/api/films/" + numeroDePelicula);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionUri)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pelicula.class);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("No encontre la pelicula.");
        }

    }
}
