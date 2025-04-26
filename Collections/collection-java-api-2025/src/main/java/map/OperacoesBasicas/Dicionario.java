package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário";
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Liguagem de Programação Orientada a Objetos");
        dicionario.adicionarPalavra("TypeScript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("Kotlin", "Linguagem moderna de programação para a JVM");

        dicionario.exibirPalavras();

        System.out.println("Definição da linguagem 'Java': " + dicionario.pesquisarPorPalavra("Java"));

        dicionario.removerPalavra("TypeScript");
        dicionario.exibirPalavras();
    }
}
