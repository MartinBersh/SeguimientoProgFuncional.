package EjemploMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploMap {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Martin", 21),
                new Persona("Daniel", 19),
                new Persona("Jaime", 40),
                new Persona("Camila", 24)
        );

        List<String> nombresEdades = personas.stream()
                .map(p -> p.getNombre() + " tiene " + p.getEdad() + " años")
                .collect(Collectors.toList());

        nombresEdades.forEach(System.out::println);
    }
}