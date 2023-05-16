import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class EjemploConsumer {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Martín");

        Consumer<String> imprimirEnMayusculas = nombre -> System.out.println(nombre.toUpperCase());

        nombres.forEach(imprimirEnMayusculas);
    }
}
