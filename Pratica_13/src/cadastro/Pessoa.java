package cadastro;

public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {
        nome = "";
        telefone = "";
        endereco = "";
    }

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String exibe() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
    }
}
