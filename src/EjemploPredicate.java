import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(23, 56, 3, 25, 2324, 20, 26);

        Predicate<Integer> esMayorA25 = num -> num > 25;

        List<Integer> numerosFiltrados = filtrarNumeros(numeros, esMayorA25);

        System.out.println("Números mayores a 25: " + numerosFiltrados);
    }

    public static List<Integer> filtrarNumeros(List<Integer> numeros, Predicate<Integer> predicado) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer num : numeros) {
            if (predicado.test(num)) {
                resultado.add(num);
            }
        }
        return resultado;
    }
}

