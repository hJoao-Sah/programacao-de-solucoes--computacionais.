package empresa;

public class Cliente extends Pessoa {
    private double credMax;
    private double valorEmDivida;

    public Cliente() {
        super();
        credMax = 0.0;
        valorEmDivida = 0.0;
    }

    public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida) {
        super(nome, idade, altura, peso);
        this.credMax = credMax;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCredMax() {
        return credMax;
    }

    public void setCredMax(double credMax) {
        this.credMax = credMax;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public double obterSaldo() {
        return credMax - valorEmDivida;
    }

    @Override
    public String Info() {
        return super.Info() + "\nCrédito Máximo: " + credMax + "\nValor em Dívida: " + valorEmDivida;
    }
}

