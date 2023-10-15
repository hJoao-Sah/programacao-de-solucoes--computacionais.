package pratica_2;

import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Informe o segundo número: ");
		double numero2 = scanner.nextDouble();

		System.out.println("Escolha uma operação:");
		System.out.println("1 - Somar os dois números");
		System.out.println("2 - Multiplicar os dois números");
		System.out.println("3 - Subtrair o número maior pelo número menor");
		System.out.println("4 - Dividir o primeiro número pelo segundo");

		int escolha = scanner.nextInt();

		double resultado = 0;

		switch (escolha) {
		case 1:
			resultado = numero1 + numero2;
			break;
		case 2:
			resultado = numero1 * numero2;
			break;
		case 3:
			if (numero1 > numero2) {
				resultado = numero1 - numero2;
			} else if (numero2 > numero1) {
				resultado = numero2 - numero1;
			}
			break;
		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Divisão por zero não é permitida.");
				return; 
			}
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

		System.out.println("Resultado: " + resultado);

		
	}
}
