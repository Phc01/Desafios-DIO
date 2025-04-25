package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private final List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        numeroAscendente.sort(Collections.reverseOrder());
        return numeroAscendente;
    }

    public void exibirNumeros() {
        System.out.println(this.numerosList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());
    }
}
