import java.util.function.Supplier;
public class EjemploSupplier {
    public static void main(String[] args) {
        Supplier<Double> numeroSupplier = () -> Math.random();
         double numeroAleatorio = numeroSupplier.get();
         System.out.println("Número aleatorio: " + numeroAleatorio);

         Supplier<String> saludoSupplier = () -> {
             String[] Nombres = {"Martín", "Daniel", "Juan", "Camila"};
             int aleatorio = (int) (Math.random() * Nombres.length);
             return Nombres[aleatorio];
         };

         String saludo = saludoSupplier.get();
         System.out.println("Buen día " + saludo);
    }
}