package main.java.set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "{" + nome +
                "," + matricula +
                "," + media +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }
}

class ComparatorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
