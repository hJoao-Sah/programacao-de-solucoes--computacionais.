package pratica_5;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número natural para calcular o fatorial: ");
		int numero = input.nextInt();
		int fatorial = 1;

		if (numero < 0) {
			System.out.println("Numero invalido");
		} else if (numero == 0) {
			System.out.println(numero + "!:" + 1);
		} else {
			for (int i = 1; i <= numero; i++) {

				fatorial *= i;

				System.out.println(fatorial);
			}

		}
		if (numero > 0) {
			System.out.println(numero + "!: " + fatorial);
		}
	}
}
