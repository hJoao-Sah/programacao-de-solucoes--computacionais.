package pratica_3;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double total_salario = 0;
		int habitantes = 4, total_filhos = 0, i = 1;
		boolean pesquisa = true;
		while (i <= habitantes) {

			System.out.println(i + "º habitante informe seu salario: ");
			double salario = input.nextDouble();

			if (salario < 0) {
				System.out.println("Salario invalido!!");
				pesquisa = false;
				break;
			}
			total_salario += salario;

			System.out.println("Informe a quantidade de filhos: ");
			int filho = input.nextInt();

			total_filhos += filho;

			i++;
		}

		double media_salarial = total_salario / habitantes;
		double media_filhos = (double) total_filhos / habitantes;

		if (pesquisa) {
			System.out.println("Média salarial da população: R$" + media_salarial + " reais");
			System.out.println("Média de filho da população: " + media_filhos);
		}
	}

}
