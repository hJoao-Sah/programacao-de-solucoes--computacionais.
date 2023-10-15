package pratica_8;

import java.util.Scanner;

public class Numeros_Pares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];

		preencherNumeros(numeros, input);
		mostrarElementosPosicoesPares(numeros);
	}

	public static void preencherNumeros(double[] numeros, Scanner input) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = input.nextDouble();
		}
	}

	public static void mostrarElementosPosicoesPares(double[] numeros) {
		System.out.println("Elementos nas posições pares do vetor:");
		for (int i = 0; i < numeros.length; i += 2) {
			System.out.println("Posição " + i + ": " + numeros[i]);
		}
	}
}
