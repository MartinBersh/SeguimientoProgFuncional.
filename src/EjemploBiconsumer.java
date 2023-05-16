import java.util.function.BiConsumer;

public class EjemploBiconsumer {
    public static void main(String[] args) {
        String nombre = "Arle";
        int edad = 40;

        BiConsumer<String, Integer> NombreYEdad = (n, e) ->
                System.out.println(n + " tiene " + e + " años.");

        NombreYEdad.accept(nombre, edad);
    }
}

