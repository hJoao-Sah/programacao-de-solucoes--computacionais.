package pratica_5;

import java.util.Scanner;
import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total_Pessoas = 3, total_fem = 0, total_masc = 0;

		for (int i = 1; i <= total_Pessoas; i++) {
			System.out.println("Informe o sexo (M)asculino, (F)eminino): ");
			char sexo = input.next().charAt(0);

			System.out.println("Informe seu peso: ");
			int peso = input.nextInt();
			
			if (sexo == 'M' || sexo == 'm' && peso >= 60 && peso <= 80) {
				total_masc++;
			}
			if (sexo == 'F' || sexo == 'f' && peso >= 50 && peso <= 70) {
				total_fem++;
			}
		}

		System.out.println("Quantidade de homens com 60 a 80 KG: " + total_masc);
		System.out.println("Quantidade de mulheres com 50 a 70 KG: " + total_fem);
	}

}
