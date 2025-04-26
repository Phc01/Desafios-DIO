package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private final Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exbirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 5665);
        agendaContatos.adicionarContato("Pedro Henrique", 1111111);
        agendaContatos.adicionarContato("Pedro DIO", 654987);
        agendaContatos.adicionarContato("João Vitor", 1111111);
        agendaContatos.adicionarContato("Pedro", 444444);

        agendaContatos.exbirContato();

        agendaContatos.removerContato("João Vitor");
        agendaContatos.exbirContato();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Pedro Henrique"));
    }
}
