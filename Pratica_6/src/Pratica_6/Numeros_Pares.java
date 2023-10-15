package Pratica_6;

import java.util.Scanner;

public class Numeros_Pares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = input.nextDouble();
		}

		System.out.println("Elementos nas posições pares do vetor:");
		for (int i = 0; i < numeros.length; i += 2) {
			System.out.println("Posição " + i + ": " + numeros[i]);
		}
	}
}
