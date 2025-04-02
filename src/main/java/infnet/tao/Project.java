package infnet.tao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project {
    private final Long id;
    private final String nome;
    private final String descricao;
    private final List<Sprint> sprints;

    public Project(Long id, String nome, String descricao, List<Sprint> sprints) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.sprints = sprints != null ? Collections.unmodifiableList(new ArrayList<>(sprints)) : Collections.emptyList();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Sprint> getSprints() {
        return sprints;
    }

    public Project adicionarSprint(Sprint novaSprint) {
        if (sprints.contains(novaSprint)) {
            return this;
        }
        List<Sprint> novasSprints = new ArrayList<>(this.sprints);
        novasSprints.add(novaSprint);
        return new Project(this.id, this.nome, this.descricao, novasSprints);
    }

    public Project removerSprint(Sprint sprint) {
        if (!sprints.contains(sprint)) {
            return this;
        }
        List<Sprint> novasSprints = new ArrayList<>(this.sprints);
        novasSprints.remove(sprint);
        return new Project(this.id, this.nome, this.descricao, novasSprints);
    }

    public void listarSprints() {
        System.out.println("Sprints do Projeto:");
        for (Sprint sprint : sprints) {
            System.out.println("- " + sprint.getNome());
        }
    }

}
