package empregado;

public class Gerente extends Empregado {
    private String nomeSecretaria;

    public Gerente(String nome, double salario, int anoContratacao) {
        super(nome, salario, anoContratacao);
        nomeSecretaria = "";
    }

    public void reajustaSalario(double porcentagem) {
        double bonus = (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }

    public String getNomeSecretaria() {
        return nomeSecretaria;
    }

    public void setNomeSecretaria(String nomeSecretaria) {
        this.nomeSecretaria = nomeSecretaria;
    }
}
