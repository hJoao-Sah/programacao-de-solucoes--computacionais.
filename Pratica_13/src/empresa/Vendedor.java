package empresa;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
        valorVendas = 0.0;
        comissao = 0.0;
    }

    public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double valorVendas, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao);
    }

    @Override
    public String Info() {
        return super.Info() + "\nValor Vendas: " + valorVendas + "\nComissão: " + comissao;
    }
}

