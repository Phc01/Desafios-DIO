package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefasParaRemover);
    }

    public void exibirTarefa() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null) {
            if (tarefaPendente.isConcluida()) {
                tarefaPendente.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista de tarefa está vazia");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Treinar");
        listaTarefas.adicionarTarefa("Jogar Bola");
        listaTarefas.adicionarTarefa("Escrever");
        listaTarefas.adicionarTarefa("Fazer Trabalho");

        listaTarefas.exibirTarefa();

        listaTarefas.removerTarefa("Escrever");

        listaTarefas.exibirTarefa();

        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("Treinar");

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Fazer Trabalho");
        listaTarefas.exibirTarefa();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();
    }

}
