package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Numero total na lista é: " + listaTarefa.obterNumeTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total na lista é: " + listaTarefa.obterNumeTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Numero total na lista é: " + listaTarefa.obterNumeTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
