import java.util.function.BiFunction;

public class EjemploBifunction {
    public static void main(String[] args) {
        int numero1 = 12;
        int numero2 = 3423;

        BiFunction<Integer, Integer, Integer> sumar = (n1, n2) -> n1 + n2;

        int resultado = sumar.apply(numero1, numero2);

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }
}
