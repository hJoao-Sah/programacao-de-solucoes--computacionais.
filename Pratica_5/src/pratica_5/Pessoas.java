package pratica_5;

import java.util.Scanner;

public class Pessoas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total_Pessoas = 10;
		int Feminino_Idade = 0;

		for (int i = 1; i <= total_Pessoas; i++) {
			System.out.println("Informe o sexo (M)asculino, (F)eminino): ");
			char sexo = input.next().charAt(0);

			System.out.println("Informe a idade: ");
			int idade = input.nextInt();

			if (sexo == 'F' || sexo == 'f' && idade >= 20 && idade <= 40) {
				Feminino_Idade++;
			}
		}

		System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + Feminino_Idade);
	}
}
