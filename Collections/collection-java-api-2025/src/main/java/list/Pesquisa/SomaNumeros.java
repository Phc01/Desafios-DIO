package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public double calcularSoma() {
        int soma = 0;
        for (Integer numero : numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(-8);
        somaNumeros.adicionarNumero(15);

        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos Numeros = " + somaNumeros.calcularSoma());

        System.out.println("Maior Numero = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor Numero = " + somaNumeros.encontrarMenorNumero());
    }
}
