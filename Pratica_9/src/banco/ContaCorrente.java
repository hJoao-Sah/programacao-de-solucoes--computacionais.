package banco;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;

	public void iniciarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	public void sacar(double valor) {
		if (saldo > valor) {
			saldo = saldo - valor;
		} else {
			System.out.println("Error!!! Valor do saque inválido.");
		}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}

	public int exibe_conta() {
		return (numero);
	}

	public int exibe_agencia() {
		return (agencia);
	}

	public void exibe() {
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: " + saldo);
	}
}