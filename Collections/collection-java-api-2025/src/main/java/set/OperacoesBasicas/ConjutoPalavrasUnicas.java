package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoPalavrasUnicas {

    private final Set<String> palavrasUnicasSet;

    public ConjutoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicasSet.contains(palavra)) {
            palavrasUnicasSet.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjutoPalavrasUnicas conjutoPalavrasUnicas = new ConjutoPalavrasUnicas();

        conjutoPalavrasUnicas.adicionarPalavra("Maça");
        conjutoPalavrasUnicas.adicionarPalavra("Banana");
        conjutoPalavrasUnicas.adicionarPalavra("Banana");
        conjutoPalavrasUnicas.adicionarPalavra("Mamão");
        conjutoPalavrasUnicas.adicionarPalavra("Melancia");
        conjutoPalavrasUnicas.adicionarPalavra("Limão");

        conjutoPalavrasUnicas.exibirPalavrasUnicas();

        //conjutoPalavrasUnicas.removerPalavra("Banana");

        conjutoPalavrasUnicas.exibirPalavrasUnicas();

        conjutoPalavrasUnicas.removerPalavra("Pêra");

        System.out.println("Tem 'Banana' no conjunto? " + conjutoPalavrasUnicas.verificarPalavra("Banana"));
    }
}
