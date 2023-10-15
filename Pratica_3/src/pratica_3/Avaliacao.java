package pratica_3;

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int alunos_90 = 0, alunos_reprovados = 0, i = 1, aluno = 3;
		double soma_notas = 0, maior_nota = 0, menor_nota = 100;

		while (i <= aluno) {
			System.out.println(i + "- aluno informe a sua nota: ");
			double nota = input.nextDouble();
			if (nota < 0) {
				System.out.println("Informamos que o usuário informou uma nota negativa, gentileza digitar novamente.");
				break;
			}
			System.out.println(i + "- aluno informe a quantidade de faltas: ");
			int faltas = input.nextInt();

			soma_notas += nota;

			if (nota >= 90) {
				alunos_90++;
			}
			if (nota < 70 || faltas > 20) {
				alunos_reprovados++;
			}
			if (nota > maior_nota) {
				maior_nota = nota;
			}
			if (nota <= menor_nota) {
				menor_nota = nota;
			}

			i++;

		}
		if (soma_notas > 0) {
			double media = soma_notas / aluno;
			System.out.println("Quantidade de aluno(s) com nota final maior que 90 pontos: " + alunos_90);
			System.out.println("Quantidade de aluno(s) foram reprovados: " + alunos_reprovados);
			System.out.println("A maior nota foi " + maior_nota);
			System.out.println("A menor nota foi " + menor_nota);
			System.out.println("A média de nota foi " + media);
		}
	}
}
