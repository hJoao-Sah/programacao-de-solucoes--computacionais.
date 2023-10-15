package pratica_2;

import java.util.Scanner;

public class Mensalidade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = input.nextInt();

		System.out.println("Informe seu genero: ");
		System.out.println("1 - Masculino ");
		System.out.println("2 - Feminino ");

		int escolha = input.nextInt();

		double valor = 0;

		switch (escolha) {
		case 1:

			if (idade < 15) {
				valor = 60.00;
			} else if (idade < 18) {
				valor = 75.00;
			} else if (idade < 30) {
				valor = 90.00;
			} else if (idade < 40) {
				valor = 85.00;
			} else {
				valor = 80.00;
			}
			break;

		case 2:

			if (idade < 18) {
				valor = 60.00;
			} else if (idade < 25) {
				valor = 90.00;
			} else if (idade < 40) {
				valor = 85.00;
			} else {
				valor = 80.00;
			}
			break;

		default:
			System.out.println("Opção Invalida!!!");
			break;
		}
		if (valor > 0) {
			System.out.println("Você tem " + idade + " anos e o preço da sua mensalidade é de R$" + valor + " reais");
		}
	}

}
