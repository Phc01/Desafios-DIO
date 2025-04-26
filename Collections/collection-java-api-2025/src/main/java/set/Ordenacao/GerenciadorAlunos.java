package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private final Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunoSet);
        System.out.println(alunosPorNota);
    }


    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("João", 123456L, 7.5);
        alunos.adicionarAluno("Maria", 123457L, 9.0);
        alunos.adicionarAluno("Carlos", 123458L, 5.0);
        alunos.adicionarAluno("Ana", 123459L, 6.7);

        System.out.println("Aluno no Gerenciador: ");
        System.out.println(alunos.alunoSet);

        //alunos.removerAlunoPorMatricula(123457L);
        System.out.println(alunos.alunoSet);

        alunos.exibirAlunosPorNota();

        alunos.exibirAlunosPorNome();
    }
}
