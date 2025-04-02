package infnet.tao;

public class User {
    private final Long id;
    private final String nome;
    private final String email;
    private final String cargo;

    public User(Long id, String nome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public User atualizarEmail(String novoEmail) {
        return new User(this.id, this.nome, novoEmail, this.cargo);
    }

    public User definirCargo(String novoCargo) {
        return new User(this.id, this.nome, this.email, novoCargo);
    }
}
