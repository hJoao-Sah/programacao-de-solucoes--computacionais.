package Pratica_6;

import java.util.Scanner;

public class Soma_Pares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[5];
		int soma_pares = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Informe um número: ");
			numeros[i] = input.nextInt();

			if (numeros[i] % 2 == 0) {
				soma_pares += numeros[i];
				System.out.println("O número " + numeros[i] + " é par");
				System.out.println("Numero: " + numeros[i] + ", Posição: " + i + ", Soma dos pares: " + soma_pares);
			}

		}

	}

}
