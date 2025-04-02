package infnet.tao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(1L,"teste", "teste", Status.DONE, null);
        Sprint sprint = new Sprint(1L, "Teste", LocalDate.now(), LocalDate.now(), null);
        sprint.adicionarTarefa(task);
        sprint.listarTarefas();
        Sprint sprint2 = sprint.adicionarTarefa(task);
        sprint2.listarTarefas();
    }
}