package pratica_4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota, salario;
		char sexo;
		int idade;

		do {
			System.out.print("Informe a nota (entre 0 e 10): ");
			nota = input.nextDouble();
		} while (nota < 0 || nota > 10);

		do {
			System.out.print("Informe o salário (maior que zero): ");
			salario = input.nextDouble();
		} while (salario <= 0);

		do {
			System.out.print("Informe o sexo (m ou f): ");
			sexo = input.next().charAt(0);
		} while (sexo != 'm' && sexo != 'f');

		do {
			System.out.print("Informe a idade (entre 0 e 120): ");
			idade = input.nextInt();
		} while (idade < 0 || idade > 120);

		System.out.println("Dados informados corretamente. Mensagem de sucesso!");
	}
}
