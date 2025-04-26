package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };

        numeros.stream()
                .filter(n -> n %2 == 0)
                .forEach(System.out::println);
    }
}
