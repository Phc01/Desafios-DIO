package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

//        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem-vindo!")
                .limit(5)
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
