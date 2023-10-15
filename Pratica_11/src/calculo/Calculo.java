package calculo;

import java.util.Scanner;

public class Calculo {
	public int multiplicacao(int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado += a;
		}
		return resultado;
	}

	public int potencia(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = multiplicacao(resultado, a);
		}
		return resultado;
	}

	public int divisao(int a, int b) {
		int i = 0;
		while (a >= b) {
			a = a - b;
			i++;
		}
		return i;
	}

	public int resto(int a, int b) {
		while (a >= b) {
			a = a - b;
		}
		return a;
	}

	public boolean par(int a) {
		return resto(a, 2) == 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculo inteiro = new Calculo();

		int escolha;
		do {
			System.out.println("\nMenu:");
			System.out.println("1 - Multiplicação.");
			System.out.println("2 - Potência.");
			System.out.println("3 - Divisão.");
			System.out.println("4 - Par.");
			System.out.println("5 - Sair");

			escolha = scanner.nextInt();

			int a, b;
			switch (escolha) {
			case 1:
				System.out.print("Informe o valor de a: ");
				a = scanner.nextInt();
				System.out.print("Informe o valor de b: ");
				b = scanner.nextInt();
				int resultadoMultiplicacao = inteiro.multiplicacao(a, b);
				System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
				break;
			case 2:
				System.out.print("Informe o valor de a: ");
				a = scanner.nextInt();
				System.out.print("Informe o valor de b: ");
				b = scanner.nextInt();
				int resultadoPotencia = inteiro.potencia(a, b);
				System.out.println("Resultado da potência: " + resultadoPotencia);
				break;
			case 3:
				System.out.print("Informe o valor de a: ");
				a = scanner.nextInt();
				System.out.print("Informe o valor de b: ");
				b = scanner.nextInt();
				int resultadoDivisao = inteiro.divisao(a, b);
				System.out.println("Resultado da divisão (quociente): " + resultadoDivisao);
				break;
			case 4:
				System.out.print("Informe o valor de a: ");
				a = scanner.nextInt();
				boolean resultadoPar = inteiro.par(a);
				System.out.println("É par? " + resultadoPar);
				break;
			case 5:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (escolha != 5);
	}
}
