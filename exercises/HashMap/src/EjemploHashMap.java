import java.util.Map;
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, HashMap!");

        Map<String, Integer> usandoHashMap = new HashMap<>();
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Perros", 2);
        usandoHashMap.put("Ratones", 3);

        int valor = usandoHashMap.get("Perros");
        System.out.println("Valor asociado a 'Perros': " + valor);
        System.out.println("Tamaño del HashMap: " + usandoHashMap.size());
        System.out.println("HashMap contiene 'Gatos': " + usandoHashMap.containsKey("Gatos"));

        usandoHashMap.remove("Gatos");
        System.out.println("HashMap después de remover 'Gatos': " + usandoHashMap);

        for (Map.Entry<String, Integer> entry : usandoHashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        for (String clave : usandoHashMap.keySet()) {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + usandoHashMap.get(clave));
        }

    }
}
