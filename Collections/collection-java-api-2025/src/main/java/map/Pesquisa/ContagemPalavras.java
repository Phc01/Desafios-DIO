package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private final Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLiguagens = new ContagemPalavras();

        contagemLiguagens.adicionarPalavras("Java", 2);
        contagemLiguagens.adicionarPalavras("Python", 8);
        contagemLiguagens.adicionarPalavras("JavaScript", 1);
        contagemLiguagens.adicionarPalavras("C#", 6);

        System.out.println("Existem " + contagemLiguagens.exibirContagemPalavras() + " palavras.");

        System.out.println("A Linguagem mais frequente é: " + contagemLiguagens.encontrarPalavraMaisFrequente());
    }
}
