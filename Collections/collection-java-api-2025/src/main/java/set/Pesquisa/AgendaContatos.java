package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private final Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().endsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 0);
        agendaContatos.adicionarContato("Pedro Henrique", 11111111);
        agendaContatos.adicionarContato("Pedro Camargo", 2222222);
        agendaContatos.adicionarContato("Henrique", 11111111);


        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Henrique"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Henrique", 123));

        agendaContatos.exibirContato();
    }
}


