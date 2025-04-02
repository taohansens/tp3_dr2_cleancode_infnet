package infnet.tao;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Registro {
    private final Long id;
    private final String descricao;
    private final BigDecimal valor;
    private final LocalDateTime dataCriacao;
    private final LocalDateTime dataAtualizacao;
    private final Status status;

    public Registro(Long id, String descricao, BigDecimal valor, Status status) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.dataCriacao = LocalDateTime.now();
        this.dataAtualizacao = this.dataCriacao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public Status getStatus() {
        return status;
    }

    public Registro atualizarRegistro(BigDecimal novoValor, Status novoStatus) {
        if (novoValor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        return new Registro(this.id, this.descricao, novoValor, novoStatus);
    }
}