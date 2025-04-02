package infnet.tao;

public class Task {
    private final Long id;
    private final String titulo;
    private final String descricao;
    private final Status status;
    private final User responsavel;

    public Task(Long id, String titulo, String descricao, Status status, User responsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public User getResponsavel() {
        return responsavel;
    }

    public Task alterarStatus(Status novoStatus) {
        return new Task(this.id, this.titulo, this.descricao, novoStatus, this.responsavel);
    }

    public Task atribuirResponsavel(User novoResponsavel) {
        return new Task(this.id, this.titulo, this.descricao, this.status, novoResponsavel);
    }

    public String exibirDetalhes() {
        return String.format("Tarefa: %s (%s)\nDescrição: %s\nStatus: %s\nResponsável: %s",
                titulo,
                id,
                descricao,
                status,
                responsavel != null ? responsavel.getNome() : "Não atribuído");
    }
}
