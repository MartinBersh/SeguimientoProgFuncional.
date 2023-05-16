import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        String texto = "Buenos días profesor.";

        Function<String, Integer> obtenerLongitud = str -> str.length();

        int longitud = obtenerLongitud.apply(texto);

        System.out.println("Longitud del texto: " + longitud);
    }
}

