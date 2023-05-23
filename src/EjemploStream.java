import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStream {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(Arrays.asList("Camino", "Lavadora", "Humboldt", "Arle", "Sillón"));

        List<String> palabrasFiltradas = palabras.stream()
                .filter(palabra -> palabra.contains("m"))
                .map(String::toLowerCase)
                .toList();

        System.out.println("Palabras: " + palabras);
        System.out.println("Palabras con la letrs 'm': " + palabrasFiltradas);
    }
}
