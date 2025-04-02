package infnet.tao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sprint {
    private final Long id;
    private final String nome;
    private final LocalDate  dataInicio;
    private final LocalDate dataFim;
    private final List<Task> tarefas;

    public Sprint(Long id, String nome, LocalDate dataInicio, LocalDate dataFim, List<Task> tarefas) {
        if (dataInicio.isAfter(dataFim)) {
            throw new IllegalArgumentException("A data de início não pode ser posterior à data de término.");
        }
        if (dataFim.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data de término não pode ser anterior à data atual.");
        }
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tarefas = tarefas != null ? List.copyOf(tarefas) : Collections.emptyList();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public List<Task> getTarefas() {
        return tarefas;
    }

    public Sprint adicionarTarefa(Task novaTarefa) {
        if (tarefas.contains(novaTarefa)) {
            return this;
        }
        List<Task> novasTarefas = new ArrayList<>(this.tarefas);
        novasTarefas.add(novaTarefa);
        return new Sprint(this.id, this.nome, this.dataInicio, this.dataFim, novasTarefas);
    }

    public Sprint removerTarefa(Task tarefa) {
        if (!tarefas.contains(tarefa)) {
            return this;
        }
        List<Task> novasTarefas = new ArrayList<>(this.tarefas);
        novasTarefas.remove(tarefa);
        return new Sprint(this.id, this.nome, this.dataInicio, this.dataFim, novasTarefas);
    }

    public void listarTarefas() {
        System.out.println("Tarefas da Sprint:");
        for (Task tarefa : tarefas) {
            System.out.println("- " + tarefa.exibirDetalhes());
        }
    }
}
