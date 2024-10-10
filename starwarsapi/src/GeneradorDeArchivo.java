import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {

    public void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title()
                .replaceAll("\\s", "") + ".json");

        System.out.println("Generando archivo... ");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}
