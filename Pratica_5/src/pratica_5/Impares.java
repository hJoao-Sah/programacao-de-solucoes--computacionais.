package pratica_5;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				System.out.println("Numero impar: " + i);
			}

		}

	}

}
