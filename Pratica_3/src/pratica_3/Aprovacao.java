package pratica_3;

import java.util.Scanner;

public class Aprovacao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int alunos = 4, i = 1, matricula = 0;

		System.out.println("Informe sua matricula: ");
		matricula = input.nextInt();

		while (i < alunos) {
			if (matricula < 0) {
				System.out.println("A matricula informada é negativa, gentileza informar novamente.");
				break;
			}
			System.out.println(i + "º aluno informe sua nota: ");
			double nota = input.nextInt();

			if (nota >= 70) {
				System.out.println(i + "º aluno foi aprovado!");
			}
			if (nota > 60 && nota < 70) {
				System.out.println(i + "º aluno esta de recuperação!");
			}
			if (nota < 60) {
				System.out.println(i + "º aluno foi reprovado!");
			}

			i++;
		}

	}

}
