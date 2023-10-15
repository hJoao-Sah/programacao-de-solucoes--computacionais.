package pratica_3;

import java.util.Scanner;

public class Audiencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int casas = 2, i = 1, canal_2 = 0, canal_4 = 0, canal_5 = 0, canal_7 = 0, canal_12 = 0, total_pessoas = 0;
		boolean processamento = true;
		while (processamento) {

			System.out.println(i + "º casa informe o número do canal: ");
			System.out.println("1 - Canal 2 ");
			System.out.println("2 - Canal 4 ");
			System.out.println("3 - Canal 5 ");
			System.out.println("4 - Canal 7 ");
			System.out.println("5 - Canal 12 ");
			System.out.println("0 - encerrar ");
			int escolha = input.nextInt();

			if (escolha == 0) {
				processamento = false; 
			} else {
				System.out.println("Quantas possoas estão assistindo o canal? ");
				int pessoas = input.nextInt();

				switch (escolha) {

				case 1:
					canal_2 += pessoas;
					total_pessoas += pessoas;
					break;
				case 2:
					canal_4 += pessoas;
					total_pessoas += pessoas;
					break;
				case 3:
					canal_5 += pessoas;
					total_pessoas += pessoas;
					break;
				case 4:
					canal_7 += pessoas;
					total_pessoas += pessoas;
					break;
				case 5:
					canal_12 += pessoas;
					total_pessoas += pessoas;
					break;
				}
			}
			i++;
		}

		double canal2_percentual = ((double) canal_2 / total_pessoas) * 100;
		double canal4_percentual = ((double) canal_4 / total_pessoas) * 100;
		double canal5_percentual = ((double) canal_5 / total_pessoas) * 100;
		double canal7_percentual = ((double) canal_7 / total_pessoas) * 100;
		double canal12_percentual = ((double) canal_12 / total_pessoas) * 100;

		System.out.println("A audiencia da TV é de " + total_pessoas + " pessoas");
		System.out.println(
				"O canal 2 tem " + canal_2 + " pessoas. O percentual de audiencia é de " + canal2_percentual + "%");
		System.out.println(
				"O canal 4 tem " + canal_4 + " pessoas. O percentual de audiencia é de " + canal4_percentual + "%");
		System.out.println(
				"O canal 5 tem " + canal_5 + " pessoas. O percentual de audiencia é de " + canal5_percentual + "%");
		System.out.println(
				"O canal 7 tem " + canal_7 + " pessoas. O percentual de audiencia é de " + canal7_percentual + "%");
		System.out.println(
				"O canal 12 tem " + canal_12 + " pessoas. O percentual de audiencia é de " + canal12_percentual + "%");
	}
}
