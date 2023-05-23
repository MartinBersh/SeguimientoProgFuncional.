import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploSorted {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(35,122, 81232, 1000000, 1120);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        numerosOrdenados.forEach(System.out::println);
    }
}
