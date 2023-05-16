import java.util.function.BiFunction;

public class EjemploBifunction {
    public static void main(String[] args) {
        int numero = 12;
        int numero2 = 3423;

        BiFunction<Integer, Integer, Integer> sumar = (n, n2) -> n + n2;

        int resultado = sumar.apply(numero, numero2);

        System.out.println(numero + " + " + numero2 + " = " + resultado);
    }
}
