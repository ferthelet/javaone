import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import java.io.FileWriter;

public class GeneradorDeArchivo {

    public void guardarJson(Pelicula pelicula) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title() + ".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }

}
