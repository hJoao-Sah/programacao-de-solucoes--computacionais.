package pratica_5;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número para a tabuada de multiplicação: ");
		int numero = input.nextInt();

		System.out.println("Tabuada de multiplicação do" + numero + ":");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

	}
}