package Pratica_6;

import java.util.Scanner;

public class Numeros_Reais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[11];
		double menor_numero = Double.MAX_VALUE, maior_numero = Double.MIN_VALUE;

		for (int i = 1; i < numeros.length; i++) {
			System.out.print(i + " - informe um número real: ");
			numeros[i] = input.nextDouble();
		}

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor_numero) {
				menor_numero = numeros[i];

			}

			if (numeros[i] > maior_numero) {
				maior_numero = numeros[i];
			}
		}
		System.out.println("O maior número é : " + maior_numero);
		System.out.println("O menor número é : " + menor_numero);
	}
}
