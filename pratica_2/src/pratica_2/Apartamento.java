package pratica_2;

import java.util.Scanner;

public class Apartamento {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe qual é o tipo de Apartamento.");
		System.out.println("1 - Apto Simples ");
		System.out.println("2 - Apto Duplo ");

		int escolha = input.nextInt();

		System.out.println("Informe o número de diarias: ");
		int diarias = input.nextInt();

		double valor = 0;

		switch (escolha) {
		case 1:
			if (diarias < 10) {
				valor = 100.00;
			} else if (diarias < 15) {
				valor = 90.00;
			} else {
				valor = 80.00;
			}
			break;

		case 2:
			if (diarias < 10) {
				valor = 140.00;
			} else if (diarias < 15) {
				valor = 120.00;
			} else {
				valor = 100.00;
			}
		}

		if (valor > 0) {
			System.out.println("Você ficará hospetado " + diarias + " dias e pagará R$" + valor + " reais");
		}
	}

}
