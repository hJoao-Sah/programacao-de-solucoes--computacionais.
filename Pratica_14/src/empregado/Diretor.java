package empregado;

public class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, double salario, int anoContratacao, String departamento) {
        super(nome, salario, anoContratacao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    
    public void reajustaSalario(double porcentagem) {
        double bonus = 2 * (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }

 
    public String toString() {
        return super.toString() + " - " + departamento;
    }
}
