package empresa;

public class Empregado extends Pessoa {
    private int numeroSecao;
    private double salarioBase;
    private double inss;

    public Empregado() {
        super();
        numeroSecao = 0;
        salarioBase = 0.0;
        inss = 0.0;
    }

    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss) {
        super(nome, idade, altura, peso);
        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
        this.inss = inss;
    }

    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * inss);
    }

    @Override
    public String Info() {
        return super.Info() + "\nNúmero Seção: " + numeroSecao + "\nSalário Base: " + salarioBase + "\nINSS: " + inss;
    }
}
