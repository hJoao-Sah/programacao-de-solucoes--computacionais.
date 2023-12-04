package empresa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        nome = "";
        idade = 0;
        altura = 0.0;
        peso = 0.0;
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String Info() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso;
    }
}
