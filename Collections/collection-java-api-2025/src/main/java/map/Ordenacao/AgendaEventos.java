package main.java.map.Ordenacao;

import main.java.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, 04,28), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 12,25), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 01,30), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 04,27), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 04,26), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
