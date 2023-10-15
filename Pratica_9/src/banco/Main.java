package banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ContaCorrente contaCorrente;
		contaCorrente = new ContaCorrente();

		Scanner input = new Scanner(System.in);
		System.out.println("Informe o numero da agencia: ");
		int conta = input.nextInt();

		System.out.println("Informe o numero da conta: ");
		int agencia = input.nextInt();

		contaCorrente.iniciarContaCorrente(conta, agencia);
		contaCorrente.exibe();

		System.out.println("\n" + "Informe o valor do deposito: ");
		double deposito = input.nextDouble();

		contaCorrente.depositar(deposito);
		contaCorrente.exibe();

		System.out.println("\n" + "Informe o valor do saque: ");
		double saque = input.nextDouble();

		contaCorrente.sacar(saque);
		contaCorrente.exibe();

	}
}
