package pratica_8;

import java.util.Scanner;

public class Numeros_Reais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[11];
		double menorNumero = Double.MAX_VALUE, maiorNumero = Double.MIN_VALUE;

		preencherNumeros(numeros, input);
		encontrarMenorEMaiorNumero(numeros, menorNumero, maiorNumero);
	}
	public static void preencherNumeros(double[] numeros, Scanner input) {
		for (int i = 1; i < numeros.length; i++) {
			System.out.print(i + " - informe um número real: ");
			numeros[i] = input.nextDouble();
		}
	}

	public static void encontrarMenorEMaiorNumero(double[] numeros, double menorNumero, double maiorNumero) {
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menorNumero) {
				menorNumero = numeros[i];
			}

			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		System.out.println("O maior número é : " + maiorNumero);
		System.out.println("O menor número é : " + menorNumero);
	}
}
